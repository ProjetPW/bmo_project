package com.yourcompany.paris.paris.model;

import javax.persistence.*;

@Entity
public class Bookmaker {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String address;

    // Constructeurs

    public Bookmaker() {
    }

    public Bookmaker(String name, String address) {
        this.name = name;
        this.address = address;
    }

    // Getters and setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    // Actions

   

   
}

