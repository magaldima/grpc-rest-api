package main

import (
	"context"
	"flag"
	"log"

	"golang.org/x/oauth2"
	"google.golang.org/grpc"
	"google.golang.org/grpc/credentials"
	"google.golang.org/grpc/credentials/oauth"
	"google.golang.org/grpc/testdata"

	pb "github.com/magaldima/grpc-rest-api"
)

var (
	tls                = flag.Bool("tls", false, "Connection uses TLS if true, else plain TCP")
	caFile             = flag.String("ca_file", "", "The file containning the CA root cert file")
	serverAddr         = flag.String("server_addr", "127.0.0.1:10000", "The server address in the format of host:port")
	serverHostOverride = flag.String("server_host_override", "x.test.youtube.com", "The server name use to verify the hostname returned by TLS handshake")
	jwtTokenFile       = flag.String("jwt_token_file", "~/.aw/credentials", "The filepath which JWT OAuth token resides")
)

func main() {
	flag.Parse()
	var opts []grpc.DialOption
	if *tls {
		if *caFile == "" {
			*caFile = testdata.Path("ca.pem")
		}
		creds, err := credentials.NewClientTLSFromFile(*caFile, *serverHostOverride)
		if err != nil {
			log.Fatalf("Failed to create TLS credentials %v", err)
		}
		opts = append(opts, grpc.WithTransportCredentials(creds))
	} else {
		opts = append(opts, grpc.WithInsecure())
	}

	perRPC := oauth.NewOauthAccess(fetchToken())
	opts = append(opts, grpc.WithPerRPCCredentials(perRPC))

	conn, err := grpc.Dial(*serverAddr, opts...)
	if err != nil {
		log.Fatalf("fail to dial: %v", err)
	}
	defer conn.Close()
	client := pb.NewPortfolioServiceClient(conn)

	portfolio, err := client.Create(context.Background(), &pb.Portfolio{
		Id:       "a",
		Currency: "USD",
		Positions: []*pb.Position{
			&pb.Position{
				Id:      "a",
				AssetId: "CUSIP1",
			},
		},
	})
	if err != nil {
		log.Fatalf("failed to create new portfolio %v", err)
	}
	log.Printf("created new portfolio %v", portfolio)
}

// fetchToken simulates a token lookup and omits the details of proper token
// acquisition. For examples of how to acquire an OAuth2 token, see:
// https://godoc.org/golang.org/x/oauth2
func fetchToken() *oauth2.Token {
	return &oauth2.Token{
		AccessToken: "some-secret-token",
	}
}
