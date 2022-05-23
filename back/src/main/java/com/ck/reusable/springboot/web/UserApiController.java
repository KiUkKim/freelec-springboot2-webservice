package com.ck.reusable.springboot.web;

import com.ck.reusable.springboot.domain.ErrorMessage.errorMessage;
import com.ck.reusable.springboot.domain.user.User;
import com.ck.reusable.springboot.service.user.UserService;
import com.ck.reusable.springboot.web.dto.UserDto;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.BeanUtils;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.util.Assert;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;


@RequiredArgsConstructor
@RestController
public class UserApiController {
    private final UserService userService;

    // 회원가입 요청시 중복된 결과 있을 경우 409(conflict) status code 사용.
//    @PostMapping("/auth/signUp")
//    @ResponseBody
//    public Object userSignUp(@RequestBody UserDto.ForUserDto userDto)
//    {
//
//    }
}
