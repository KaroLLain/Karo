package com.kodilla.good.patterns.challenges.store;

public class App {

    public static void main(String[]args){

        ProductOrderRequestRetriever productOrderRequestRetriever = new ProductOrderRequestRetriever();
        OrderRequest orderRequest = productOrderRequestRetriever.retrieve();

        OrderProcessor orderProcessor = new OrderProcessor(new ProductOrderRepo(), new ProductOrderExecutor(), new SMSService());
        orderProcessor.process(orderRequest);
    }
}
