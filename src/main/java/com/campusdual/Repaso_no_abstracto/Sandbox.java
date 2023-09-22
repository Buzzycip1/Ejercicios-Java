package com.campusdual.Repaso_no_abstracto;

import java.util.UUID;

public class Sandbox {

    public static void main(String[] args) {

        String mat = "madera";
        Material material1 = new Material("rojo", mat);
        Cubremanteles cubremanteles1 = new Cubremanteles(new Material("azul", "cristal"));
        Mesa mesa1 = new MesaComedor(1.5, 1.8, 0.6, 4, new Material("gris", "acero galvanizado"));
        Mesa mesa2 = new Escritorio(1.5, 2.0, 0.8, 6, new Material("naranja", "acacia"));
        System.out.println(material1);
        System.out.println(mesa1);
        System.out.println(mesa2);
        mesa1.setColor("verde");
        MesaComedor mesa3 = new MesaComedor(1.5, 1.0, 0.8, 6, new Material("negro", "ebano"));
        System.out.println(mesa1);
        System.out.println(mesa2);
        System.out.println(mesa3);
        System.out.print("Dimensiones de la mesa 3: ");
        System.out.println(mesa3.getDimensions());
        mesa3.setCm(cubremanteles1);
        ((MesaComedor)mesa1).setCm(cubremanteles1);
        System.out.println(mesa3.showDetails());
        System.out.println(((MesaComedor)mesa1).showDetails());
    }
}




