package com.campusdual.Ejercicio15;

public class Ejercicio15 {
    public static void main(String[] args) {

        Bombero b = new Bombero("Luis","San Juan",15);
        ConductorBus cb = new ConductorBus("Marcos","Lopez",12);
        Repartidor r = new Repartidor("Maria","Cid","Madrid");

        b.getDetails();
        cb.getDetails();
        r.getDetails();
    }

}
