package com.a.app.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.a.app.models.User;

public interface UserRepository extends JpaRepository<User, String> {

}
