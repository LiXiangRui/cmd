package com.xiangrui;
import org.springframework.web.bind.annotation.RequestMapping;
import  org.springframework.web.bind.annotation.RestController;

/**
 * hello
 *
 */
@RestController
public class HelloController {
@RequestMapping("/hello")
    public String say(){
    return "hello world!hello java";
}

}
