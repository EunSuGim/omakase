package com.eunsu.project.domain.Restaurant;


import com.eunsu.project.domain.Review.Review;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Objects;

@Getter
@NoArgsConstructor
@Entity
public class Restaurant {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private int numbering;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String address;

    @Column(nullable = true)
    private String tellNumber;

    @Column(nullable = true)
    private boolean parking;

    @Column(nullable = false)
    private String scale;

    @Column(nullable = true)
    private String holiday;

    @Column(nullable = true)
    private String openingDay;

    @Column
    private String openingHour;

    @ManyToOne
    @JoinColumn
    private Review reviewsId;


    @Builder
    public Restaurant(int numbering, String name, String address, String tellNumber, boolean parking, String scale,
                      String holiday, String openingDay, String openingHour, Review reviewsId){
        if(!Objects.isNull(numbering)) this.numbering = numbering;
        if(!Objects.isNull(name)) this.name = name;
        if(!Objects.isNull(address)) this.address = address;
        if(!Objects.isNull(scale)) this.scale =scale;
        this.tellNumber = tellNumber;
        this.parking = parking;
        this.holiday = holiday;
        this.openingDay = openingDay;
        this.openingHour = openingHour;
        this.reviewsId = reviewsId;

    }



}