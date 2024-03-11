
package ejercicio12;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Obtener datos del usuario

        System.out.println("Ingrese nombre del trabajador: ");
        String nombre = scanner.nextLine();
        

        System.out.println("Ingrese numero de horas trabajadas: ");
        double h_trabajadas = scanner.nextDouble();
        
        
        System.out.println("Ingrese valor de hora: ");
        double valor_h = scanner.nextDouble();
    
        Trabajador empleado = new Trabajador(nombre, h_trabajadas, valor_h);
        
        System.out.println("El trabajador: " + empleado.nombre + " devengo $"  
        + empleado.salario()) ;
  

    }
    
}
