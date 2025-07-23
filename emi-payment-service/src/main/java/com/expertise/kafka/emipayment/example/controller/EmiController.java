package com.expertise.kafka.emipayment.example.controller;

import com.expertise.kafka.emipayment.example.service.EmiServiceI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmiController {

    @Autowired
    private EmiServiceI emiServiceI;

}
