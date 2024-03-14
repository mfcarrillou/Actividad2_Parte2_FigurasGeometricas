package actividad2_figurasgeometricas;

import java.util.Scanner;

public class PruebaFiguras {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Circulo fig1 = new Circulo();
        Rectangulo fig2 = new Rectangulo();
        Cuadrado fig3 = new Cuadrado();
        TrianguloRectangulo fig4 = new TrianguloRectangulo();
        
        System.out.println("Ingrese el radio del círculo, en centímetros: ");
        fig1.radio = entrada.nextDouble();
        
        System.out.println("\nIngrese la base del rectángulo, en centímetros: ");
        fig2.base = entrada.nextDouble();
        System.out.println("Ingrese la altura del rectángulo, en centímetros: ");
        fig2.altura = entrada.nextDouble();
        
        System.out.println("\nIngrese la longitud de uno de los lados del cuadrado, en centímetros: ");
        fig3.lado = entrada.nextDouble();
        
        System.out.println("\nIngrese la base del triángulo, en centímetros: ");
        fig4.base = entrada.nextDouble();
        System.out.println("Ingrese la altura del triángulo, en centímetros: ");
        fig4.altura = entrada.nextDouble();
        
        System.out.println("\nEl área del círculo es: " + fig1.calcularArea() + " centímetros cuadrados");
        System.out.println("El perímetro del círculo es: " + fig1.calcularPerimetro() + " centímetros");
        
        System.out.println("\nEl área del rectángulo es: " + fig2.calcularArea() + " centímetros cuadrados");
        System.out.println("El perímetro del rectángulo es: " + fig2.calcularPerimetro() + " centímetros");
        
        System.out.println("\nEl área del cuadrado es: " + fig3.calcularArea() + " centímetros cuadrados");
        System.out.println("El perímetro del cuadrado es: " + fig3.calcularPerimetro() + " centímetros");
        
        System.out.println("\nEl área del triángulo es: " + fig4.calcularArea() + " centímetros cuadrados");
        System.out.println("El perímetro del triángulo es: " + fig4.calcularPerimetro() + " centímetros");
        fig4.tipoTriangulo();
    }
    
}
