package dev.sandeep.PaymentService.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.OneToOne;

import java.util.UUID;

@Entity
public class Payment extends BaseModel {
    private double amount;
    private UUID userId;
    private UUID orderId;
    private String transactionId;
    @Enumerated(EnumType.STRING)
    private  PaymentStatus paymentStatus;
    @OneToOne
    private Currency currency;
}
