package dev.sandeep.PaymentService.repository;

import dev.sandeep.PaymentService.entity.Payment;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface PaymentRepository extends JpaRepository<Payment, UUID> {

}
