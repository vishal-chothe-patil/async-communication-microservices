package com.expertise.kafka.emipayment.example.controller;

import com.expertise.kafka.emipayment.example.model.EmiPayment;
import com.expertise.kafka.emipayment.example.service.EmiServiceI;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/emi")
@RequiredArgsConstructor
public class EmiController {

    private final EmiServiceI emiService;

    @PostMapping("/pay")
    public ResponseEntity<String> makePayment(@RequestBody EmiPayment emiPayment) {
        emiService.processEmiPayment(emiPayment);
        return ResponseEntity.ok("EMI Payment processed successfully");
    }
}
