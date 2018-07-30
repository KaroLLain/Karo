package com.kodilla.good.patterns.challenges.store;

public class User {

    private String name;
    private String surname;
    private String userName;
    private String emailAdress;
    private int phoneNumber;

    public User(String name, String surname, String userName, String emailAdress, int phoneNumber) {
        this.name = name;
        this.surname = surname;
        this.userName = userName;
        this.emailAdress = emailAdress;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }
    public String getSurname() {
        return surname;
    }
    public String getUserName() {
        return userName;
    }
    public String getEmailAdress(){
        return emailAdress;
    }
    public int getPhoneNumber(){
        return phoneNumber;
    }
}
