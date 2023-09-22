package com.campusdual.Ejercicio18;

import java.util.UUID;

public class CafeteraItaliana implements IMaquina, ICafetera{
    @Override
    public void on() {
    }

    @Override
    public int off() {
        return 0;
    }

    @Override
    public UUID maintenance(double hours) {

        this.setExpectedMantenaince(hours);
        return UUID.randomUUID();
    }

    @Override
    public void hacerCafe() {
        System.out.println("1.- Calienta el cafe de la parte de abajo\n2.- El vapor atraviesa el cafÃ© y sube por el hueco central\n3.-El cafÃ© infusionado sale del hueco calentito listo para tomar");

    }

    private double expectedMantenaince = 0.0;

    public double getExpectedMantenaince() {
        return this.expectedMantenaince;
    }

    public void setExpectedMantenaince(Double expectedMantenaince) {
        this.expectedMantenaince = expectedMantenaince;
    }
}
