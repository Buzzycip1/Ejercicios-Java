package com.campusdual.Ejercicio15;

public abstract class Persona {
    protected String name;
    protected String surname;
    public Persona (String name, String surname){
        this.name = name;
        this.surname = surname;
    }
    public abstract void  getDetails();

}
