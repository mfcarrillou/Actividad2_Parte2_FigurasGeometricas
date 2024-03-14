package actividad2_figurasgeometricas;

public class TrianguloRectangulo {
    double base, altura; //Base y altura del triángulo en centímetros
    double h; //Hipotenusa del triángulo (Tercer lado)
    
    protected double calcularArea(){
        return (base * altura)/2;
    }
    
    protected double calcularHipotenusa(){
        return Math.sqrt(Math.pow(base,2) + Math.pow(altura,2));
    }
    
    protected double calcularPerimetro(){
        return base + altura + calcularHipotenusa();
    }
    
    protected void tipoTriangulo(){
        h = calcularHipotenusa();
        if( base == altura && base == h){
           System.out.println("El triángulo es un triángulo equilátero");
        } else if ( base != altura && base != h) {
           System.out.println("El triángulo es un triángulo escaleno");
        } else{
           System.out.println("El triángulo es un triángulo isósceles");
        }
    }
    
}
