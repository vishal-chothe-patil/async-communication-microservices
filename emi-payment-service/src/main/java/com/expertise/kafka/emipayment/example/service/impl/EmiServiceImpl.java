package com.expertise.kafka.emipayment.example.service.impl;

import com.expertise.kafka.emipayment.example.kafka.EmiProducer;
import com.expertise.kafka.emipayment.example.service.EmiServiceI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmiServiceImpl implements EmiServiceI {

    @Autowired
    private EmiProducer emiProducer;

}
