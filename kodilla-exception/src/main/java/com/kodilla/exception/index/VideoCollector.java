package com.kodilla.exception.index;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;

public class VideoCollector {

    public List<String> getCollection(){

        AbstractList<String > videos = new ArrayList<>();
        videos.add("Extra movie");

        return videos;

        }
}
