package com.study.ex14readdb;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
@RequiredArgsConstructor
public class MainController {

    private final MemberRepository memberRepository;

    @GetMapping("/")
    public String main(Model model){
        List<Member> list = memberRepository.findAll();
        model.addAttribute("list", list);

        long count = memberRepository.count();
        System.out.println("COUNT: " + count);

        System.out.println("SIZE : " + list.size());
        return "index";
    }
}
