
package ejercicio15;

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
        
        System.out.println("peso esfera D: ");
        double pesoD = scanner.nextDouble();

                // Verifica si hay una bola diferente y si es más pesada o más ligera
        if (pesoA == pesoB && pesoB == pesoC) {
            // La bola D es diferente
            if (pesoD > pesoA) {
                System.out.println("La bola D es diferente y mas pesada.");
            } else {
                System.out.println("La bola D es diferente y mas ligera.");
            }
        } else if (pesoA == pesoB) {
            // La bola C es diferente
            if (pesoC > pesoA) {
                System.out.println("La bola C es diferente y mas pesada.");
            } else {
                System.out.println("La bola C es diferente y mas ligera.");
            }
        } else if (pesoA == pesoC) {
            // La bola B es diferente
            if (pesoB > pesoA) {
                System.out.println("La bola B es diferente y mas pesada.");
            } else {
                System.out.println("La bola B es diferente y mas ligera.");
            }
        } else {
            // La bola A es diferente
            if (pesoA > pesoB) {
                System.out.println("La bola A es diferente y mas pesada.");
            } else {
                System.out.println("La bola A es diferente y mas ligera.");
            }
        }
    }
}
        
       
        
        
        
        
        
    
    

