package com.campusdual.Ejercicio15;

public class Repartidor extends Persona{
    String ruta;
    public Repartidor(String name, String surname, String ruta) {
        super(name, surname);
        this.ruta = ruta;
    }
    @Override
    public void getDetails() {
        System.out.println("Repartidor: "+ name + " " + surname + " con identificador de ruta: " + ruta );
    }
}
