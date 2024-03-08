package com.example.ec2bbs.domain;

import com.example.ec2bbs.domain.member.MemberService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class HomeController {

    private final MemberService memberService;

    @GetMapping("/hello")
    public String home() {
        return "Hello World!";
    }
}
