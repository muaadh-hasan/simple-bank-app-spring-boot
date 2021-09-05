package com.example.Bank.models;


import javax.persistence.*;

@Entity
@Table(name = "Customer")
public class Customer {



    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String name;
    private String address;
    private Gender gender;
    private int numberOfTransaction;

    public Customer() {
    }

    public Customer(long id, String name, String address, Gender gender, int numberOfTransaction) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.gender = gender;
        this.numberOfTransaction = numberOfTransaction;
    }

    public Customer(String name, String address, Gender gender, int numberOfTransaction) {
        this.name = name;
        this.address = address;
        this.gender = gender;
        this.numberOfTransaction = numberOfTransaction;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public int getNumberOfTransaction() {
        return numberOfTransaction;
    }

    public void setNumberOfTransaction(int numberOfTransaction) {
        this.numberOfTransaction = numberOfTransaction;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", gender='" + gender + '\'' +
                ", numberOfTransaction=" + numberOfTransaction +
                '}';
    }
}
