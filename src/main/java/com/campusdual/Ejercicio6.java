package com.campusdual;
import java.util.Calendar;

public class Ejercicio6 {
    //Comprobar cuÃ¡l es la estaciÃ³n del aÃ±o
    //Comprobar si es de maÃ±ana, tarde o noche

    public static void main(String[] args) {


        Calendar cal = Calendar.getInstance();
        int mes = cal.get(Calendar.MONTH);
        int hora = cal.get(Calendar.HOUR_OF_DAY);

        switch (mes + 1){
            case 1:
            case 2:
            case 3:
                System.out.println("Invierno");
                break;
            case 4:
            case 5:
            case 6:
                System.out.println("Primavera");
                break;
            case 7:
            case 8:
            case 9:
                System.out.println("Verano");
                break;
            case 10:
            case 11:
            case 12:
                System.out.println("OtoÃ±o");
                break;
            default:
                System.out.println("No existe este mes");
        }
    }
}
