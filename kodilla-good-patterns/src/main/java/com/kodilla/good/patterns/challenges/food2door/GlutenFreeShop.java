package com.kodilla.good.patterns.challenges.food2door;

import java.util.HashMap;
import java.util.Map;

public class GlutenFreeShop implements Processor{

    private Map<String, Integer> shopProducts(){

        Map<String, Integer> products = new HashMap<>();
        products.put("Erythritol", 20);
        products.put("Chickpea flour", 41);
        products.put("Gluten free chocolate biscuits", 12);
        products.put("Raw bar", 115);

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
