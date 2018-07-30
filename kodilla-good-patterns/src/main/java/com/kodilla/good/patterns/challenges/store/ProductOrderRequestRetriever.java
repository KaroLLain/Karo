package com.kodilla.good.patterns.challenges.store;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class ProductOrderRequestRetriever {

    public OrderRequest retrieve() {

        User user = new User("Adam", "Black",
                "Black Jesus",
                "blackjesus@gmail.com",
                785621512);
        LocalDateTime orderDate = LocalDateTime.of(2018, 7, 30, 12, 23);
        Item item = new CategoryKitchen("Ceramic plates",
                "100% ceramic, flower paintings, handcrafted, 12 pieces set.",
                new BigDecimal(49.55));
        int quantity = 1;

        return new OrderRequest(user, orderDate, item, quantity);
    }
}
