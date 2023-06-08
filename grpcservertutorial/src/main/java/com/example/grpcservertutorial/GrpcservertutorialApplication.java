package com.example.grpcservertutorial;

import com.example.grpcservertutorial.grpcServer.HelloWorldImpl;
import io.grpc.Server;
import io.grpc.ServerBuilder;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.IOException;

@SpringBootApplication(scanBasePackages = "com.example.grpcservertutorial")
public class GrpcservertutorialApplication {

	public static void main(String[] args) throws IOException,InterruptedException {
		SpringApplication.run(GrpcservertutorialApplication.class, args);
		Server server = ServerBuilder
				.forPort(8080)
				.addService(new HelloWorldImpl()).build();

		server.start();
		server.awaitTermination();
	}

}
