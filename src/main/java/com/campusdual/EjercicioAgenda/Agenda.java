package com.campusdual.EjercicioAgenda;

import java.util.HashMap;
import java.util.Map;

public class Agenda {
    private Map<String, Contact> phoneBook = new HashMap<>();


    public Map<String, Contact> getPhoneBook() {
        return phoneBook;
    }

    public void showPhoneBook(){
        for (Map.Entry<String, Contact> e: this.phoneBook.entrySet()){
            System.out.println("DNI " + e.getKey() + " Contacto " + e.getValue());
        }
    }




}
