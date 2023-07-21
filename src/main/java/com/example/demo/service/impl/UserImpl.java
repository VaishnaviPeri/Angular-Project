package com.example.demo.service.impl;

import java.util.LinkedHashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Role;
import com.example.demo.model.User;
import com.example.demo.repository.UserRepository;
import com.example.demo.service.UserService;

@Service
public class UserImpl implements UserService {
	@Autowired
	private UserRepository repository;

	@Override
	public User getById(long id) {
		// TODO Auto-generated method stub
		return repository.findById(id).get();
	}

	@Override
	public void deleteById(long id) {
		// TODO Auto-generated method stub
		repository.deleteById(id);
		
	}

	@Override
	public User createUser(User user) {
		// TODO Auto-generated method stub
		return repository.save(user);
	}

	@Override
	public User getByEmail(String emailId) {
		// TODO Auto-generated method stub
		return repository.findByEmailId(emailId);
	}

	@Override
	public Set<User> getAllUsers() {
		// TODO Auto-generated method stub
		return new LinkedHashSet<>(repository.findAll());
	}

	@Override
	public User authenticate(String emailId, String password) {
		// TODO Auto-generated method stub
		return repository.findByEmailIdAndPassword(emailId, password);
	}

	@Override
	public User updateUser(User user) {
		// TODO Auto-generated method stub
		return repository.save(user);
	}

	@Override
	public Set<User> getDetailsByRole(Role role) {
		// TODO Auto-generated method stub
		return repository.findByRole(role);
	}
	

}
