package com.example.pama.controller;

import com.example.pama.entity.Member;
import com.example.pama.entity.RoleType;
import com.example.pama.repository.MemberRepository;
import com.example.pama.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MemberController {
    @Autowired
    private MemberService memberService;


    @GetMapping("/login")
    public String login(Model model) {
        return "loginForm";
    }
    @GetMapping("/joinForm")
    public String joinForm(Model model) {
        return "joinForm";
    }

    @PostMapping("/join")
    public String join(Member member){
        System.out.println(member);
        memberService.save(member);
        return "redirect:/loginForm";
    }
}
