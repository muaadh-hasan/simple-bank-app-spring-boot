package com.example.Bank.controllers;

import com.example.Bank.models.BankTransaction;
import com.example.Bank.repositories.BankTransactionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.List;

@RestController
@RequestMapping(value = "/transactions")
public class BankTransactionController {

    BankTransactionRepository bankTransactionRepository;

    @Autowired
    public BankTransactionController(BankTransactionRepository bankTransactionRepository){
        this.bankTransactionRepository = bankTransactionRepository;
    }

    @RequestMapping(value = "/all")
    public List<BankTransaction> allTransaction(){
        return bankTransactionRepository.findAll();
    }

    @RequestMapping(value = "/add" , method = RequestMethod.POST)
    public List<BankTransaction> addTransaction(@RequestBody BankTransaction bankTransaction){

        bankTransaction.setDate(new Date());

        bankTransactionRepository.save(bankTransaction);

        return bankTransactionRepository.findAll();
    }


}
