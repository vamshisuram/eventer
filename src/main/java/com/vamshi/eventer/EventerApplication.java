package com.vamshi.eventer;

import org.apache.kafka.clients.KafkaClient;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EventerApplication {

	public static KafkaClient producer;

	public static void main(String[] args) {
		SpringApplication.run(EventerApplication.class, args);
	}

}
