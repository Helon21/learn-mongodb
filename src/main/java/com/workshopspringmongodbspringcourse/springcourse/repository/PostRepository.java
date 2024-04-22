package com.workshopspringmongodbspringcourse.springcourse.repository;

import com.workshopspringmongodbspringcourse.springcourse.domain.Post;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostRepository extends MongoRepository<Post, String> {
}
