package actividad2_figurasgeometricas;

public class Cuadrado {
    double lado; //Longitud de los lados del cuadrado en centímetros
    
    protected double calcularArea(){
        return Math.pow(lado,2);
    }
    
    protected double calcularPerimetro(){
        return lado * 4;
    }
    
}
