package com.example.demo.controller;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Role;
import com.example.demo.service.RoleService;

@CrossOrigin("*")
@RestController
@RequestMapping("/role")
public class RoleController {
	@Autowired
	private RoleService service;
	
	@GetMapping("/")
	public Set<Role> getAllRole(){
		return service.getAllRole();
	}
	
	 @PostMapping("/")
	    public Role createRole(@RequestBody Role role) {
	    	return service.createRole(role);
	    }
	 @GetMapping("/roleid/{id}")
	 public Role getById(@PathVariable int id) {
		 return service.getByRid(id);
	 }
	

}
