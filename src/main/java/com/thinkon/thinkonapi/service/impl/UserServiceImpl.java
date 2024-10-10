package com.thinkon.thinkonapi.service.impl;

import com.thinkon.thinkonapi.model.User;
import com.thinkon.thinkonapi.repository.UserRepository;
import com.thinkon.thinkonapi.service.UserService;
import org.apache.logging.log4j.util.Strings;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public User createUser(User user) {
        return userRepository.save(user);
    }

    @Override
    public List<User> getUsers() {
        return userRepository.findAll();
    }

    @Override
    public Optional<User> getUser(long id) {
        return userRepository.findById(id);
    }

    @Override
    public User updateUser(long id, User userDetails) {
        User user = userRepository.findById(id).orElseThrow(() -> new RuntimeException("User not found!"));

        if (Strings.isNotEmpty(userDetails.getUsername())) {
            user.setUsername(userDetails.getUsername());
        }
        if (Strings.isNotEmpty(userDetails.getFirstName())) {
            user.setFirstName(userDetails.getFirstName());
        }
        if (Strings.isNotEmpty(userDetails.getLastName())) {
            user.setLastName(userDetails.getLastName());
        }
        if (Strings.isNotEmpty(userDetails.getEmail())) {
            user.setEmail(userDetails.getEmail());
        }
        if (Strings.isNotEmpty(userDetails.getPhoneNumber())) {
            user.setPhoneNumber(userDetails.getPhoneNumber());
        }
        return userRepository.save(user);
    }

    @Override
    public void deleteUser(long id) {
        userRepository.deleteById(id);
    }
}
