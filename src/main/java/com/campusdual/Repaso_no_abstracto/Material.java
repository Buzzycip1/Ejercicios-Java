package com.campusdual.Repaso_no_abstracto;

public class Material {
    //Atributos de clase
    private String color;
    private String resource;

    //Constructor
    public Material(String color, String resource){
        this.color = color;
        this.resource = resource;
    }

    // Getters y setters, mÃ©todos que se utilizan para devolver o establecer valores a nuestros atributos de la clase
    public String getColor(){
        return this.color;
    }

    public void setColor(String colorMaterial){
        this.color = colorMaterial;
    }

    public String getResource(){
        return this.resource;
    }

    public void setResource(String material){
        this.resource = material;
    }

    // Métodos (acciones) que puede hacer la clase.

    @Override
    public String toString() {
        return this.getResource() + " " + this.getColor();
    }

}
