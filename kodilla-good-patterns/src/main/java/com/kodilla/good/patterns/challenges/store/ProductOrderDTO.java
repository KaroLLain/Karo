package com.kodilla.good.patterns.challenges.store;

import java.time.LocalDateTime;

public class ProductOrderDTO {

    private User user;
    private LocalDateTime orderDate;
    private Item item;
    private int quantity;
    private boolean isItemSold;

    public ProductOrderDTO(final User user, LocalDateTime orderDate, Item item, int quantity, boolean isItemSold) {
        this.user = user;
        this.orderDate = orderDate;
        this.item = item;
        this.quantity = quantity;
        this.isItemSold = isItemSold;
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

    public boolean isItemSold() {
            return true;
        }

}
