package com.shop.puppyPet.web.login;

import com.shop.puppyPet.domain.admin.service.AdminService;
import com.shop.puppyPet.domain.member.service.MemberService;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
//@RequiredArgsConstructor
public class LoginController {

//    private final BCryptPasswordEncoder bCryptPasswordEncoder;

//    private final AdminService AdminServiceImpl;
//    private final MemberService MemberServiceImpl;

    @GetMapping("/login")
    public String login(){

        return "login";
    }

    @GetMapping("join")
    public String join(){

        return "join";
    }


}
