package com.validation.serviceImpl;

import org.springframework.stereotype.Service;

import com.validation.domain.User;
import com.validation.repository.UserRepository;
import com.validation.service.UserService;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class UserServiceImpl implements UserService {

	private UserRepository repository;

	@Override
	public User saveUser(User user) {

		return repository.save(user);
	}

}
