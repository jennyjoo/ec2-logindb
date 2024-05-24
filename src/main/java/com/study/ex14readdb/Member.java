package com.study.ex14readdb;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;

@Entity
@Table(name="member")
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Member {

    //BIGINT 는 Long이에요
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    @Column(name = "user_id")
    private  String userId;
    @Column(name = "user_pw")
    private String userPw;
    @Column(name = "user_name")
    private String userName;
    @Column(name = "user_role")
    private String userRole;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @Column(name = "join_date")
    private LocalDate joinDate;
}
