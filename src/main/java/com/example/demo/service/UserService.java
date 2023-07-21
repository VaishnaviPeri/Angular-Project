package com.example.demo.service;

import java.util.Set;

import com.example.demo.model.Role;
import com.example.demo.model.User;

public interface UserService {
	
	public User getById(long id);
	public void deleteById(long id);
	public User createUser(User user);
	public User getByEmail(String emailId);
	public Set<User> getAllUsers();
	public User authenticate(String emailId, String password);
	public User updateUser(User user);
	public Set<User> getDetailsByRole(Role role);

}
