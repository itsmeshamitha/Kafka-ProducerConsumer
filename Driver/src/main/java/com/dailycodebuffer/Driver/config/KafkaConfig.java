package com.dailycodebuffer.Driver.config;

import com.dailycodebuffer.Driver.constant.AppConstant;
import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class KafkaConfig {


    @Bean
    public NewTopic topic()
    {
        return TopicBuilder
                .name(AppConstant.CAB_LOCATION)
                .build();
    }
}

/*@Configuration Annotation:
This annotation indicates that the class KafkaConfig is a configuration class.
In Spring, configuration classes are used to define beans and other configuration settings.


@Bean Annotation:
This annotation is used on a method to indicate that it returns a bean to be managed by the Spring container.

public NewTopic topic() Method:
This method is annotated with @Bean, meaning it will produce a bean that will be managed by the Spring container.
The method returns an instance of NewTopic, which is a Kafka topic

TopicBuilder.name(AppConstant.CAB_LOCATION).build():
TopicBuilder is a utility provided by Spring Kafka to build Kafka topics.
.name(AppConstant.CAB_LOCATION) sets the name of the topic. AppConstant.CAB_LOCATION
is a constant that holds the name of the Kafka topic. This constant is likely defined in another class named AppConstant.
.build() finalizes the creation of the NewTopic instance with the specified name.

NewTopic
NewTopic is a class from the Apache Kafka client library. It is used to represent a Kafka topic
including its name, number of partitions, and replication factor.
*/

