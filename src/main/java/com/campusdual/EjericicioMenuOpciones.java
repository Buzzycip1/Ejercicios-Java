package com.campusdual;

import java.util.ArrayList;
import java.util.Scanner;


public class EjericicioMenuOpciones {
    private ArrayList<String> usuarios = new ArrayList<>();
    private ArrayList<String> comentarios = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        EjericicioMenuOpciones menu = new EjericicioMenuOpciones();
        menu.mostrarMenu();
    }

    public void mostrarMenu() {
        int opcion;
        do {
            System.out.println("Menú de opciones:");
            System.out.println("1. Mostrar lista de usuarios");
            System.out.println("2. Mostrar lista de comentarios");
            System.out.println("3. Agregar usuario");
            System.out.println("4. Agregar comentario");
            System.out.println("0. Salir");
            System.out.print("Ingrese una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine();  // Consumir la nueva línea

            switch (opcion) {
                case 1:
                    mostrarUsuarios();
                    break;
                case 2:
                    mostrarComentarios();
                    break;
                case 3:
                    agregarUsuario();
                    break;
                case 4:
                    agregarComentario();
                    break;
                case 0:
                    System.out.println("Saliendo del programa. ¡Hasta luego!");
                    break;
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
                    break;
            }
        } while (opcion != 0);
    }

    private void mostrarUsuarios() {
        if (usuarios.isEmpty()) {
            System.out.println("No hay usuarios registrados.");
        } else {
            System.out.println("Lista de usuarios:");
            for (String usuario : usuarios) {
                System.out.println(usuario);
            }
        }
    }

    private void mostrarComentarios() {
        if (comentarios.isEmpty()) {
            System.out.println("No hay comentarios registrados.");
        } else {
            System.out.println("Lista de comentarios:");
            for (String comentario : comentarios) {
                System.out.println(comentario);
            }
        }
    }

    private void agregarUsuario() {
        System.out.print("Ingrese el nombre de usuario: ");
        String usuario = scanner.nextLine();
        usuarios.add(usuario);
        System.out.println("Usuario agregado correctamente.");
    }

    private void agregarComentario() {
        System.out.print("Ingrese un comentario: ");
        String comentario = scanner.nextLine();
        comentarios.add(comentario);
        System.out.println("Comentario agregado correctamente.");
    }
}
