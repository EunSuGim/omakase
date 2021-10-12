package com.eunsu.project.domain.Restaurants;


import com.eunsu.project.domain.Reviews.Reviews;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

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




}
