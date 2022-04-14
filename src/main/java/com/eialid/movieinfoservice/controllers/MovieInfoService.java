package com.eialid.movieinfoservice.controllers;

import com.eialid.movieinfoservice.models.Movie;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/movies")
public class MovieInfoService {

    @RequestMapping("/{movieId}")
    public Movie getMovieInfo(@PathVariable("movieId") int id){
        return new Movie(id,"SpiderMan: No Way Home");
    }
}
