package com.eunsu.project.domain.Users;


import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Getter
@NoArgsConstructor
@Entity
public class Users
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true)
    private String email;

    @Column(nullable = false)
    private String password;

    @Column(nullable = false)
    private String nickname;

    @Column(nullable = false)
    private String address;

    @Column(nullable = false)
    private String profile;

    @Builder
    public Users(String email, String password, String nickname, String address, String profile){
        this.email = email;
        this.password = password;
        this.nickname = nickname;
        this.address = address;
        this.profile = profile;
    }


}
