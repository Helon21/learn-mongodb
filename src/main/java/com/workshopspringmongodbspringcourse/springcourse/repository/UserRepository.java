package com.workshopspringmongodbspringcourse.springcourse.repository;

import com.workshopspringmongodbspringcourse.springcourse.domain.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;


public interface UserRepository extends MongoRepository<User, String> {

}
