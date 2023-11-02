package com.example.mvc.controller;

import com.example.mvc.model.Role;
import com.example.mvc.model.User;
import com.example.mvc.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@Controller
@RequestMapping("/usuarios")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/lista")
    public String getUserList(Model model) {
        List<User> users = userService.generateUserList();
        model.addAttribute("users", users);
        return "Usuarios/listaUsuarios";
    }

    @GetMapping("/detalle/{idUser}")
    public String showUser(@PathVariable UUID idUser, Model model){
        model.addAttribute("idUser", idUser);
        return "Usuarios/detalleUsuario";
    }

    @GetMapping("/eliminar")
    public String deleteUser(@RequestParam UUID idUser, Model model) {
        model.addAttribute("idUser", idUser);
        return "Usuarios/eliminarUsuario";
    }

    @GetMapping("/agregar")
    public String addUser() {
        return "Usuarios/agregarUsuario";
    }

    @PostMapping("/guardar")
    public String saveRole(@RequestParam String firstNameUser, @RequestParam String lastNameUser, @RequestParam int ageUser, @RequestParam String emailUser, @RequestParam String photoUser, @RequestParam String genderUser, Model model){
        User newUser = userService.generateNewUser(firstNameUser, lastNameUser, ageUser, emailUser, photoUser, genderUser);
        model.addAttribute("idUser", newUser.getIdUser());
        return "Usuarios/detalleUsuario";
    }

}
