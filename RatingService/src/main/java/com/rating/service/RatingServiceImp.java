package com.rating.service;

import com.rating.model.Ratings;
import com.rating.repository.RatingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
public class RatingServiceImp implements RatingService {

    @Autowired
    private RatingRepository ratingRepository;

    @Override
    public Ratings savingRating(Ratings ratings) {
        return ratingRepository.save(ratings);
    }

    @Override
    public List<Ratings> getAllRating() {
        return this.ratingRepository.findAll();
    }

    @Override
    public List<Ratings> getRatingsByUserId(String userId) {
        return this.ratingRepository.findByUserId(userId);
    }

    @Override
    public List<Ratings> getRatingsByHotelId(String hotelId) {
        return this.ratingRepository.findByHotelId(hotelId);
    }
}
