package com.library.lib.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.library.lib.entities.User;

public interface UserRepository extends JpaRepository<User,Long> {
    
}
