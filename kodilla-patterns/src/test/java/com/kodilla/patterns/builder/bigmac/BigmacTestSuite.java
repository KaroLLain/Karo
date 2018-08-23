package com.kodilla.patterns.builder.bigmac;


import org.junit.Assert;
import org.junit.Test;

public class BigmacTestSuite {
    @Test
    public void testBuilder(){
        //Given
        Bigmac bigmac = new Bigmac.BigmacBuilder()
                .bun("With sesame.")
                .burgers(4)
                .sauce("Hot")
                .ingredient("Onion")
                .ingredient("Olives")
                .ingredient("Mustard")
                .build();
        System.out.println(bigmac);
        //When
        int howManyIngredients = bigmac.getIngredients().size();
        //Then
        Assert.assertEquals(3, howManyIngredients);
    }
}
