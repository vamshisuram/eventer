package com.vamshi.eventer;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumerService {

    @KafkaListener(topics = "requests", groupId = "my_group")
    public void listen(String message) {
        System.out.println("Received Messasge: " + message);
    }
}