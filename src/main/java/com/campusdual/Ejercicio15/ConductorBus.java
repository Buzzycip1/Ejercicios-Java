package com.campusdual.Ejercicio15;

public class ConductorBus extends Persona{
    int  linea;
    public ConductorBus(String name, String surname, int linea) {
        super(name, surname);
        this.linea = linea;
    }
    @Override
    public void getDetails() {
        System.out.println("Conductor de bus: "+ name + " " + surname + " de la lÃ­nea: " + linea );
    }
}
