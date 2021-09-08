package com.example.Bank.controllers;

import com.example.Bank.models.CreditCard;
import com.example.Bank.repositories.CreditCardRepository;
import com.example.Bank.repositories.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class CreditCardController {

    CreditCardRepository creditCardRepository;

    @Autowired
    CreditCardController(CreditCardRepository creditCardRepository){
        this.creditCardRepository = creditCardRepository;
    }

    public void AddCreditCard(CreditCard creditCard){
        creditCardRepository.save(creditCard);
    }

    public CreditCard getCreditCard(int CustomerId){
        return creditCardRepository.findByCustomerId(CustomerId);
    }




}
