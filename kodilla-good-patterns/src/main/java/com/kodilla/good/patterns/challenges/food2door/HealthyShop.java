package com.kodilla.good.patterns.challenges.food2door;

import java.util.HashMap;
import java.util.Map;

public class HealthyShop implements Processor {

    private Map<String, Integer> shopProducts(){

        Map<String, Integer> products = new HashMap<>();
        products.put("Fit Granola with whey protein", 15);
        products.put("Sesame", 25);
        products.put("Soy Milk", 56);
        products.put("Brown sugar", 217);

        return products;
    }

    public void process(Order order){

        for (String name : order.getOrder().keySet()) {
            if (shopProducts().containsKey(name) &&
                    (shopProducts().get(name) > order.getOrder().get(name))) {
                System.out.println("Product : " + name + " is available. Ordered quantity: " + order.getOrder().get(name));
            } else {
                System.out.println("Product: " + name + " is not available.");
            }
        }
        System.out.println("\nDelivery address: " + order.getUserSpecifics().getDeliveryAddress());

    }
}
