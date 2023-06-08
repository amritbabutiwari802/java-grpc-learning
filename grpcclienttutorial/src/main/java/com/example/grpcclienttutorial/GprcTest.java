package com.example.grpcclienttutorial;

import com.example.grpcservertutorial.grpc.HelloRequest;
import com.example.grpcservertutorial.grpc.HelloResponse;
import com.example.grpcservertutorial.grpc.HelloWorldGrpc;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

public class GprcTest {
    public static void run(){
        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 8080)
                .usePlaintext()
                .build();
        HelloWorldGrpc.HelloWorldBlockingStub stub = HelloWorldGrpc.newBlockingStub(channel);
        HelloResponse response = stub.hello(HelloRequest.newBuilder().setFirstName("Amrit Babu").setLastName("Tiwari").build());
        channel.shutdown();
        System.out.println(response.getMessage());
    }
}
