package Ejercicio24;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        System.out.println("peso esfera A: ");
        double pesoA = scanner.nextDouble();

        System.out.println("peso esfera B: ");
        double pesoB = scanner.nextDouble();

        System.out.println("peso esfera C: ");
        double pesoC = scanner.nextDouble();

        // Determinar la esfera de mayor peso
        if (pesoA > pesoB && pesoA > pesoC) {
            System.out.println("La esfera A es la de mayor peso.");
        } else if (pesoB > pesoA && pesoB > pesoC) {
            System.out.println("La esfera B es la de mayor peso.");
        } else if (pesoC > pesoA && pesoC > pesoB) {
            System.out.println("La esfera C es la de mayor peso.");
        } else {
            System.out.println("Las esferas tienen el mismo peso.");
        }
    }
}
