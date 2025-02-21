package com.dailycodebuffer.User.service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class LocationServiceListner {

    @KafkaListener(topics = "cab-location",groupId = "user-group")
    public void cabLocation(String location)
    {
        System.out.println(location);
    }

}
