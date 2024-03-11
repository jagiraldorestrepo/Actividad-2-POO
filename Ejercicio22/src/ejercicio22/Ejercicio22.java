
package ejercicio22;
import java.util.Scanner;

public class Ejercicio22 {


    public static void main(String[] args) {
        
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Obtener datos del usuario
        
        System.out.println("Ingrese nombre: ");
        String nombre = scanner.nextLine();
        
        System.out.println("Ingrese salario básico por hora: ");
        double salario = scanner.nextDouble();    
        
        System.out.println("Ingrese horas trabajadas: ");
        double horas = scanner.nextDouble();    
        
       if (salario > 450000){ 
           
       System.out.println("nombre: " + nombre);
       System.out.println("salario mensual: " + salario*horas);
      
       }
       
       else{ System.out.println("nombre: " + nombre) ;}
           
        
    }
    
}
