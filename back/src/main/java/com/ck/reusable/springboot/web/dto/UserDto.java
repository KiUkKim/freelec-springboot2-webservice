package com.ck.reusable.springboot.web.dto;

import com.ck.reusable.springboot.domain.user.User;
import com.ck.reusable.springboot.domain.user.UserInfo;
import com.mysql.cj.protocol.x.Notice;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;

// 클라이언트에서 전달하는 데이터를 담는 객체

public class UserDto {

    @Getter
    @Setter
    @NoArgsConstructor
    public static class ForUserDto{
        private String name;
        private String email;
        private String tel;
        private String passwd;

        @Builder
        public ForUserDto(String name, String email, String tel, String passwd){
            this.name = name;
            this.email = email;
            this.tel = tel;
            this.passwd = passwd;
        }

        public User toEntity(){
            return User.builder()
                    .name(name)
                    .email(email)
                    .tel(tel)
                    .passwd(passwd)
                    .build();
        }
    }

}
