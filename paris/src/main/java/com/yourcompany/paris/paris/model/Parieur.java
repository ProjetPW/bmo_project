package com.yourcompany.paris.paris.model;

import javax.persistence.*;

import org.openxava.annotations.Action;

@Entity
public class Parieur {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String userId;
    private String email;
    private Integer jeton;
    private String loginStatus;

    // Constructeurs

    public Parieur() {
    }

    public Parieur(String userId, String email, Integer jeton, String loginStatus) {
        this.userId = userId;
        this.email = email;
        this.jeton = jeton;
        this.loginStatus = loginStatus;
    }

    // Getters and setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getJeton() {
        return jeton;
    }

    public void setJeton(Integer jeton) {
        this.jeton = jeton;
    }

    public String getLoginStatus() {
        return loginStatus;
    }

    public void setLoginStatus(String loginStatus) {
        this.loginStatus = loginStatus;
    }

    // Actions
    @Action(value = "")
    public void login(String email, String password) {
        // Logique de connexion
    }

    @Action(value = "")
    public void recharge(Integer jeton) {
        // Logique de recharge de jeton
    }
}
