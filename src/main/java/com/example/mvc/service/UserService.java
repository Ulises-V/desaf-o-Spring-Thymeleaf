package com.example.mvc.service;

import com.example.mvc.model.User;

import java.util.List;

public interface UserService {
    List<User> generateUserList();
    User generateNewUser(String firstNameUser, String lastNameUser, int ageUser, String emailUser, String photoUser, String genderUser);

}
