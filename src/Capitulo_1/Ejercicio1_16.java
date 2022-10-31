package Capitulo_1;

/* @author: Saulolo */

public class Ejercicio1_16 {

    public static void main(String[] args) {
       
        /*Escribe un programa que calcule el área y la circunferencia de un 
        círculo cuyo radio estará almacenado en una variable entera llamada r. 
        Tal vez necesites buscar las fórmulas para calcular ambas magnitudes. 
        Comprueba que el programa funciona correctamente para cualquier valor 
        de r. La salida el programa, para r = 5, debería ser algo parecido a 
        esto:
        Radio: 5.
        Longitud de circunferencia: 31,42
        Área de círculo: 78,54
        */
        
        System.out.println("CÁLCULO DE ÁREA Y CIRCUNFERENCIA");
        System.out.println("--------------------------------");
        
        
        double r = 5;
        final double PI = 3.1416;
        double area;
        double longitud;
        
        area = PI * (r * r);
        longitud = PI * (r * 2);
        
        
        System.out.println("Radio: " + r);
        System.out.println("Longitud de circunferencia: " + longitud);
        System.out.println("Área del circulo: " + area);
                
        
        
        
        
        
        
        
        
        
    }
}
