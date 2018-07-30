package com.kodilla.good.patterns.challenges.store;

import java.time.LocalDateTime;

public class ProductOrderRepo {

    public boolean newProductOrder(User user, LocalDateTime orderDate, Item item, int quantity){
        System.out.println(" ");
        System.out.println("Dear, " + user.getUserName() + " you've just bought " + item.getItemName() +
                "Description: " + item.getItemDescription() + "\n"
        + "Order from: " + orderDate.toString() + "\n" + "Items quantity: " + quantity);

        return true;
    }
}
