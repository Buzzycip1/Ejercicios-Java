package com.campusdual.EjercicioAgenda;

public class Main {


    public static void main(String[] args) {
        Agenda ag = new Agenda();

        Contact c0 = new Contact("Henry","Sampedro","Caracas",15008,"37459921D");
        Contact c1 = new Contact("Pedro","Sanchez","Madrid",28005,"48112096P");
        Contact c2 = new Contact("Luis","Sanz","Barcelona",15000, "47660041W");
        c0.addNumber("667804009");
        c0.addNumber("667804111");
        c1.addNumber("881927755");
        c1.addNumber("981927755");
        c2.addNumber("881225599");
        c2.addNumber("881115595");

        //c0.phoneCall(c1);
        ag.getPhoneBook().put(c1.getDni(),c0);
        ag.getPhoneBook().put(c2.getDni(),c1);
        ag.getPhoneBook().put(c0.getDni(),c1);

        Contact ctc20 = ag.getPhoneBook().get("48112096P");
        Contact ctc40 = ag.getPhoneBook().get("47660041W");
       // ctc20.phoneCall(ctc40);
        ag.showPhoneBook();


    }


    /* Crear un programa que sea una agenda
     * La agenda contendrá una serie de personas, que tendrán información sobre ellas, como puede ser:
     *  Nombre, apellido, ciudad, codigo postal, y listas de telefonos, de tal manera
     * que una persona tengaa 1 telefono movil o un telefono fijo,  dos teléfonos móviles, 4 teléfono móviles... etc. Uno de esos teléfonos tiene que ser el teléfono principal
     * La agenda tiene que tener metodos para añadir, eliminar  y listar su contenido
     * La persona podrá llamar a otra persona de la agenda ( a su número principal )
     */


}
