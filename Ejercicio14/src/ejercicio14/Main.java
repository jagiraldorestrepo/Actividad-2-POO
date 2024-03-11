
package ejercicio14;

import java.util.Scanner;

public class Main {

   
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Obtener datos del usuario

        System.out.println("Ventas del dpto 1: ");
        double vd1 = scanner.nextDouble();
        
        System.out.println("Ventas del dpto 2: ");
        double vd2 = scanner.nextDouble();
        
        System.out.println("Ventas del dpto 3: ");
        double vd3 = scanner.nextDouble();
        
        System.out.println("Salario de los vendedores: ");
        double salar = scanner.nextDouble();
        
        double totven = vd1 + vd2 + vd3;
        double porven = 0.33 * totven ;
        
        double salar1, salar2, salar3;
        
        if ( vd1 > porven ) { salar1 = salar + 0.2*salar;}
        else  { salar1 = salar; }
        
        if ( vd2 > porven ) { salar2 = salar + 0.2*salar;}
        else  { salar2 = salar; }
        
        if ( vd3 > porven ) { salar3 = salar + 0.2*salar;}
        else  { salar3 = salar; }

        System.out.println("Salario de vendedores dpto 1: " + salar1);
        System.out.println("Salario de vendedores dpto 2: " + salar2);
        System.out.println("Salario de vendedores dpto 3: " + salar3);
       
        
    }
    
}
