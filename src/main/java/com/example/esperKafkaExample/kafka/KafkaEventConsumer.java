package com.example.esperKafkaExample.kafka;

import com.espertech.esperio.kafka.EsperIOKafkaInputSubscriber;
import com.espertech.esperio.kafka.EsperIOKafkaInputSubscriberContext;
import com.example.esperKafkaExample.config.KafkaConfig;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Arrays;

public class KafkaEventConsumer implements EsperIOKafkaInputSubscriber {

    private static final Logger log = LoggerFactory.getLogger(KafkaEventConsumer.class);

    @Override
    public void subscribe(EsperIOKafkaInputSubscriberContext context) {
        log.info("Subscribing to topics {}", KafkaConfig.INPUT_TOPICS.toString());
        context.getConsumer().subscribe(Arrays.asList(KafkaConfig.INPUT_TOPICS));
    }
}
