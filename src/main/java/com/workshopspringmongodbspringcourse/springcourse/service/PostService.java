package com.workshopspringmongodbspringcourse.springcourse.service;

import com.workshopspringmongodbspringcourse.springcourse.domain.Post;
import com.workshopspringmongodbspringcourse.springcourse.domain.User;
import com.workshopspringmongodbspringcourse.springcourse.repository.PostRepository;
import com.workshopspringmongodbspringcourse.springcourse.service.exceptions.EntityNotFoundException;
import com.workshopspringmongodbspringcourse.springcourse.service.exceptions.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PostService {

    @Autowired
    private PostRepository postRepository;

    public Post findById(String id) {
        return postRepository.findById(id).orElseThrow(() -> new EntityNotFoundException("Post não encontrado"));
    }

}
