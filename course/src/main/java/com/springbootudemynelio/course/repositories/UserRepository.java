package com.springbootudemynelio.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springbootudemynelio.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{
}
