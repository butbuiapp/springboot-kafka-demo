package miu.edu.springbootkafkademo.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class KafkaTopicConfig {
    @Value("${spring.kafka.topic-string.name}")
    private String stringTopicName;

    @Value("${spring.kafka.topic-json.name}")
    private String jsonTopicName;

    @Bean
    public NewTopic createStringTopic() {

        return TopicBuilder.name(stringTopicName).build();
    }

    @Bean
    public NewTopic createJsonTopic() {
        return TopicBuilder.name(jsonTopicName).build();
    }
}
