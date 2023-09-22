package com.campusdual.Repaso_no_abstracto;

public class Mesa {
    // Atributos de clase
    public static final String TIPO_DE_MUEBLE = "MESA";
    public double height;
    public double widht;
    public double wide;
    public int n_legs;
    public Material resource;

    public static final String UNIONS = "TORNILLERIA";

    //Contructor

    public Mesa(double height, double widht, double wide, int n_legs, Material resource) {
        this.height = height;
        this.widht = widht;
        this.wide = wide;
        this.n_legs = n_legs;
        this.resource = resource;
    }

    // Getters y setters

    public double getHeight() {
        return this.height;
    }

    public double getWidht() {
        return this.widht;
    }

    public double getWide() {
        return this.wide;
    }

    public int getN_legs() {
        return this.n_legs;
    }

    public Material getResource() {
        return this.resource;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setWidht(double widht) {
        this.widht = widht;
    }

    public void setWide(double wide) {
        this.wide = wide;
    }

    public void setN_legs(int n_legs) {
        this.n_legs = n_legs;
    }

    public void setResource(Material resource) {
        this.resource = resource;
    }

    // Método (acciones) que puede hacer la clase


    @Override
    public String toString() {
        return  "Mesa de "+this.getN_legs()+" patas, hecha de "+this.getResource() + " con uniones de " + Mesa.UNIONS;
    }

    public String getDimensions(){
        return this.getHeight()+"x"+this.getWidht()+"x"+this.getWide();
    }

    public void setColor(String color) {
        this.getResource().setColor(color);
    }

}
