
package ejercicio18;

import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Obtener datos del usuario
        System.out.println("Ingrese el codigo del empleado: ");
        int codigo = scanner.nextInt();
        
        System.out.println("Ingrese el nombre del empleado: ");
        String nombre = scanner.next();

        System.out.println("Ingrese las horas trabajadas, (ej: 40,0) : ");
        double h_trabajadas = scanner.nextDouble();

        System.out.println("Ingrese el valor por hora, (ej: 10,0) : ");
        double valor_h = scanner.nextDouble();

        System.out.println("Ingrese la retención de fuente (como decimal, por ejemplo, 0,1 para 10%): ");
        double retefuente = scanner.nextDouble();
        
        Empleado empleado = new Empleado(codigo, nombre, h_trabajadas, valor_h, retefuente);

        System.out.println("Codigo: " + empleado.codigo);
        System.out.println("Nombre: " + empleado.nombre);
        System.out.println("Salario bruto: " + empleado.calc_salario_bruto());
        System.out.println("Salario neto: " + empleado.calc_salario_neto());

    }
}
