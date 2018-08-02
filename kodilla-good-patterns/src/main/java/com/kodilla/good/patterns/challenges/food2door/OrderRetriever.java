package com.kodilla.good.patterns.challenges.food2door;

import java.util.HashMap;
import java.util.Map;

public class OrderRetriever {

    public Order orderRetrieve() {

        UserSpecifics userSpecifics = new UserSpecifics("Adam", "Lloyd",
                "ul.Chmielowska 64/4, 53-150 Białówka", 669558665);

        Map<String, Integer> orderedItems = new HashMap<>();

        orderedItems.put("Almond flour", 3);
        orderedItems.put("Soy Milk", 1);
        orderedItems.put("Agave syrup", 1);

        return new Order(orderedItems, userSpecifics);
    }

}

