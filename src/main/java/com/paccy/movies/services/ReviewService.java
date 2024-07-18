package com.paccy.movies.services;

import com.paccy.movies.documents.Movie;
import com.paccy.movies.documents.Review;
import com.paccy.movies.repositories.ReviewRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ReviewService {


    private final ReviewRepository reviewRepository;
    private final MongoTemplate mongoTemplate;


    public Review createReview(String reviewBody,String imdbId){
        Review review= new Review(reviewBody);
       reviewRepository.insert(review);
       mongoTemplate.update(Movie.class)
               .matching(Criteria.where("imdbIs").is(imdbId))
               .apply(new Update().push("reviewIds").value(review));

    }
}
