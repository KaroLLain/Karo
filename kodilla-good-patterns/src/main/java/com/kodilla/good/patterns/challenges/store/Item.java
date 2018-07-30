package com.kodilla.good.patterns.challenges.store;

import java.math.BigDecimal;
import java.util.Locale;

abstract class Item {

    private String itemName;
    private String itemDescription;
    private BigDecimal itemPrice;

    public Item(String itemName, String itemDescription, BigDecimal itemPrice) {

        this.itemName = itemName;
        this.itemDescription = itemDescription;
        this.itemPrice = itemPrice;
    }

    public String getItemName() {
        return itemName;
    }

    public String getItemDescription() {
        return itemDescription;
    }

    public BigDecimal getItemPrice() {
        return itemPrice;
    }

    @Override
    public String toString() {
        return "Item{" +
                "itemName='" + itemName + '\'' +
                ", itemDescription='" + itemDescription + '\'' +
                ", itemPrice=" + itemPrice +
                '}';
    }
}
