package actividad2_figurasgeometricas;

public class Rectangulo {
    double base, altura; //Base y altura del rectángulo en centímetros
    
    protected double calcularArea(){
        return base * altura;
    }
    
    protected double calcularPerimetro(){
        return (base + altura) * 2;
    }
    
}
