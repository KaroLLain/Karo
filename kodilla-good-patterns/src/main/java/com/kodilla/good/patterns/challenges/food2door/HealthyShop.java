package com.kodilla.good.patterns.challenges.food2door;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HealthyShop implements Processor {

    private Map<String, Integer> shopProducts(){

        Map<String, Integer> products = new HashMap<>();
        products.put("Fit Granola with whey protein", 15);
        products.put("Sesame", 25);
        products.put("Soy Milk", 56);
        products.put("Brown sugar", 217);

        return products;
    }

    @Override
    public Set<String> products() {
        return shopProducts().keySet();
    }
    public void process(String productName, int quantity, UserSpecifics userSpecifics){

        if (shopProducts().containsKey(productName) &&
                (shopProducts().get(productName) > quantity)) {
            System.out.println("Product : " + productName + " is available. Ordered quantity: " + quantity);
        } else {
            System.out.println("Product: " + productName + " is not available.");
        }

        System.out.println("\nDelivery address: " + userSpecifics.getDeliveryAddress());

    }
}
