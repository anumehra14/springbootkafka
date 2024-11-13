package com.spring_kafka.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class UserProducerService {
    @Autowired 
	private   KafkaTemplate<String, Integer> kafkaTemplate  ;
    
   
	    
	    public void sendMessage(String name,int age) {
	        kafkaTemplate.send("my-topic", name,age); // Replace "my-topic" with your actual Kafka topic
	        System.out.println("********"+ name ); 
	    }
}
