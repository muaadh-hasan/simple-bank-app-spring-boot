package com.example.Bank.controllers;

import com.example.Bank.models.CreditCard;
import com.example.Bank.repositories.CreditCardRepository;
import com.example.Bank.repositories.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@CrossOrigin
@RequestMapping(value = "/CreditCard")
public class CreditCardController {

    CreditCardRepository creditCardRepository;

    @Autowired
    CreditCardController(CreditCardRepository creditCardRepository){
        this.creditCardRepository = creditCardRepository;
    }

    @RequestMapping(value = "/add" ,method = RequestMethod.POST)
    public void AddCreditCard(@RequestBody CreditCard creditCard){
        creditCardRepository.save(creditCard);
    }

    @GetMapping("/byCustomerId/{id}")
    public CreditCard getCreditCard(@PathVariable String CustomerId){
        return creditCardRepository.findByCustomerId(UUID.fromString(CustomerId));
    }




}
