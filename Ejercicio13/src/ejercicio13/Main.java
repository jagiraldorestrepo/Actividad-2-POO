
package ejercicio13;

import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Obtener datos del usuario

        
        System.out.println("Ingrese el valor de la compra: ");
        double valor_compra = scanner.nextDouble();
        
        
        System.out.println("Ingrese el color (blanca, verde, amarilla, azul, roja) ");
        String color = scanner.next();
        
        double total;
        double dcto;
        
        if ("blanca".equals(color)){ dcto = valor_compra * 0.00;}
        else if ("verde".equals(color)){ dcto = valor_compra * 0.10;}
        else if ("amarilla".equals(color)){ dcto = valor_compra * 0.25;}
        else if ("azul".equals(color)){ dcto = valor_compra * 0.50;}
        else      { dcto = valor_compra*1;}  
        
        total = valor_compra - dcto;
        
        System.out.println("descuento: " + dcto );
        System.out.println("El cliente debe pagar: " + total );

    }
    
}
