package com.expertise.kafka.emipayment.example.service.impl;


import com.expertise.kafka.emipayment.example.kafka.EmiProducer;
import com.expertise.kafka.emipayment.example.model.EmiPayment;
import com.expertise.kafka.emipayment.example.service.EmiServiceI;
import com.expertise.kafka.emipayment.example.service.repository.EmiRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class EmiServiceImpl implements EmiServiceI {

    private final EmiProducer emiProducer;
    private final EmiRepository emiRepository;

    @Override
    public void processEmiPayment(EmiPayment emiPayment) {
        emiPayment.setPaymentId(UUID.randomUUID().getMostSignificantBits() & Long.MAX_VALUE);
        emiPayment.setPaymentDate(LocalDateTime.now());
        emiPayment.setStatus("SUCCESS");

        emiRepository.save(emiPayment);             // Save to DB
        emiProducer.sendEmiSuccessEvent(emiPayment); // Send to Kafka
    }
}
