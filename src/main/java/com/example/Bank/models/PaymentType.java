package com.example.Bank.models;

public class PaymentType {
     private TypeOfPayment type;
     private int cash;
     private CreditCard credit_card;

    public PaymentType(TypeOfPayment creditCard, Integer o, CreditCard visa) {
    }



    public PaymentType(TypeOfPayment type, int cash, CreditCard credit_card) {
        this.type = type;
        this.cash = cash;
        this.credit_card = credit_card;
    }

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

    public CreditCard getCredit_card() {
        return credit_card;
    }

    public void setCredit_card(CreditCard credit_card) {
        this.credit_card = credit_card;
    }
}
