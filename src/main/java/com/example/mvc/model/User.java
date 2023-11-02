package com.example.mvc.model;

import java.util.Date;
import java.util.UUID;

public class User {
    private UUID idUser;
    private String firstNameUser;
    private String lastNameUser;
    private int ageUser;
    private String emailUser;
    private String photoUser;
    private String genderUser;
    private boolean isActiveUser;
    private Date creationDateUser;

    public User() {

    }

    public User(UUID idUser, String firstNameUser, String lastNameUser, int ageUser, String emailUser, String photoUser, String genderUser, boolean isActiveUser, Date creationDateUser) {
        this.idUser = idUser;
        this.firstNameUser = firstNameUser;
        this.lastNameUser = lastNameUser;
        this.ageUser = ageUser;
        this.emailUser = emailUser;
        this.photoUser = photoUser;
        this.genderUser = genderUser;
        this.isActiveUser = isActiveUser;
        this.creationDateUser = creationDateUser;
    }

    public UUID getIdUser() {
        return idUser;
    }

    public void setIdUser(UUID idUser) {
        this.idUser = idUser;
    }

    public String getFirstNameUser() {
        return firstNameUser;
    }

    public void setFirstNameUser(String firstNameUser) {
        this.firstNameUser = firstNameUser;
    }

    public String getLastNameUser() {
        return lastNameUser;
    }

    public void setLastNameUser(String lastNameUser) {
        this.lastNameUser = lastNameUser;
    }

    public int getAgeUser() {
        return ageUser;
    }

    public void setAgeUser(int ageUser) {
        this.ageUser = ageUser;
    }

    public String getEmailUser() {
        return emailUser;
    }

    public void setEmailUser(String emailUser) {
        this.emailUser = emailUser;
    }

    public String getPhotoUser() {
        return photoUser;
    }

    public void setPhotoUser(String photoUser) {
        this.photoUser = photoUser;
    }

    public String getGenderUser() {
        return genderUser;
    }

    public void setGenderUser(String genderUser) {
        this.genderUser = genderUser;
    }

    public boolean isActiveUser() {
        return isActiveUser;
    }

    public void setActiveUser(boolean activeUser) {
        isActiveUser = activeUser;
    }

    public Date getCreationDateUser() {
        return creationDateUser;
    }

    public void setCreationDateUser(Date creationDateUser) {
        this.creationDateUser = creationDateUser;
    }
}
