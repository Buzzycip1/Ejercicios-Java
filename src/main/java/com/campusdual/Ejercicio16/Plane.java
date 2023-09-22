package com.campusdual.Ejercicio16;


    public class Plane implements IMachine {
        private final String name;
        public Plane(String name) {
            this.name = name;
        }
        @Override
        public void start() {
            System.out.println("Aviónn encendido");
        }
        @Override
        public void stop() {
            System.out.println("Avión apagado");
        }
        @Override
        public void maintenance() {
            System.out.println("Realizando el mantenimiento del aviónn");
        }
        public void takeOff() {
            System.out.println("El avión despega");
        }
        public void land() {
            System.out.println("El avión aterriza");
        }
        public void fly() {
            System.out.println("El avion está¡ volando");
        }
    }


