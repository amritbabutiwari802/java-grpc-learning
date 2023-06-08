package com.example.grpcservertutorial.grpcServer;

import com.example.grpcservertutorial.grpc.HelloRequest;
import com.example.grpcservertutorial.grpc.HelloResponse;
import com.example.grpcservertutorial.grpc.HelloWorldGrpc;
import io.grpc.stub.StreamObserver;
import net.devh.boot.grpc.server.service.GrpcService;

@GrpcService
public class HelloWorldImpl extends HelloWorldGrpc.HelloWorldImplBase {
    @Override
    public void hello(HelloRequest request, StreamObserver<HelloResponse> responseObserver) {
        String message = new StringBuilder().append("hello ").append(request.getFirstName()).append(" ").append(request.getLastName()).toString();
        HelloResponse helloResponse = HelloResponse.newBuilder().setMessage(message).build();
        responseObserver.onNext(helloResponse);
        responseObserver.onCompleted();
    }
}
