package com.eunsu.project.domain.Reviews;

import com.eunsu.project.domain.BaseTimeEntity;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Objects;

@Getter
@NoArgsConstructor
@Entity
public class Reviews extends BaseTimeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    float grade;

    @Column(nullable = false)
    int userId;

    @Column(nullable = false, length = 300)
    String contents;

    @Builder
    public Reviews (float grade, int userId, String contents){
        if(Objects.isNull(grade)) this.grade = grade;
        if(Objects.isNull(userId)) this.userId = userId;
        if(Objects.isNull(contents)) this.contents = contents;
    }

}
