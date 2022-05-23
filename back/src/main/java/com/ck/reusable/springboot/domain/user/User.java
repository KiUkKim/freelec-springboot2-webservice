package com.ck.reusable.springboot.domain.user;

import com.ck.reusable.springboot.domain.BaseTimeEntity;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.mysql.cj.protocol.x.Notice;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Getter
@NoArgsConstructor
@Entity
@Table(name="Mebmer")
public class User extends BaseTimeEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long member_seq;

    /*
    {
        "name" : "최지문",
        "passwd" : "12121",
        "email" : "z@naver.com",
        "tel" : "010-0000-0000"
    }
     */

    @Column(name = "name", columnDefinition = "TEXT")
    private String name;

    @Column(nullable = false)
    private String email;

    @Column(nullable = false, columnDefinition = "TEXT")
    private String tel;

    @Column(nullable = false, columnDefinition = "TEXT")
    private String passwd;

//    @Column(name = "", columnDefinition = "TEXT")
//    private String accessToken;
//
//    @Embedded
//    private UserInfo userInfo;

//    @JsonManagedReference
//    @OneToMany(cascade = CascadeType.ALL, mappedBy = "user", orphanRemoval = true)
//    private List<Notice>  noticeList = new ArrayList<>();
//
//    @JsonManagedReference
//    @OneToMany(cascade = CascadeType.ALL, mappedBy = "user", orphanRemoval = true)
//    private List<CollectInfo> collectInfoListForUser = new ArrayList<>();

    @Builder
    public User(String name, String email, String tel, String passwd){
        this.name = name;
        this.email = email;
        this.tel = tel;
        this.passwd = passwd;
    }

}
