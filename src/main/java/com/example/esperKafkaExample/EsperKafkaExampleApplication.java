package com.example.esperKafkaExample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EsperKafkaExampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(EsperKafkaExampleApplication.class, args);
		new EsperMain().run();
	}

}
