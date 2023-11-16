package com.medihub.medihub.service;

import com.medihub.medihub.entity.User;
import com.medihub.medihub.repository.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class UserService {
    private UserRepository userRepository;

    public void save(User user){
        userRepository.save(user);
    }
}
