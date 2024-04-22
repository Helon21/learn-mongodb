package com.workshopspringmongodbspringcourse.springcourse.service;

import com.workshopspringmongodbspringcourse.springcourse.domain.User;
import com.workshopspringmongodbspringcourse.springcourse.dto.UserDTO;
import com.workshopspringmongodbspringcourse.springcourse.repository.UserRepository;
import com.workshopspringmongodbspringcourse.springcourse.service.exceptions.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public List<User> findAll() {
        return userRepository.findAll();
    }

    public User findById(String id) {
        return userRepository.findById(id).orElseThrow(() -> new ObjectNotFoundException("User not found"));
    }

    public User insert(User obj) {
        return userRepository.insert(obj);
    }

    public User update(User obj) {
        User newObj = userRepository.findById(obj.getId()).orElseThrow(() -> new ObjectNotFoundException("User not found to update"));
        updateData(newObj, obj);
        return userRepository.save(newObj);
    }

    public void delete(String id) {
        userRepository.deleteById(id);
    }

    public User fromDTO(UserDTO objDTO) {
        return new User(objDTO.getId(), objDTO.getName(), objDTO.getEmail());
    }

    private void updateData(User newObj, User obj) {
        newObj.setName(obj.getName());
        newObj.setEmail(obj.getEmail());
    }

}
