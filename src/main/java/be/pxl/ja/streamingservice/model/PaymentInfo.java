package be.pxl.ja.streamingservice.model;

import java.time.LocalDate;

public class PaymentInfo {
    private String cardNumber;
    private CreditCardType type;
    private String firstName;
    private String lastName;
    private LocalDate expirationDate;
    private int securityCode;

    public PaymentInfo() {}

    public PaymentInfo(String cardNumber, CreditCardType type, String firstName, String lastName, LocalDate expirationDate, int securityCode) {
        setCardNumer(cardNumber);
        setType(type);
        setFirstName(firstName);
        setLastName(lastName);
        setExpirationDate(expirationDate);
        setSecurityCode(securityCode);
    }

    public String getCardNumer() {
        return this.cardNumber;
    }

    public void setCardNumer(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public CreditCardType getType() {
        return this.type;
    }

    public void setType(CreditCardType type) {
        this.type = type;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public LocalDate getExpirationDate() {
        return this.expirationDate;
    }

    public void setExpirationDate(LocalDate expirationDate) {
        this.expirationDate = expirationDate;
    }

    public int getSecurityCode() {
        return this.securityCode;
    }

    public void setSecurityCode(int securityCode) {
        this.securityCode = securityCode;
    }
}
