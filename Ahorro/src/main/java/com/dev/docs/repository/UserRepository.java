package com.dev.docs.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dev.docs.model.User;

public interface UserRepository extends JpaRepository<User, Integer> {

}
