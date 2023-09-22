package com.campusdual;

public class Ejercicio8 {

    public static void repetirHasta(int max) {
        int i = 0;
        while (i < max) {
            System.out.println("Iteración número " + (i + 1));
            i++;
        }

    }

    public static void main(String[] args) {

        repetirHasta(20);
        System.out.println("=============");
        repetirHasta(0);

    }
}