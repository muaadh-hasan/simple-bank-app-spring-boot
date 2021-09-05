package com.example.Bank;

import com.example.Bank.models.BankTransaction;
import com.example.Bank.models.Customer;
import com.example.Bank.repositories.BankTransactionRepository;
import com.example.Bank.repositories.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class DatabaseSeeder implements CommandLineRunner {

    private CustomerRepository customerRepository;
    private BankTransactionRepository bankTransactionRepository;

    @Autowired
    public DatabaseSeeder(CustomerRepository customerRepository , BankTransactionRepository bankTransactionRepository){
        this.customerRepository = customerRepository;
        this.bankTransactionRepository = bankTransactionRepository;
    }

    @Override
    public void run(String... args) throws Exception {

        List<Customer> listCustomers = new ArrayList<>();
        List<BankTransaction> listTransactions = new ArrayList<>();

        listCustomers.add(new Customer("Moaaz", "Giza", "Male",0));
        listCustomers.add(new Customer("Hamza", "Giza", "Male",3));
        listCustomers.add(new Customer("Sohaib", "Manial", "Male",1));
        listCustomers.add(new Customer("Doaa", "Nasser city", "Female",0));

        listTransactions.add(new BankTransaction("Cash",1500));
        listTransactions.add(new BankTransaction("Credit card",2500));
        listTransactions.add(new BankTransaction("Cash",3000));
        listTransactions.add(new BankTransaction("Cash",18000));

        customerRepository.saveAll(listCustomers);
        bankTransactionRepository.saveAll(listTransactions);

    }
}
