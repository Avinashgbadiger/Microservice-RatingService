package com.rating.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.io.Serial;
import java.io.Serializable;
import java.util.UUID;

@Document(collection = "ratings")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Ratings implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    @Id
    private String ratingId;

    private String userId;

    private String hotelId;

    private int rating;

    private String feedback;


}
