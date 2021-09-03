package com.example.Bank.controllers;

import com.example.Bank.models.Customer;
import com.example.Bank.repositories.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value = "/customers")
public class CustomerController {

    CustomerRepository customerRepository;

    @Autowired
    CustomerController(CustomerRepository customerRepository){
        this.customerRepository = customerRepository;
    }

    @RequestMapping(value = "/all")
    public List<Customer> getAllCustomers(){
        return customerRepository.findAll();
    }

    @RequestMapping(value = "/add" , method = RequestMethod.POST)
    public List<Customer> addCustomers(@RequestBody Customer customer){
        customerRepository.save(customer);
        return customerRepository.findAll();
    }



}
