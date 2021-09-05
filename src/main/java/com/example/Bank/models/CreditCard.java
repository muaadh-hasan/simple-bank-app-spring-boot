package com.example.Bank.models;

import java.time.LocalDate;

public class CreditCard {
    int cardNumber;
    String nameOfCard;
    LocalDate date;
    String securityCode;

    public CreditCard() {
    }

    public CreditCard(int cardNumber, String nameOfCard,  String securityCode) {
        this.cardNumber = cardNumber;
        this.nameOfCard = nameOfCard;
        this.date = LocalDate.now();
        this.securityCode = securityCode;
    }

    public int getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(int cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String getNameOfCard() {
        return nameOfCard;
    }

    public void setNameOfCard(String nameOfCard) {
        this.nameOfCard = nameOfCard;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getSecurityCode() {
        return securityCode;
    }

    public void setSecurityCode(String securityCode) {
        this.securityCode = securityCode;
    }
}
