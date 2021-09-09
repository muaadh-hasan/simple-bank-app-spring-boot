package com.example.Bank.repositories;

import com.example.Bank.models.CreditCard;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface CreditCardRepository extends JpaRepository<CreditCard,Long> {

    CreditCard findByCustomerId(UUID id);
}
