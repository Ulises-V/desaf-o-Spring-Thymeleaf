package com.example.mvc.service;

import com.example.mvc.model.Role;
import org.springframework.stereotype.Service;

import java.util.LinkedList;
import java.util.List;

@Service
public class RoleServiceImpl implements RoleService{

    public List<Role> generateRoleObjects(){
        Role role1 = new Role(
                "Administrador",
                "Acceso a todas las funcionalidades"
        );
        Role role2 = new Role(
                "Editor",
                "Tiene permisos de crear y editar contenido"
        );
        Role role3 = new Role(
                "Cliente",
                "Tiene acceso a los servicios"
        );
        List<Role> roles = new LinkedList<>();
        roles.add(role1);
        roles.add(role2);
        roles.add(role3);
        return roles;
    }

    @Override
    public Role generateNewRole(String nameRole, String descriptionRole) {
        Role newRole = new Role(
               nameRole,
                descriptionRole
        );
        System.out.println("Nombre Rol = " + newRole.getNameRole());
        System.out.println("Descripción Rol = " + newRole.getDescriptionRole());
        return newRole;
    }
}
