package ejercicio21;

public class Triangulo {
    
    double ladoA, ladoB,ladoC;
    
    public Triangulo(double ladoA, double ladoB, double ladoC){
         this.ladoA = ladoA;
         this.ladoB = ladoB;
         this.ladoC = ladoC;

    }
    
    double calcularPerimetro(){
        return ladoA + ladoB + ladoC;
          
    }
    
    double calcularSemiPerimetro(){
        return (ladoA + ladoB + ladoC)/2;
          
    }
    
    double calcularArea(){
    
        double s = (ladoA + ladoB + ladoC)/2;
        
        return Math.sqrt(s *(s - ladoA) *(s - ladoB) *  (s - ladoC));

    }
}
