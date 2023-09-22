package com.campusdual.ejercicio20;

public class EjercicioRepasoAlmacenamiento {

        /* Crear un programa que sea una agenda
         * La agenda contendrá una serie de personas, que tendrán información sobre ellas,
         * como puede ser: Nombre, apellido, ciudad, codigo postal, dni
         * y listas de telefonos, de tal manera
         * que una persona tenga 1 telefono movil o un telefono fijo,  dos teléfonos móviles, 4 teléfono móviles... etc.
         * Uno de esos teléfonos tiene que ser el teléfono principal
         * La agenda tiene que tener metodos para añadir, eliminar  y listar su contenido
         * La persona podrá llamar a otra persona de la agenda ( a su número principal )
         */

        public static void main(String[] args) {
            Contact contact1 = new Contact("Luis","Lopez","Ourense",28000,"47356845W");
            contact1.addNumber("667811779");
            Contact contact2 = new Contact("Carlos","Rodriguez","Madrid",15001, "44356840P");
            contact2.addNumber("981270585");

            contact2.callPerson(contact1);
            contact1.callPerson(contact2);


        }

    }

