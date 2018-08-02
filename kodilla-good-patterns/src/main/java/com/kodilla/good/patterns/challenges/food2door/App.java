package com.kodilla.good.patterns.challenges.food2door;

public class App {

    public static void main (String []args){

        OrderRetriever orderRequest = new OrderRetriever();
        ExtraFoodShop extraFoodShop = new ExtraFoodShop();

        extraFoodShop.process(orderRequest.orderRetrieve());


    }
}
