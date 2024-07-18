package com.paccy.movies.services;

import com.paccy.movies.documents.Movie;
import com.paccy.movies.repositories.MovieRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class MovieService {

    private final MovieRepository movieRepository;

    public List<Movie> getAllMovies(){
        return  movieRepository.findAll();
    }
}

