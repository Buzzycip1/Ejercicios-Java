package com.campusdual.Ejercicio18;

import java.util.UUID;

public class Ejercicio18 {

    public static void main(String[] args) {

        CafeteraCapsulas cafetera1 = new CafeteraCapsulas();
        IMaquina cafetera2 = new CafeteraItaliana();
        cafetera1.on();
        cafetera2.on();
        UUID maintenance1 = cafetera1.maintenance(0.5);
        UUID maintenance2 = cafetera2.maintenance(1.5);
        System.out.println("Pasan cosas");
        System.out.println("Ticket: "+ maintenance1 + " mantenimiento esperado: "+ cafetera1.getExpectedMantenaince());
        System.out.println("Ticket: "+ maintenance2 + " mantenimiento esperado: "+ ((CafeteraItaliana)cafetera2).getExpectedMantenaince());
        ((ICafetera)cafetera1).hacerCafe();
        ((ICafetera)cafetera2).hacerCafe();


    }

}
