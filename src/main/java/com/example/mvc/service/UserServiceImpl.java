package com.example.mvc.service;

import com.example.mvc.model.User;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.LinkedList;
import java.util.List;
import java.util.UUID;

@Service
public class UserServiceImpl implements UserService {

    public List<User> generateUserList() {
        User user1 = new User(
                UUID.randomUUID(),
                "Pedro",
                "Perez",
                32,
                "pedro11@gmail.com",
                "pedro.jpg",
                "M",
                true,
                new Date()
        );
        User user2 = new User(
                UUID.randomUUID(),
                "Ana",
                "Juarez",
                45,
                "anaju@gmail.com",
                "ana.jpg",
                "F",
                true,
                new Date()
        );
        User user3 = new User(
                UUID.randomUUID(),
                "Juan",
                "Ramirez",
                39,
                "ram117@gmail.com",
                "juan.jpg",
                "M",
                false,
                new Date()
        );
        List<User> users = new LinkedList<>();
        users.add(user1);
        users.add(user2);
        users.add(user3);
        return users;
    }

    public User generateNewUser(String firstNameUser, String lastNameUser, int ageUser, String emailUser, String photoUser, String genderUser) {
        User newUser = new User (
                UUID.randomUUID(),
                firstNameUser,
                lastNameUser,
                ageUser,
                emailUser,
                photoUser,
                genderUser,
                true,
                new Date()
        );
        System.out.println("Nombre Usuario = " + newUser.getFirstNameUser());
        System.out.println("Apellido Usuario = " + newUser.getLastNameUser());
        System.out.println("Edad Usuario = " + newUser.getAgeUser());
        System.out.println("Correo Usuario = " + newUser.getEmailUser());
        System.out.println("Foto Usuario = " + newUser.getPhotoUser());
        System.out.println("Genero Usuario = " + newUser.getGenderUser());
        return newUser;
    }
}
