package com.eialid.movieinfoservice.controllers;

import com.eialid.movieinfoservice.models.ExternalMovieDBWrapper;
import com.eialid.movieinfoservice.models.Movie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/movies")
public class MovieInfoService {

    @Autowired
    private RestTemplate restTemplate;

    @Value("${api.key}")
    private String apiKey;

    @RequestMapping("/{movieId}")
    public Movie getMovieInfo(@PathVariable("movieId") String movieId){
//        ExternalMovieDBWrapper externalMovieDBWrapper=restTemplate.getForObject("https://api.themoviedb.org/3/movie/" + movieId + "?api_key=" +  apiKey, ExternalMovieDBWrapper.class);
        return new Movie(movieId,"SpiderMan: No Way Home", "good movie");
        //        return new Movie(id,"SpiderMan: No Way Home");
    }
}
