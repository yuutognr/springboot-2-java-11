package com.kolda.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kolda.course.entities.User1;

public interface UserRepository extends JpaRepository<User1, Long> {

}