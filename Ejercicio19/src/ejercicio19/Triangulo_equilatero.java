
package ejercicio19;


public class Triangulo_equilatero {
    double lado;

    public Triangulo_equilatero(double lado) {
        this.lado = lado;
    }

    
    public double perimetro(){
        return 3* lado;
    
    }
    
    public double altura(){
        return (Math.sqrt(3)*lado)/2;
    
    }
    
    public double area(){
        return (lado*altura())/2;
 
    } 
}
