
package ejercicio18;

public class Empleado {
    int codigo;
    String nombre;
    double h_trabajadas, valor_h, retefuente;
  
    public Empleado(int codigo, String nombre, double h_trabajadas, double valor_h, double retefuente) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.h_trabajadas = h_trabajadas;
        this.valor_h = valor_h;
        this.retefuente = retefuente;
    }
    
    
    public double calc_salario_bruto(){
        return h_trabajadas * valor_h;
        
    }
    
    public double calc_salario_neto(){
        double salario_bruto = calc_salario_bruto();
        double salario_neto = salario_bruto - (salario_bruto *retefuente);
        return salario_neto;

    }
    

}
