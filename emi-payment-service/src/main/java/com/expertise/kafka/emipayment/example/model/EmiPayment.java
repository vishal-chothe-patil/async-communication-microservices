package com.expertise.kafka.emipayment.example.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class EmiPayment {

    private Long paymentId;
    private String customerId;
    private Double amount;
    private String loanAccountNo;
    private LocalDateTime paymentDate;
    private String status; // SUCCESS / FAILED

}
