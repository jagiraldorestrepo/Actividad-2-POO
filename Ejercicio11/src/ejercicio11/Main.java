
package ejercicio11;

import java.util.Scanner;

public class Main {

   
    public static void main(String[] args) {
        double A, B, C;
        
        Scanner entrada = new Scanner (System.in);
        
        
        System.out.println("Ingrese el valor de A: ");
        A = entrada.nextDouble();
        
        System.out.println("Ingrese el valor de B: ");
        B = entrada.nextDouble();
        
        System.out.println("Ingrese el valor de C: ");
        C = entrada.nextDouble();
        
        if ( (A > B) && (A > C)){ System.out.println("A: " + A + " es el mayor");}
        
        else if (B > C){ System.out.println("B: " + B + " es el mayor"); }
        
        else { System.out.println("C: " + C + " es el mayor"); }

    } 
        
    
}
