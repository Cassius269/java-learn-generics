package com.fahami.cda.entity;

import com.fahami.cda.interfaces.iPerson;

public abstract class Person implements iPerson {
    // Les propriétés
    private String firstname;
    private String lastname;
    private String email;
    
    // Le(s) constructeur(s)
    // Constructeur vide
    public Person() {};

    // Le constructeur plein
    public Person(String firstname, String lastname, String email){
        this.firstname = firstname;
        this.lastname = lastname;
        this.email = email;
    }

    
    // Les getters et setters
    public String getFirstname() {
        return this.firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return this.lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
