package com.kodilla.good.patterns.challenges.food2door;

import com.kodilla.good.patterns.challenges.store.User;

import java.util.HashMap;
import java.util.Map;

public class ExtraFoodShop implements Processor {

    private Map<String, Integer> shopProducts(){

        Map<String, Integer> products = new HashMap<>();
        products.put("Peanut Butter", 86);
        products.put("Agave syrup", 43);
        products.put("Almonds", 219);
        products.put("Almond flour", 85);

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
