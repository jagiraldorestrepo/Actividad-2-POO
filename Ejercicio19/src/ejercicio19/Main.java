
package ejercicio19;

import java.util.Scanner;

public class Main {

    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner (System.in);
        
        System.out.println("Ingrese el lado del triangulo:");
        double lado = scanner.nextInt();
        
        Triangulo_equilatero t = new Triangulo_equilatero(lado);
        
        
        System.out.println("lado: " + t.lado);
        System.out.println("perimetro: " + t.perimetro() );
        System.out.println("altura: " +  t.altura() );
        System.out.println("area: " + t.area() );
    }
    
}
