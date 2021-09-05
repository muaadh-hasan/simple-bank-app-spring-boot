package com.example.Bank;

import com.example.Bank.models.BankTransaction;
import com.example.Bank.models.CreditCard;
import com.example.Bank.models.Customer;
import com.example.Bank.models.Payment;
import com.example.Bank.repositories.BankTransactionRepository;
import com.example.Bank.repositories.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

import static com.example.Bank.models.Gender.Female;
import static com.example.Bank.models.Gender.Male;
import static com.example.Bank.models.TypeOfPayment.CASH;
import static com.example.Bank.models.TypeOfPayment.CREDIT_CARD;

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

        listCustomers.add(new Customer("Moaaz", "Giza", Male,0));
        listCustomers.add(new Customer("Hamza", "Giza", Male,3));
        listCustomers.add(new Customer("Sohaib", "Manial", Male,1));
        listCustomers.add(new Customer("Doaa", "Nasser city",Female,0));

        Payment cash = new Payment(1,CASH ,1500 , -1 );
        Payment Credit = new Payment(2,CREDIT_CARD ,-1,2);

        listTransactions.add(new BankTransaction(cash,1500));
        listTransactions.add(new BankTransaction(Credit,2500));
        listTransactions.add(new BankTransaction(cash,3000));
        listTransactions.add(new BankTransaction(cash,18000));

        customerRepository.saveAll(listCustomers);
        bankTransactionRepository.saveAll(listTransactions);
    }
}
