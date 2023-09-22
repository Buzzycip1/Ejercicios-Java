package com.campusdual.Ejercicio10;
import java.util.Random;

public class Ejercicio10_2 {
    //Ejercicio 10, sacar una bola de color verde, azul o rojo de manera aleatoria 15 veces desde una caja/

    public static void main(String[] args) {

        Random rand = new Random();

        final String bolaVerde = "VERDE";
        final String  bolaRoja = "ROJA";
        final String   bolaAzul = "AZUL";

        for (int i = 0; i< 15; i++) {

            int numeroRandom = rand.nextInt(3) + 1;

            String bolaColor;

            switch (numeroRandom) {
                case 1:
                    bolaColor = bolaVerde;
                    break;
                case 2:
                    bolaColor = bolaRoja;
                    break;
                case 3:
                    bolaColor = bolaAzul;
                    break;
                default:
                    bolaColor = "pues  si me da otra cosa, debe ser invisible";
            }
            System.out.println("Bola número " + i + ": " + bolaColor);
        }
    }
}
