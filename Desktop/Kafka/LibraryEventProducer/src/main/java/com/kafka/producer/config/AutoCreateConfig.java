package com.kafka.producer.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
@Profile("local")
/*
 * Generally creating TOPIC using java code is not recommended, most of the organization has Kafka 
 * Team who manages Kafka Cluster
 */
public class AutoCreateConfig {

	@Bean
	public NewTopic createNewTopic() {
		return TopicBuilder.name("library-events")
					.partitions(4)
					.replicas(1)
					.build();
	}
}
