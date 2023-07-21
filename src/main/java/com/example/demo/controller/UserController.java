package com.example.demo.controller;


import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Role;
import com.example.demo.model.User;
import com.example.demo.service.RoleService;
import com.example.demo.service.UserService;

@CrossOrigin("*")
@RestController
@RequestMapping("/user")
public class UserController {
	@Autowired
	private UserService service;
	@Autowired
	private RoleService roleservice;
	
	@GetMapping("/")
    public Set<User> getAllUsers() {
        return service.getAllUsers();
    }

    //find user by id
    @GetMapping("/findById/{id}")
    public User findById(@PathVariable long id) {
        return service.getById(id);
    }
    @PostMapping("/")
    public User createUser(@RequestBody User user) {
    	return service.createUser(user);
    }
    
    @DeleteMapping("/delete/{id}")
    public void deleteUser(@PathVariable long id) {
        service.deleteById(id);
    }
    
	@PutMapping("/")
	public User updateUser(@RequestBody User user) {
		return service.updateUser(user);
		
	}
	
	@GetMapping("/{emailId}")
	public User getByEmailId(@PathVariable String emailId) {
		return service.getByEmail(emailId);
	}
	
	@GetMapping("/{emailId}/{password}")
	public User authenticate(@PathVariable String emailId,@PathVariable String password) {
		return service.authenticate(emailId, password);
	}
	@GetMapping("/role/{rid}")
	public  Set<User> getDetailsByRole(@PathVariable("rid") int rid){
		Role role= roleservice.getByRid(rid);
		Set<User> userdetails = role.getUser();
		return userdetails;
				
	}

}
