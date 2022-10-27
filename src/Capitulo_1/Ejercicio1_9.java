package Capitulo_1;

public class Ejercicio1_9 {
    
    public static void main(String[] args) {
        
        /*Se tienen dos variables, a y b. Escribe las asignaciones necesarias 
        para intercambiar sus valores, sean cuales sean.*/
        
        System.out.println("INTERCAMBIO DE VALORES");
        System.out.println("----------------------");
        
        int a = 4;
        int b = 6;
        int aux;
        
        aux = a;
        a = b;
        b = aux;
        
        System.out.println(a);
        System.out.println(b);
        
    }
    
}
