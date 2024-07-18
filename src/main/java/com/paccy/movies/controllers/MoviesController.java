package com.paccy.movies.controllers;

import com.paccy.movies.documents.Movie;
import com.paccy.movies.services.MovieService;
import lombok.RequiredArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1/movies")
@RequiredArgsConstructor
public class MoviesController {

    private final MovieService movieService;
    @GetMapping
    public ResponseEntity<List<Movie>> allMovies(){
        return  ResponseEntity.ok(movieService.getAllMovies());
    }

    @GetMapping("/{imdbId}")
    public ResponseEntity<Optional<Movie>> getMovieById(@PathVariable String imdbId){
        System.out.println("Fetching movie with IMDb ID: " + imdbId);
        return  ResponseEntity.ok(movieService.getMovieByImdbId(imdbId));
    }
}
