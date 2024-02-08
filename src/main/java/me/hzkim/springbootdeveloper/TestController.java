package me.hzkim.springbootdeveloper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TestController {
    //@GetMapping("/test")
    //public String test() {
    //    return "Hello, World";
    //}

    @Autowired
    TestService testService;

    @GetMapping("/test")
    public List<Member> getAllMembers(){
        List<Member> members    =   testService.getAllMembers();
        return members;
    }
}