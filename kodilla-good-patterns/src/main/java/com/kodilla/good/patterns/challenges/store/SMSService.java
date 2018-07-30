package com.kodilla.good.patterns.challenges.store;

public class SMSService implements InformationService{

    @Override
    public void inform(User user) {
        System.out.println(" ");
        System.out.println("Sending an SMS to: " + user.getPhoneNumber() + "\n" +
                "Dear " + user.getUserName() + ", thank you for your order! Your item will be send as soon as possible.");
    }
}
