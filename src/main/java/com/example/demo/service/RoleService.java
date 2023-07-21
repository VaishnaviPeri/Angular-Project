package com.example.demo.service;

import java.util.Set;

import com.example.demo.model.Role;

public interface RoleService {
	public Role createRole(Role role);
	public Set<Role> getAllRole();
	public Role getByRid(int rid);

}
