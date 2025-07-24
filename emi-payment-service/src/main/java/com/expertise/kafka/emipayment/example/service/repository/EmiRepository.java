package com.expertise.kafka.emipayment.example.service.repository;

import com.expertise.kafka.emipayment.example.model.EmiPayment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmiRepository extends JpaRepository<EmiPayment, Long> {

}
