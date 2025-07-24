package com.expertise.kafka.emipayment.example.service;

import com.expertise.kafka.emipayment.example.model.EmiPayment;

public interface EmiServiceI {

    void processEmiPayment(EmiPayment emiPayment);

}
