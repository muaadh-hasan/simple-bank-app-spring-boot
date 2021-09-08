package com.example.Bank.models;

import javax.persistence.*;

@Entity
@Table(name = "Payment")
public class Payment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;


    private TypeOfPayment type;
    private int cash;
    private int creditCardId;

    public Payment() {
    }

    public Payment(int customerId, TypeOfPayment type, int cash, int creditCardId) {
//        this.customerId = customerId;
        this.type = type;
        this.cash = cash;
        this.creditCardId = creditCardId;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

//    public int getCustomerId() {
//        return customerId;
//    }

//    public void setCustomerId(int customerId) {
//        this.customerId = customerId;
//    }

    public TypeOfPayment getType() {
        return type;
    }

    public void setType(TypeOfPayment type) {
        this.type = type;
    }

    public int getCash() {
        return cash;
    }

    public void setCash(int cash) {
        this.cash = cash;
    }

    public int getCreditCardId() {
        return creditCardId;
    }

    public void setCreditCardId(int creditCardId) {
        this.creditCardId = creditCardId;
    }
}
