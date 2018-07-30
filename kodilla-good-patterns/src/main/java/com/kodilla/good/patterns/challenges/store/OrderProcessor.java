package com.kodilla.good.patterns.challenges.store;

public class OrderProcessor {

    private InformationService informationService;
    private ProductOrderRepo productOrderRepo;
    private ProductOrderExecutor productOrderExecutor;


    public OrderProcessor(ProductOrderRepo productOrderRepo,
                          ProductOrderExecutor productOrderExecutor,
                          InformationService informationService) {
        this.informationService = informationService;
        this.productOrderRepo = productOrderRepo;
        this.productOrderExecutor = productOrderExecutor;
    }

    public ProductOrderDTO process(OrderRequest orderRequest){
        boolean isSold = productOrderExecutor.isSold(orderRequest.getUser(),
                orderRequest.getOrderDate() ,
                orderRequest.getItem() ,
                orderRequest.getQuantity() );
        if(isSold){
            productOrderRepo.newProductOrder(orderRequest.getUser(),
                    orderRequest.getOrderDate(),
                    orderRequest.getItem(),
                    orderRequest.getQuantity());
            informationService.inform(orderRequest.getUser());
            return new ProductOrderDTO(orderRequest.getUser(),
                    orderRequest.getOrderDate(),
                    orderRequest.getItem(),
                    orderRequest.getQuantity(), true);
        }else{
            return new ProductOrderDTO(orderRequest.getUser(),
                    orderRequest.getOrderDate(),
                    orderRequest.getItem(),
                    orderRequest.getQuantity(), false);

        }
    }
}
