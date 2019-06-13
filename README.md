# gRPC REST APIs

This looks at how to create REST APIs documented with gRPC protocol buffer `.proto` files.

## Tutorial
1. Write a `.proto` file defining the API and service.
2. Install `protoc` and `grpc-gateway` plugin tools.
3. Auto-generate Swagger API docs using
```
protoc -I/usr/local/include -I. \
  -I$GOPATH/src \
  -I$GOPATH/src/github.com/grpc-ecosystem/grpc-gateway/third_party/googleapis \
  --swagger_out=logtostderr=true:. \
  portfolio.proto
```
4. Auto-generate client/server stubs in language of choice (Go)

This is for Golang:
```
protoc -I/usr/local/include -I. \
  -I$GOPATH/src \
  -I$GOPATH/src/github.com/grpc-ecosystem/grpc-gateway/third_party/googleapis \
  --go_out=plugins=grpc:. \
  portfolio.proto
```

This is for Java:
```
protoc -I/usr/local/include -I. \
    -I$GOPATH/src \
    -I$GOPATH/src/github.com/grpc-ecosystem/grpc-gateway/third_party/googleapis \
    --java_out=. \
    portfolio.proto

protoc -I/usr/local/include -I. \
    -I$GOPATH/src \
    -I$GOPATH/src/github.com/grpc-ecosystem/grpc-gateway/third_party/googleapis \
    --plugin=protoc-gen-grpc=grpc_java_plugin \
    --grpc-java_out=. \
    portfolio.proto
```

5. Auto-generate HTTP-gRPC reverse proxy gateway
```
protoc -I/usr/local/include -I. \
  -I$GOPATH/src \
  -I$GOPATH/src/github.com/grpc-ecosystem/grpc-gateway/third_party/googleapis \
  --grpc-gateway_out=logtostderr=true:. \
  portfolio.proto
```