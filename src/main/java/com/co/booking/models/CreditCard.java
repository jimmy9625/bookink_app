package com.co.booking.models;

public class CreditCard {
    private String cardNumber;
    private String expirationDate;
    private String holderName;


    public CreditCard(String cardNumber, String expirationDate, String CCV) {
        this.cardNumber = cardNumber;
        this.expirationDate = expirationDate;
        this.holderName = CCV;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(String expirationDate) {
        this.expirationDate = expirationDate;
    }

    public String getHolderName() {
        return holderName;
    }

    public void setHolderName(String holderName) {
        this.holderName = holderName;
    }
}
