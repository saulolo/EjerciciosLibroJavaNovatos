package Capitulo_1;

/* @author: Saulolo */

public class Ejercicio1_15 {
    
    public static void main(String[] args) {
        
        /*¿Puedes adivinar qué salida por pantalla produce este programa antes 
        de ejecutarlo? Necesitarás buscar primero qué significan los operadores 
        += y %=*/
        
        System.out.println("EJECUTA DE CABEZA");
        System.out.println("-----------------");
        
        int num = 5;
        num += num - 1 * 4 + 1;
        System.out.println(num);
        //Imprime 7
        num = 4; 
        num %= 7 *
        num % 3 * 7;
        System.out.println(num);
        
        
    }
}
