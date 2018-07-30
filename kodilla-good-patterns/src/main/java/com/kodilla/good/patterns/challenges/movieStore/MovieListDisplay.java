package com.kodilla.good.patterns.challenges.movieStore;

import com.kodilla.good.patterns.challenges.movieStore.MovieStore;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public final class MovieListDisplay{

    public static void main(String[]args){

        MovieStore movieStore = new MovieStore();
        Map<String,List<String>> showMovies = movieStore.getMovies();

        final String movieList = showMovies.entrySet().stream()
                .flatMap(m->m.getValue().stream())
                .collect(Collectors.joining("!"));

        System.out.println(movieList);
    }
}
