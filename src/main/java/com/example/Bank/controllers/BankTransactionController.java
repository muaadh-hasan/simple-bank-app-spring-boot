package com.example.Bank.controllers;

import com.example.Bank.models.BankTransaction;
import com.example.Bank.repositories.BankTransactionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

@RestController
@RequestMapping(value = "/transactions")
@CrossOrigin
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

        bankTransaction.setDate(LocalDate.now());
        bankTransactionRepository.save(bankTransaction);
        return bankTransactionRepository.findAll();
    }


}
