package com.example.Bank.controllers;

import com.example.Bank.repositories.PaymentRepository;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;


@RestController
@CrossOrigin
public class PaymentController {

    PaymentRepository paymentRepository;

    PaymentController(PaymentRepository paymentRepository){
        this.paymentRepository = paymentRepository;
    }






}
