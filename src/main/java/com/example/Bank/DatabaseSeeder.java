package com.example.Bank;

import com.example.Bank.models.Customer;
import com.example.Bank.repositories.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class DatabaseSeeder implements CommandLineRunner {

    private CustomerRepository customerRepository;

    @Autowired
    public DatabaseSeeder(CustomerRepository customerRepository){
        this.customerRepository = customerRepository;
    }

    @Override
    public void run(String... args) throws Exception {

        List<Customer> listCustomers = new ArrayList<>();

        listCustomers.add(new Customer("Moaaz", "Giza", "Male",0));
        listCustomers.add(new Customer("Hamza", "Giza", "Male",3));
        listCustomers.add(new Customer("Sohaib", "Manial", "Male",1));
        listCustomers.add(new Customer("Doaa", "Nasser city", "Female",0));

        customerRepository.saveAll(listCustomers);

    }
}
