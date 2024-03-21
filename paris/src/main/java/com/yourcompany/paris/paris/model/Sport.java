package com.yourcompany.paris.paris.model;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Sport {
    @Id @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id_evenement;
    private String sport;
    private Date date;
    private String resultat;
    
    public void getresultat() {
        // Votre code pour obtenir le résultat ici
    }
}
