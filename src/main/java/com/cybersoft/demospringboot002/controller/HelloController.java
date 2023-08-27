package com.cybersoft.demospringboot002.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Annotation : Địng nghĩa đường dẫn
 * @Controller : Địng nghĩa đường dẫn được dùng để trả ra nội dung html
 * @ResponseBody : Trả nội dung kiểu String
 * @RestController : Địng nghĩa đường dẫn, nội dung trả về String (API) chuyên dùng viết API
 *
 *
 */


// /hello , /hello/cybersoft
@RestController
@RequestMapping("/hello")
public class HelloController {

    @GetMapping("")
    public String hello(){
        return "Hello Spring Boot";
    }

    @GetMapping("/cybersoft")
    public String helloCybersoft(){
        return "Hello Cybersoft";
    }

}
