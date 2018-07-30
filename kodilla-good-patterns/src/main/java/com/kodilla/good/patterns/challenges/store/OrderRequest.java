package com.kodilla.good.patterns.challenges.store;

import java.time.LocalDateTime;

public class OrderRequest {

    private User user;
    private LocalDateTime orderDate;
    private Item item;
    private int quantity;

    public OrderRequest(User user, LocalDateTime orderDate, Item item, int quantity) {
        this.user = user;
        this.orderDate = orderDate;
        this.item = item;
        this.quantity = quantity;
    }

    public User getUser() {
        return user;
    }

    public LocalDateTime getOrderDate() {
        return orderDate;
    }

    public Item getItem() {
        return item;
    }

    public int getQuantity() {
        return quantity;
    }
}
