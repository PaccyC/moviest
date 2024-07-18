package com.paccy.movies.services;

import com.paccy.movies.documents.Movie;
import com.paccy.movies.repositories.MovieRepository;
import lombok.RequiredArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class MovieService {

    private final MovieRepository movieRepository;

    public List<Movie> getAllMovies(){
        return  movieRepository.findAll();
    }

    public Optional<Movie> getMovieByImdbId(String imdbId){
        return  movieRepository.findMovieByImdbid(imdbId);
    }
}

