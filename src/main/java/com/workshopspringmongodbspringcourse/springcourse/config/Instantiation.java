package com.workshopspringmongodbspringcourse.springcourse.config;

import com.workshopspringmongodbspringcourse.springcourse.domain.Post;
import com.workshopspringmongodbspringcourse.springcourse.domain.User;
import com.workshopspringmongodbspringcourse.springcourse.dto.AuthorDTO;
import com.workshopspringmongodbspringcourse.springcourse.repository.PostRepository;
import com.workshopspringmongodbspringcourse.springcourse.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Arrays;
import java.util.TimeZone;

@Configuration
public class Instantiation implements CommandLineRunner {

    @Autowired
    private UserRepository userRepository;
    @Autowired
    private PostRepository postRepository;

    @Override
    public void run(String... args) throws Exception {

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        sdf.setTimeZone(TimeZone.getTimeZone("GMT"));

        userRepository.deleteAll();
        postRepository.deleteAll();

        User helena = new User(null, "Helena", "helena@gmail.com");
        User helen = new User(null, "Helen", "helen@gmail.com");
        User heloisa = new User(null, "Heloisa", "heloisa@hotmail.com");

        userRepository.saveAll(Arrays.asList(helena, heloisa, helen));

        Post post1 = new Post(null, sdf.parse("21/03/2018"), new AuthorDTO(helen), "Irei para alemanha", "Estou indo para alemanha, em busca das catedrais e das alemanszinhas fuiz");
        Post post2 = new Post(null, sdf.parse("25/03/2018"), new AuthorDTO(heloisa), "Irei para suíça", "Estou indo para suíça, em busca das paisagens verdes e do dinheiro");


        postRepository.saveAll(Arrays.asList(post1, post2));
    }
}
