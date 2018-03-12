package com.github.coyclab.discount.models;

import java.util.List;

public class Client extends AModel {
    private static Long nextID = 0L;

    private Long id;
    private int cardNumber;
    private String firstName;
    private String secondName;
    private String surname;
    private String phoneNumber;
    private String email;
    private List<Car> carList;
    private int discount;

    private Client() {
        this.id = nextID++;
        this.discount = Discount.START.getValue();
    }

    public Client(int cardNumber, String firstName, String secondName, String surname, String phoneNumber) {
        this();
        this.cardNumber = cardNumber;
        this.firstName = firstName;
        this.secondName = secondName;
        this.surname = surname;
        this.phoneNumber = phoneNumber;
    }

    public Client(int cardNumber, String firstName, String secondName, String surname, String phoneNumber, String email) {
        this();
        this.cardNumber = cardNumber;
        this.firstName = firstName;
        this.secondName = secondName;
        this.surname = surname;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    public Long getId() {
        return id;
    }

    public int getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(int cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<Car> getCarList() {
        return carList;
    }

    public void setCarList(List<Car> carList) {
        this.carList = carList;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("---------------------------\n")
                .append("№ ").append(cardNumber).append("\n")
                .append("---------------------------\n")
                .append("Имя:\t\t").append(firstName).append("\n")
                .append("Отчество:\t").append(secondName).append("\n")
                .append("Фамилия:\t").append(surname).append("\n")
                .append("Телефон:\t").append(phoneNumber).append("\n")
                .append("E-mail: \t").append(email).append("\n");
        return builder.toString();
    }

    public enum Discount {
        START(5),
        MEDIUM(7),
        VIP(10);

        public int value;

        Discount(int discount) {
            this.value = discount;
        }

        public int getValue() {
            return value;
        }

        @Override
        public String toString() {
            return Integer.valueOf(value).toString();
        }
    }
}
