package com.eunsu.project.domain.Restaurants;


import com.eunsu.project.domain.Reviews.Reviews;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Objects;

@Getter
@NoArgsConstructor
@Entity
public class Restaurants {
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
    private Reviews reviewsId;


    @Builder
    public Restaurants(int numbering, String name, String address, String tellNumber, boolean parking, String scale,
                       String holiday, String openingDay, String openingHour, Reviews reviewsId){
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
