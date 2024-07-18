package com.paccy.movies.controllers;

import com.paccy.movies.documents.Movie;
import com.paccy.movies.services.MovieService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/movies")
@RequiredArgsConstructor
public class MoviesController {

    private final MovieService movieService;
    @GetMapping
    public ResponseEntity<List<Movie>> allMovies(){
        return  ResponseEntity.ok(movieService.getAllMovies());
    }
}
