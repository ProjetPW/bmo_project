package com.yourcompany.paris.paris.model;

import javax.persistence.*;

import javax.persistence.*;

@Entity
public class Evenement {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String resultats;
    private String vainqueur;

    // Constructeur par défaut
    public Evenement() {
    }

    // Getters et setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getResultats() {
        return resultats;
    }

    public void setResultats(String resultats) {
        this.resultats = resultats;
    }

    public String getVainqueur() {
        return vainqueur;
    }

    public void setVainqueur(String vainqueur) {
        this.vainqueur = vainqueur;
    }

    // Actions
    public void getCote() {
        // Logique pour obtenir les cotes de l'événement
    }
}
