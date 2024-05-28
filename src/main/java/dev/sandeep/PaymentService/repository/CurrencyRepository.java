package dev.sandeep.PaymentService.repository;

import dev.sandeep.PaymentService.entity.Currency;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface CurrencyRepository extends JpaRepository<Currency, UUID> {
}
