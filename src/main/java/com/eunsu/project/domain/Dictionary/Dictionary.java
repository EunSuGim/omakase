package com.eunsu.project.domain.Dictionary;

import com.eunsu.project.domain.BaseTimeEntity;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Objects;


@Getter
@NoArgsConstructor
@Entity
public class Dictionary extends BaseTimeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String term;

    @Column(nullable = false)
    private String explan;

    @Column(nullable = false)
    private String desc;

    @Column(nullable = false)
    private String url;

    @Builder
    public Dictionary(String term, String explan, String desc, String url){
        if(Objects.isNull(term)) this.term = term;
        if(Objects.isNull(explan)) this.explan = explan;
        if(Objects.isNull(desc)) this.desc = desc;
        if(Objects.isNull(url)) this.url = url;
    }

}
