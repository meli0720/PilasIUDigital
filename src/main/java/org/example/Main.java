package org.example;

import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Pila pilaPrincipal = new Pila(100);
        Pila pilaAcciones = new Pila(100);

        int opcion;


        do {

            System.out.println("\n---- MENU ----");
            System.out.println("1. Escribir texto");
            System.out.println("2. Deshacer");
            System.out.println("3. Rehacer");
            System.out.println("4. Mostrar texto actual");
            System.out.println("5. Salir");

            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {

                case 1:
                    System.out.print("Escriba el texto a guardar: ");
                    String texto = sc.nextLine();
                    pilaPrincipal.push(texto);
                    pilaAcciones.clear();
                    break;

                case 2:
                    if (!pilaPrincipal.isEmpty()) {
                        String deshacer = pilaPrincipal.pop();
                        pilaAcciones.push(deshacer);
                        System.out.println("Acción deshecha");
                    } else {
                        System.out.println("Nada para deshacer");
                    }
                    break;

                case 3:
                    if (!pilaAcciones.isEmpty()) {
                        String rehacer = pilaAcciones.pop();
                        pilaPrincipal.push(rehacer);
                        System.out.println("Acción rehecha");
                    } else {
                        System.out.println("Nada para rehacer");
                    }
                    break;

                case 4:
                    if (!pilaPrincipal.isEmpty()) {
                        System.out.println("Texto actual: " + pilaPrincipal.peek());
                    } else {
                        System.out.println("No hay texto");
                    }
                    break;

            }

        } while (opcion != 5);

        System.out.println("Gracias, hasta luego!");
    }

    }
