package soa;

import java.text.ParseException;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringJpaApplication {

    public static void main(String[] args) throws ParseException {
        ApplicationContext context = SpringApplication.run(SpringJpaApplication.class, args);

        // Display a message upon application startup
        System.out.println("Spring Boot application started successfully!");
    }


}
