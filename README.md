# spring-boot-microservices example ⚡🔗⚙️

## Description: emi-notification & txn-report-services 📋

This microservices project demonstrates asynchronous (event-driven) communication using Apache Kafka in a fintech system. It includes two independent use cases implemented via Spring Boot REST APIs, Kafka integration, and background processing.

---


## Key Features

- Kafka-based async messaging
- Clean separation of producer and consumer microservices
- Real fintech use cases: payments & reporting
- Decoupled, resilient, and scalable design
- Easy to extend (e.g., add audit/logging consumers)

---

## Use Cases

### 1️⃣ EMI Payment - Notification Service
- `emi-payment-service`: Accepts EMI payments and publishes events to Kafka (`emi-payment-success` topic).
- `notification-service`: Listens for events and sends real-time alerts to users asynchronously (SMS/email/push).

### 2️⃣ Transaction - Report Generator Service
- `transaction-service`: Sends report generation requests to Kafka (`generate-report` topic).
- `report-generator-service`: Listens for events and generates downloadable CSV/PDF reports in the background.
