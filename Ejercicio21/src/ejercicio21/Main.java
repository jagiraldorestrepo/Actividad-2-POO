package ejercicio21;

import java.util.Scanner;

public class Main {

    
    public static void main(String[] args) {
        
        double ladoA, ladoB, ladoC;
        
        Scanner entrada = new Scanner (System.in);
        
        System.out.println("Ingrese el valor del lado A: ");
        ladoA = entrada.nextDouble();
        
        System.out.println("Ingrese el valor del lado B: ");
        ladoB = entrada.nextDouble();
        
        System.out.println("Ingrese el valor del lado V: ");
        ladoC = entrada.nextDouble();
        
        Triangulo T = new Triangulo(ladoA, ladoB, ladoC);
        
        System.out.println("Perimetro:" +  T.calcularPerimetro()); 
        System.out.println("SemiPerimetro:" +  T.calcularSemiPerimetro()); 
        System.out.println("Area:" + T.calcularArea()); 
        
    }
    
}
