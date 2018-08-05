package com.kodilla.good.patterns.challenges.food2door;

import java.util.Set;

public interface Processor {

    Set<String> products();

    void process(String productName, int quantity, UserSpecifics userSpecifics);
}
