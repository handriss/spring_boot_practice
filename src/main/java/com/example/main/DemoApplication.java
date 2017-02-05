package com.example.main;

import com.example.services.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

import java.util.Arrays;


@ComponentScan({"com.example.main", "com.example.services"})
@SpringBootApplication
public class DemoApplication {

    @Bean
    public User user(){
        return new User("Vincent", "Vega");
    }

	public static void main(String[] args) {

        ApplicationContext ctx = SpringApplication.run(DemoApplication.class, args);

        String[] beanNames = ctx.getBeanDefinitionNames();
        Arrays.sort(beanNames);
        for(String name : beanNames){
            System.out.println(name);
        }

        System.out.println(ctx.getBean("user").toString());

	}
}
