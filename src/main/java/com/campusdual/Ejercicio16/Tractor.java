package com.campusdual.Ejercicio16;

public class Tractor implements IMachine {

    protected int horsePower = 0;

    public Tractor(int hp) {
        this.horsePower = hp;
    }
    @Override
    public void start() {
        System.out.println("El tractor está encendido");
    }

    @Override
    public void stop() {
        System.out.println("El tractor está apagado");
    }

    @Override
    public void maintenance() {
        System.out.println("El tractor está en mantenimiento");
    }

    public void forward() {
        System.out.println("El tractor avanza");
    }

    public void backward() {
        System.out.println("El tractor retrocede");
    }

}
