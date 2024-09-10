package com.project.springPostgreSQL.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.springPostgreSQL.model.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
