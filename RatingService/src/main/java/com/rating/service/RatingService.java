package com.rating.service;

import com.rating.model.Ratings;

import java.util.List;

public interface RatingService {

    Ratings savingRating(Ratings ratings);

    //get all ratings
    List<Ratings> getAllRating();

    //Get all ratings by UserId

    List<Ratings> getRatingsByUserId(String userId);

    List<Ratings> getRatingsByHotelId(String hotelId);
}
