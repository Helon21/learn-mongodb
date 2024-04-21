package com.workshopspringmongodbspringcourse.springcourse.config;

import com.workshopspringmongodbspringcourse.springcourse.domain.User;
import com.workshopspringmongodbspringcourse.springcourse.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;

@Configuration
public class Instantiation implements CommandLineRunner {

    @Autowired
    private UserRepository userRepository;

    @Override
    public void run(String... args) throws Exception {

        userRepository.deleteAll();

        User helena = new User(null, "Helena", "helena@gmail.com");
        User helen = new User(null, "Helen", "helen@gmail.com");
        User heloisa = new User(null, "Heloisa", "heloisa@hotmail.com");

        userRepository.saveAll(Arrays.asList(helena, heloisa, helen));
    }
}
