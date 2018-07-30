package com.kodilla.good.patterns.challenges.store;

public class MailService implements InformationService {

    private Item item;

    @Override
    public void inform(User user) {
        System.out.println("Sending an e-mail to: " + user.getEmailAdress());
        System.out.println("Dear " + user.getUserName() + ", thank you for your order! Your item will be send as soon as possible.");
    }

}
