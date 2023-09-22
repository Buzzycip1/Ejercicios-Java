package com.campusdual.ejercicio20;

import jdk.jshell.execution.Util;

import java.util.ArrayList;
import java.util.*;

public class Contact {

    private String name;
    private String surname;
    private String city;
    private int zipCode;
    private String dni;
    private String primaryNumber;
    private List<String> phoneNumberList = new ArrayList<>();


    public Contact(String name, String surname, String city, int zipCode, String dni) {
        this.name = name;
        this.surname = surname;
        this.city = city;
        this.zipCode = zipCode;
        this.dni = dni;
    }
    public Contact(){

    }

    public void setPrimaryNumber(String primaryNumber) {this.primaryNumber = primaryNumber;
    }

    public void setPhoneNumberList(List<String> phoneNumberList) {this.phoneNumberList = phoneNumberList;
    }

    public void setName(String name) {this.name = name;
    }

    public void setSurname(String surname) {this.surname = surname;
    }

    public void setCity(String city) {this.city = city;
    }

    public void setZipCode(int zipCode) {this.zipCode = zipCode;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }
    public String getCity() {
        return city;
    }
    public int getZipCode() {
        return zipCode;
    }
    public String getDni() {
        return dni;
    }
    public String getPrimaryNumber() {
        return primaryNumber;
    }

    public List<String> getPhoneNumberList() {
        return phoneNumberList;
    }

    //Metodo
    public void addNumber(String phone){
        this.getPhoneNumberList().add(phone);  // añado a mi liusta de telefono el telefono que le paso por paramentro
        if(this.getPrimaryNumber()== null){
            this.setPrimaryNumber(phone); // si no tenemos un telefono el phone actua como primaryNumber
        }
    };
    public void callPerson(Contact p){  //Person en la persona a la que llamas
        if(p.getPrimaryNumber() != null){
            System.out.println(this.getName() + " "+ this.getSurname() + " esta llamando a "+ p.getName() + " " + p.getSurname() + " (" + p.getPrimaryNumber() + ")" );
        }else{
            System.out.println( this.getName() + " "+ this.getSurname() + "no tiene numero de telefono");
        }
    }
}
