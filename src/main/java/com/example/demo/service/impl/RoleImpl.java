package com.example.demo.service.impl;

import java.util.LinkedHashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Role;
import com.example.demo.repository.RoleRepository;
import com.example.demo.service.RoleService;

@Service
public class RoleImpl implements RoleService {
	@Autowired
	private RoleRepository repository;

	@Override
	public Role createRole(Role role) {
		// TODO Auto-generated method stub
		return repository.save(role) ;
	}

	@Override
	public Set<Role> getAllRole() {
		// TODO Auto-generated method stub
		return new LinkedHashSet<>(repository.findAll());
	}

	@Override
	public Role getByRid(int rid) {
		// TODO Auto-generated method stub
		return repository.findById(rid).get();
	}

}
