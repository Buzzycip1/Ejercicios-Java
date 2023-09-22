package com.campusdual.ejercicio20;

import java.util.HashMap;
import java.util.Map;

public class Agenda {
    private Map<String, Contact> contactMap = new HashMap<>();
    public Agenda(){
    }
    public Map<String, Contact> getContactMap() {

        return contactMap;
    }
    public void setContactMap(Map<String, Contact> contactMap) {

        this.contactMap = contactMap;
    }
    public void addContact(Contact c){
        this.getContactMap().put(c.getDni(), c);
    }
    public void removeContact(String key){
        this.getContactMap().remove(key);
    }
}
