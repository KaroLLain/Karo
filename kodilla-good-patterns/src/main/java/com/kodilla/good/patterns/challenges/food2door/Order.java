package com.kodilla.good.patterns.challenges.food2door;

import java.util.Map;

public class Order {

    private Map<String, Integer> order;
    private UserSpecifics userSpecifics;

    public Order(Map<String, Integer> order, UserSpecifics userSpecifics) {
        this.order = order;
        this.userSpecifics = userSpecifics;
    }

    public Map<String, Integer> getOrder() {
        return order;
    }

    public UserSpecifics getUserSpecifics() {
        return userSpecifics;
    }
}
