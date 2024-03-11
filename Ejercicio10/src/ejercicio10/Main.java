
package ejercicio10;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Obtener datos del usuario
        
        System.out.println("Ingrese numero inscripcion: ");
        String inscripcion = scanner.next();
        
        scanner.nextLine();

        System.out.println("Ingrese nombre: ");
        String nombre = scanner.nextLine();
        

        System.out.println("Ingrese patrimonio: ");
        double patrimonio = scanner.nextDouble();
        
        System.out.println("Ingrese estrato: ");
        int estrato = scanner.nextInt();
        

        Matrícula estudiante = new Matrícula(inscripcion, nombre, patrimonio, estrato);
        
        System.out.println("El estudiante con numero de inscripcion: " + estudiante.inscripcion + " y nombre: "  
        + estudiante.nombre + " debe pagar: " + estudiante.liquidacion());
  
        
    }
    
}
