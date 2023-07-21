package com.example.demo.repository;

import java.util.Set;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Role;
import com.example.demo.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{
	 
	 public User findByEmailId(String emailId);
	 public User findByEmailIdAndPassword(String emailId,String password);
	 public Set<User> findByRole(Role role);

}
