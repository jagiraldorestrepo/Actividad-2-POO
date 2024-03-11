
package ejercicio23;

import java.util.Scanner;


public class Ejercicio23 {


    public static void main(String[] args) {
               double A, B, C;
        
        Scanner entrada = new Scanner (System.in);
        
        
        System.out.println("Ingrese el valor de A: ");
        A = entrada.nextDouble();
        
        System.out.println("Ingrese el valor de B: ");
        B = entrada.nextDouble();
        
        System.out.println("Ingrese el valor de C: ");
        C = entrada.nextDouble();
        
        double x1 = (-B + Math.sqrt(Math.pow(B,2)- 4*A*C))/2*A;
        double x2 = (-B - Math.sqrt(Math.pow(B,2)- 4*A*C))/2*A;
        
        System.out.println("Las soluciones x1,x2 de la ecuacion con coeficientes A,B,C son: ");
        System.out.println("x1: " + x1);
        System.out.println("x2: " + x2);
        
     
    }
    
}
