package com.example.mvc.controller;

import com.example.mvc.model.Role;
import com.example.mvc.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@Controller
@RequestMapping(value = "/roles")
public class RoleController {

    @Autowired
    private RoleService roleService;

    @GetMapping("/lista")
    public String getRoleList(Model model){
        List<Role> roles = roleService.generateRoleObjects();
        model.addAttribute("roles", roles);
        return "Roles/listaRoles";
    }

    @GetMapping("/detalle/{idRole}")
    public String showRole(@PathVariable int idRole, Model model){
        model.addAttribute("idRole", idRole);
        return "Roles/detalleRol";
    }

    @GetMapping("/eliminar")
    public String deleteRole(@RequestParam() int idRole, Model model){
        model.addAttribute("idRole", idRole);
        return "Roles/eliminarRol";
    }

    @GetMapping("/agregar")
    public String addRole(){
        return "Roles/agregarRol";
    }

    @PostMapping("/guardar")
    public String saveRole(@RequestParam() String nameRole, @RequestParam() String descriptionRole, Model model){
        Role newRole = roleService.generateNewRole(nameRole, descriptionRole);
        model.addAttribute("idRole", newRole.getIdRole());
        return "Roles/detalleRol";
    }
}
