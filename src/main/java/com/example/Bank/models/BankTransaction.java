package com.example.Bank.models;


import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "bankTransaction")
public class BankTransaction {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String type;
    private int amount;
    private Date date;

    public BankTransaction() {
    }

    public BankTransaction(String type, int amount) {
        this.type = type;
        this.amount = amount;
    }

    public BankTransaction(String type, int amount, Date date) {
        this.type = type;
        this.amount = amount;
        this.date = date;
    }

    public BankTransaction(Long id, String type, int amount, Date date) {
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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
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
