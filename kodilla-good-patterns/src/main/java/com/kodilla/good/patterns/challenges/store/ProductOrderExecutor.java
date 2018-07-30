package com.kodilla.good.patterns.challenges.store;

import java.time.LocalDateTime;

public class ProductOrderExecutor {

    public boolean isSold(User user, LocalDateTime saleDate, Item item, int quantity){

        System.out.println("Dear, " + user.getUserName() + " you've just ordered " + item.getItemName() + "\n"
                + "Order from: " + saleDate.toString() + "\n" + "Items quantity: " + quantity + "\n" +
                    "Thank you! We invite you again!");

        return true;
    }
}
