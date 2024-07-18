package com.paccy.movies.services;

import com.paccy.movies.documents.Review;
import com.paccy.movies.repositories.ReviewRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ReviewService {


    private final ReviewRepository reviewRepository;


    public Review createReview(String reviewBody,String imdbId){
        Review review= new Review(reviewBody);
       reviewRepository.insert(review);
    }
}
