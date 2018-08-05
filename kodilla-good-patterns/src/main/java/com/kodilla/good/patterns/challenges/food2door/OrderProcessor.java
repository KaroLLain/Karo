package com.kodilla.good.patterns.challenges.food2door;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class OrderProcessor {

    public void processOrder(List<Processor> shops, Order order){

        Map<String, Processor> productMap = new HashMap<>();
        for (Processor process: shops) {
            for (String productName: process.products()) {
                productMap.put(productName, process);
            }
        }
        for (Map.Entry<String, Integer> e : order.getOrder().entrySet()) {
            productMap.get(e.getKey()).process(e.getKey(), e.getValue(), order.getUserSpecifics());
        }
    }
}
