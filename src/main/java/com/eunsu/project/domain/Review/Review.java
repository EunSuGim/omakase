package com.eunsu.project.domain.Review;

import com.eunsu.project.domain.BaseTimeEntity;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Objects;

@Getter
@NoArgsConstructor
@Entity
public class Review extends BaseTimeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    float grade;

    @Column(nullable = false, length = 300)
    String contents;

    @Builder
    public Review(float grade, int userId, String contents){
        if(Objects.isNull(grade)) this.grade = grade;
        if(Objects.isNull(contents)) this.contents = contents;
    }

}
