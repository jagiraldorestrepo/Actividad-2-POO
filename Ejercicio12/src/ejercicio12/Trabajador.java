
package ejercicio12;

public class Trabajador {
    String nombre;
    double h_trabajadas;
    double valor_h;

    public Trabajador(String nombre, double h_trabajadas, double valor_h) {
        this.nombre = nombre;
        this.h_trabajadas = h_trabajadas;
        this.valor_h = valor_h;
    }
    
    public double salario(){
        double salario;
        if ( h_trabajadas > 40){
            
            double h_extras = h_trabajadas - 40;
            if (h_extras > 8){
                
                double h_extras_ocho = h_extras - 8;
                salario = 40 * valor_h + 16 * valor_h + h_extras_ocho*3*valor_h;
            }
            
            else{ salario = 40 * valor_h + h_extras*2*valor_h;}
        } 
        
        
        else{ salario = h_trabajadas * valor_h;}
                    

    return salario;
    }
   
}
