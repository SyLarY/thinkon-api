package com.thinkon.thinkonapi.service;

import com.thinkon.thinkonapi.model.User;
import java.util.List;
import java.util.Optional;

public interface UserService {
    User createUser(User user);
    List<User> getUsers();
    Optional<User> getUser(long id);
    User updateUser(long id, User userDetails);
    void deleteUser(long id);
}
