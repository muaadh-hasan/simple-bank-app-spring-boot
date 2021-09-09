package com.example.Bank.models;


import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "bankTransaction")
public class BankTransaction {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private TypeOfPayment type;
    private int amount;

    private LocalDate date;

    public BankTransaction() {
    }

    public BankTransaction(TypeOfPayment type, int amount) {
        this.type = type;
        this.amount = amount;
        this.date = LocalDate.now();

    }

    public BankTransaction(TypeOfPayment type, int amount, LocalDate date) {
        this.type = type;
        this.amount = amount;
        this.date = date;
    }

    public BankTransaction(Long id, TypeOfPayment type, int amount, LocalDate date) {
        this.id = id;
        this.type = type;
        this.amount = amount;
        this.date = date;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public TypeOfPayment getType() {
        return type;
    }

    public void setType(TypeOfPayment type) {
        this.type = type;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Transaction{" +
                "id=" + id +
                ", type='" + type + '\'' +
                ", amount=" + amount +
                ", date=" + date +
                '}';
    }
}
