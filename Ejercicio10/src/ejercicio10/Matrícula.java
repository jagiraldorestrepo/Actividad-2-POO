/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio10;

public class Matrícula {
    
    String inscripcion;
    String nombre;
    double patrimonio;
    int estrato;

    public Matrícula(String inscripcion, String nombre, double patrimonio, int estrato) {
        this.inscripcion = inscripcion;
        this.nombre = nombre;
        this.patrimonio = patrimonio;
        this.estrato = estrato;
    }
    
    
    public double liquidacion(){
        
        double pago_matricula = 50000;
        
        if ( patrimonio > 2000000 && estrato > 3){
            pago_matricula = 50000 + 0.03*patrimonio;  
        }
        
        return pago_matricula;
    
    }
         

}
