package com.campusdual.Ejercicio10;
import java.util.Random;

public class Ejercicio10_3 {
    public static void colorAleatorio() {
        System.out.println("COLORES ALEATORIOS");
        int i = 1;
        int max = 15;

        while (i <= max) {
            Random random = new Random();
            int numAleatorio = random.nextInt(3);
            System.out.println("NÃºmero Aleatorio = " + numAleatorio);

            switch(numAleatorio) {
                case 0:
                    System.out.println("Bola verde");
                    break;

                case 1:
                    System.out.println("Bola azul");
                    break;

                case 2:
                    System.out.println("Bola roja");
                    break;
            }
            i++;
        }
    }
    public static void main(String[] args) {
        colorAleatorio();
    }
}
