package com.example.mvc.model;

public class Role {
    private static int counterIdRole = 0;
    private final int idRole;
    private String nameRole;
    private String descriptionRole;

    public Role() {
        this.idRole = ++counterIdRole;
    }

    public Role(String nameRole, String descriptionRole) {
        this.idRole = ++counterIdRole;
        this.nameRole = nameRole;
        this.descriptionRole = descriptionRole;
    }
    public int getIdRole() {
        return idRole;
    }

    public String getNameRole() {
        return nameRole;
    }

    public void setNameRole(String nameRole) {
        this.nameRole = nameRole;
    }

    public String getDescriptionRole() {
        return descriptionRole;
    }

    public void setDescriptionRole(String descriptionRole) {
        this.descriptionRole = descriptionRole;
    }
}
