package com.kodilla.good.patterns.challenges.food2door;

import java.util.ArrayList;
import java.util.List;

public class App {

    public static void main (String []args){

        OrderRetriever orderRequest = new OrderRetriever();
        ExtraFoodShop extraFoodShop = new ExtraFoodShop();
        GlutenFreeShop glutenFreeShop = new GlutenFreeShop();
        HealthyShop healthyShop = new HealthyShop();

        List<Processor> shops = new ArrayList<>();
        shops.add(extraFoodShop);
        shops.add(glutenFreeShop);
        shops.add(healthyShop);

        OrderProcessor orderProcessor = new OrderProcessor();
        orderProcessor.processOrder(shops, orderRequest.orderRetrieve());


    }
}
