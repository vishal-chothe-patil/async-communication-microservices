package com.expertise.kafka.emipayment.example.kafka;

import com.expertise.kafka.emipayment.example.model.EmiPayment;
import lombok.RequiredArgsConstructor;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class EmiProducer {

    private static final String TOPIC = "emi-payment-success";
    private final KafkaTemplate<String, EmiPayment> kafkaTemplate;

    public void sendEmiSuccessEvent(EmiPayment emiPayment) {
        kafkaTemplate.send(TOPIC, emiPayment.getCustomerId(), emiPayment);
    }
}
