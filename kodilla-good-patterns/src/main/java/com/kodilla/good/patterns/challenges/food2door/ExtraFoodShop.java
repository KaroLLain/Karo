package com.kodilla.good.patterns.challenges.food2door;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class ExtraFoodShop implements Processor {

    private Map<String, Integer> shopProducts(){

        Map<String, Integer> products = new HashMap<>();
        products.put("Peanut Butter", 86);
        products.put("Agave syrup", 43);
        products.put("Almonds", 219);
        products.put("Almond flour", 85);

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
