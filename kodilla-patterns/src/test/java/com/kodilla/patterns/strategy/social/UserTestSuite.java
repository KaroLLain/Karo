package com.kodilla.patterns.strategy.social;

import org.junit.Assert;
import org.junit.Test;

public class UserTestSuite {

    @Test
    public void testDefaultSharingStrategies(){
        //Given
        User karol = new Millenials("Karol Darwin");
        User ann = new YGeneration("Ann Shirley");
        User ville = new ZGeneration("Ville Valo");
        //When
        String karolSharing = karol.sharePost();
        System.out.println("Karol Darwin share: " + karolSharing);
        String annSharing = ann.sharePost();
        System.out.println("Ann Shirley share: " + annSharing);
        String villeSharing = ville.sharePost();
        System.out.println("Ville Valo share: " + villeSharing);
        //Then
        Assert.assertEquals("Facebook", karolSharing);
        Assert.assertEquals("Twitter", annSharing);
        Assert.assertEquals("Snapchat", villeSharing);

    }

    @Test
    public void testIndividualSharingStrategy(){
        //Given
        User karol = new Millenials("Karol Darwin");
        //When
        String karolSharing = karol.sharePost();
        System.out.println("Karol Darwin share: " + karolSharing);
        karol.setSocialPublisher(new SnapchatPublisher());
        karolSharing = karol.sharePost();
        System.out.println("Karol Darwin share: " + karolSharing);
        //Then
        Assert.assertEquals("Snapchat", karolSharing);


    }
}
