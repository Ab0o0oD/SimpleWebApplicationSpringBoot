package com.coursera.SimpleWebApplication;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

import java.util.Arrays;

@SpringBootApplication
public class SimpleWebApplication {

    public static void main(String[] args) {
        SpringApplication.run( SimpleWebApplication.class, args );
    }

    @Bean
    public CommandLineRunner commandLineRunner(ApplicationContext ctx) {
        return args -> {
            System.out.println( "let's inspect the beans" );

            String[] beansName = ctx.getBeanDefinitionNames();

            Arrays.sort( beansName );

            for (String beanName : beansName) {
                System.out.println( beanName );
            }
        };
    }
}



/*In Spring, the objects that form the backbone of your application and
 that are managed by the Spring IoC container (Inversion Of Control) are called beans.
A bean is an object that is instantiated, assembled, and otherwise managed by a Spring IoC container.
 Otherwise, a bean is simply one of many objects in your application.*/

/*CommandLineRunner interface. CommandLineRunner is a simple Spring Boot interface with a run method.
Spring Boot will automatically call the run method of all beans implementing this interface after
the application context has been loaded.*/