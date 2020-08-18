package com.learningJPA.JpaLearn.service;

import org.springframework.data.jpa.repository.JpaRepository;

import com.learningJPA.JpaLearn.entity.User;

public interface UserRepository extends JpaRepository<User,Long> {

}
