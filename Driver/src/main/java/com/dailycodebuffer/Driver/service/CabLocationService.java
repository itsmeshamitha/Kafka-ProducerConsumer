package com.dailycodebuffer.Driver.service;

import com.dailycodebuffer.Driver.constant.AppConstant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class CabLocationService {

    @Autowired
    private KafkaTemplate<String,Object>kafkaTemplate;

    public boolean updateLocation(String location) {
        kafkaTemplate.send(AppConstant.CAB_LOCATION,location);
        return true;
    }
}
/*
The CabLocationService class is a part of a Spring Boot application. Its main job is to send cab location data to a Kafka topic. Kafka is a messaging system that allows different parts of an application to communicate with each other by sending messages.

Detailed Breakdown
@Service Annotation:

What it does: Tells Spring that this class is a service. Services contain business logic.
Why it's used: So Spring can automatically create an instance of this class and manage it.
CabLocationService Class:

What it does: This is the class where we define the methods to update cab locations.
Why it's used: To organize the code related to cab location updates in one place.
@Autowired Annotation:

What it does: Tells Spring to automatically inject the KafkaTemplate object into this class.
Why it's used: So we don't have to manually create an instance of KafkaTemplate. Spring does it for us.
KafkaTemplate<String, Object> kafkaTemplate:

What it is: A tool provided by Spring to send messages to Kafka.
Why it's used: To send cab location data to a Kafka topic.
updateLocation(String location) Method:

What it does: Sends the cab location data to a Kafka topic.
How it works:
Input: Takes a location string as input.
Action: Uses kafkaTemplate.send(AppConstant.CAB_LOCATION, location) to send the location data to a Kafka topic named AppConstant.CAB_LOCATION.
Output: Returns true to indicate that the operation was successful.
Simplified Explanation
Imagine you have a service that needs to update the location of cabs in real-time. Here's how it works:

Service Class: You have a class called CabLocationService that handles this task.
KafkaTemplate: This is like a messenger that sends the location data to a central system (Kafka).
updateLocation Method:
Takes Location Data: The method takes the location data as input.
Sends Data to Kafka: It uses the KafkaTemplate to send this data to a Kafka topic.
Returns Success: It returns true to indicate that the data was successfully sent.
*/
