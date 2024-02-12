package main;

import java.util.Scanner;

import objetos.Cine;
import objetos.Pelicula;
import objetos.Sala;

public class Main {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int opcion = 0;

        // Objeto cine construido
        Cine cine1 = new Cine("Artesiete", 200, 5);

        System.out.println("\nBienvenido al programa de compra de entradas del cine " + cine1.getNombreCine() + ", contamos con " + cine1.getNumSalas() + " salas y con un aforo total de " + cine1.getAforo() + " de personas");

        while (opcion != 4) {
            System.out.print(
                    "\nPor favor, seleccione una opción:\n1- Ver las salas y las películas \n2- Reservar sala y butaca  \n3- Consultar asientos libres \n4- Salir \n>>> ");
            opcion = entrada.nextInt();
            switch (opcion) {
                case 1:
                    System.out.print("Trabajando...");
                    break;
                case 2:
                    System.out.print("Trabajando...");
                    break;
                case 3:
                    System.out.print("Trabajando...");
                    break;
                case 4:
                    System.out.println("\nAdiós");
                    break;
                default:
                    System.out.println("\nPor favor seleccione una opción válida");
            }

        }
    }
}