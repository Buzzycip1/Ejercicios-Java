package com.campusdual.Ejercicio18;

import java.util.UUID;

public interface IMaquina {

    /**
     * MÃ©todo que se usa para encender la mÃ¡quina
     */
    public void on();

    /**
     * MÃ©todo que se usa para apagar la mÃ¡quina
     * @return Un entero que indica el nÃºmero de minutos que ha estado la mÃ¡quina en funcionamiento
     */
    public int off();

    /**
     * MÃ©todo que se usa para poner la mÃ¡quina en mantenimiento
     * @param hours Double que indica el nÃºmero de horas que estarÃ¡ en mantenimiento la mÃ¡quina
     * @return Un entero que indica el nÃºmero del ticket para el mantenimiento
     */
    public UUID maintenance(double hours);
}

