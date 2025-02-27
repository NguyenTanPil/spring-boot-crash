package com.felixnguyen.Spring.boot.tutorial.repository;

import com.felixnguyen.Spring.boot.tutorial.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, String> {
    boolean existsByUsername(String userId);
}
