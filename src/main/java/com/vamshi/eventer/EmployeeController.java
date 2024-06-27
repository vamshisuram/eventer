package com.vamshi.eventer;     // Inside controller package!

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;

@RestController
public class EmployeeController {

    @Autowired
    private KafkaProducerService producerService;

    private static final Logger log = LoggerFactory.getLogger(EmployeeController.class);

    // Requests on this route are handled
    @GetMapping("/")
    public void getAllEmployees() {
        log.info("Request to get all employees");
        producerService.sendMessage("Request came and being sent to Kafka");
    }
}