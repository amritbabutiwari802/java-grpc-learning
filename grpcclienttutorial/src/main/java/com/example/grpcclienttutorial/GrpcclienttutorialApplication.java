package com.example.grpcclienttutorial;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GrpcclienttutorialApplication {

	public static void main(String[] args) {
		SpringApplication.run(GrpcclienttutorialApplication.class, args);
		GprcTest.run();
	}

}
