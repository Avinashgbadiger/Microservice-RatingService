package com.rating.controller;

import com.rating.model.Ratings;
import com.rating.service.RatingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ratings")
public class RatingController {

    @Autowired
    private RatingService ratingService;

    @PostMapping("/save-rating")
    public ResponseEntity<?> creatingRating(@RequestBody Ratings ratings) {
        Ratings ratings1 = this.ratingService.savingRating(ratings);
        return new ResponseEntity<>(ratings1, HttpStatus.CREATED);
    }

    @GetMapping("/all-ratings")
    public ResponseEntity<?> getAllRatings() {
        List<Ratings> allRating = this.ratingService.getAllRating();
        return new ResponseEntity<>(allRating, HttpStatus.FOUND);

    }

    @GetMapping("/all-ratings/user/{userId}")
    public ResponseEntity<?> getRatingsByUserId(@PathVariable String userId) {
        List<Ratings> allRating = this.ratingService.getRatingsByUserId(userId);
        return new ResponseEntity<>(allRating, HttpStatus.FOUND);

    }

    @GetMapping("/all-ratings/hotel/{hotelId}")
    public ResponseEntity<?> getRatingsByHotelId(@PathVariable String hotelId) {
        List<Ratings> allRating = this.ratingService.getRatingsByHotelId(hotelId);
        return new ResponseEntity<>(allRating, HttpStatus.FOUND);

    }
}
