package com.campusdual.Ejercicio15;

public class Bombero extends Persona {
    int zonaAsignada;
    public Bombero(String name, String surname, int zonaAsignada) {
        super(name, surname);
        this.zonaAsignada = zonaAsignada;
    }
    @Override
    public void getDetails() {
        System.out.println("Bombero: "+ name + " " + surname + " con zona asignada: " + zonaAsignada );
    }
}
