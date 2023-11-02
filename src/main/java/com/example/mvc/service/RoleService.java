package com.example.mvc.service;

import com.example.mvc.model.Role;

import java.util.List;

public interface RoleService {
    List<Role> generateRoleObjects();
    Role generateNewRole(String nameRole, String descriptionRole);
}
