/*
@author: Arun Dhwaj
@date: 15th Jul, 2018
@purpose: SpringBootApplication 
*/

package hello;

import java.util.Arrays;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;


import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.web.bind.annotation.*;


@SpringBootApplication
@EnableAutoConfiguration
public class Application
{
    public static void main( String[] args) 
    {
        SpringApplication.run( Application.class, args);
    }

    
    @Bean
    public CommandLineRunner commandLineRunner( ApplicationContext ctx) 
    {
        return args -> {
            System.out.println("#########################################################################");
            System.out.println("#########################################################################");
            System.out.println("Following are the list of beans provided by Spring Boot: ");
            System.out.println("#########################################################################");
            System.out.println("#########################################################################");

            String[] beanNames = ctx.getBeanDefinitionNames();
            Arrays.sort(beanNames);
            int i = 1; 
            for( String beanName : beanNames) 
            {
                System.out.println(i + ": " + beanName);
                i++;
            }
        };
    }

}
