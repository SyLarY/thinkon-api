package com.thinkon.thinkonapi.repository;

import com.thinkon.thinkonapi.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
