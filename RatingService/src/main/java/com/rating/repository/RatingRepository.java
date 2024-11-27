package com.rating.repository;

import com.rating.model.Ratings;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.SpringDataMongoDB;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface RatingRepository extends MongoRepository<Ratings, String> {


    //custom finder methods

    List<Ratings> findByUserId(String userId);

    List<Ratings> findByHotelId(String userId);
}
