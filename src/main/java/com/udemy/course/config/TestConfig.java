package com.udemy.course.config;

import com.udemy.course.entities.User;
import com.udemy.course.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.util.Arrays;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {


    @Autowired
    private UserRepository userRepository;


    @Override
    public void run(String... args) throws Exception {

        User u1 = new User(null,"Maria Brown","maria@gmail.com","977777777","12345");
        User u2 = new User(null,"Alex green","alex@gmail.com","977777777","12345");

        userRepository.saveAll(Arrays.asList(u1,u2));


    }
}
