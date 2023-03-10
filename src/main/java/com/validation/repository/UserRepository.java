package com.validation.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.validation.domain.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

}
