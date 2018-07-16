/*
@author: Arun Dhwaj
@date: 15th Jul, 2018
@purpose: HelloController API
*/

package hello;

/* 
import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.web.bind.annotation.*;
*/

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;


//@EnableAutoConfiguration
@RestController
public class HelloController 
{
    @RequestMapping("/")
    public String index() 
    {
        return "Spring Boot First Application !!! ";
    }
}

