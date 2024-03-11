
package ejercicio7;

import java.util.Scanner;


public class Main {

    
    public static void main(String[] args) {
        double A, B;
        
        Scanner entrada = new Scanner (System.in);
        
        
        System.out.println("Ingrese el valor de A: ");
        A = entrada.nextDouble();
        
        System.out.println("Ingrese el valor de B: ");
        B = entrada.nextDouble();
        
        if (A > B){ System.out.println("A es mayor que B: ");}
        
        else if (A == B){ System.out.println("A es igual que B: "); }
        
        else { System.out.println("A es menor que B: "); }
        
    }
    
}
