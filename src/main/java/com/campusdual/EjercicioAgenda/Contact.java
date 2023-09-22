package com.campusdual.EjercicioAgenda;

import java.util.ArrayList;
import java.util.List;

public class Contact {

    private String name;
    private String surname;
    private String city;
    private int zipCode;
    private List<String> phoneList = new ArrayList<>();
    private String mainPhone;
    private  String dni;


    public Contact(String name, String surname, String city, int zipCode, String dni) {
        this.name = name;
        this.surname = surname;
        this.city = city;
        this.zipCode = zipCode;
        this.dni = dni;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getZipCode() {
        return zipCode;
    }

    public void setZipCode(int zipCode) {
        this.zipCode = zipCode;
    }

    public List<String> getPhoneList() {
        return phoneList;
    }

    public void setPhoneList(List<String> phoneList) {
        this.phoneList = phoneList;
    }

    public String getMainPhone() {
        return mainPhone;
    }

    public void setMainPhone(String mainPhone) {
        this.mainPhone = mainPhone;
    }

    public void addNumber(String number) {
        this.getPhoneList().add(number);
        if(this.getMainPhone() == null){
            this.setMainPhone(number);
        }
    }

    public void phoneCall(Contact ctc){
        System.out.println(this.getName() + " " + this.getSurname() + " Llamando a  " + ctc.getName()+ " " + ctc.surname + "( " + ctc.getMainPhone() + ")" );
    }

    @Override
    public String toString() {
        return "Contact{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", city='" + city + '\'' +
                ", zipCode=" + zipCode +
                ", phoneList=" + phoneList +
                ", mainPhone='" + mainPhone + '\'' +
                ", dni='" + dni + '\'' +
                '}';
    }
}