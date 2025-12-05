package com.fahami.cda.entity;

public class Student extends Person {
    // Le constructeur 
    public Student(String firstname, String lastname, String email){
        super(firstname, lastname, email);
    }

    public Student(){};


    // Surcharger la méthode se présenter
    @Override
    public void introduceHimOrHerself() {
        IO.println("Hello my name's " + this.getFirstname() + " " + this.getLastname() );        
    }
}