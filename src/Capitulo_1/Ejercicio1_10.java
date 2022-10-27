package Capitulo_1;

public class Ejercicio1_10 {
    
    public static void main(String[] args) {
        
        /*Se tienen tres variables, a, b y c. Escribe las asignaciones 
        necesarias para intercambiar sus valores, sean cuales sean, de manera 
        que:
        b tome el valor de a
        c tome el valor de b
        a tome el valor de c
        */
        
        System.out.println("INTERCAMBIO DE VALORES A TRES BANDAS");
        System.out.println("------------------------------------");
        
        int aux;
        int a = 4;
        int b = 3;
        int c = 2;
        
        
        aux = a;
        a = c;
        c = b;
        b = aux;
        System.out.println("a = " + a + " b = " + b + " c = " + c);
        
        
    }
    
}
