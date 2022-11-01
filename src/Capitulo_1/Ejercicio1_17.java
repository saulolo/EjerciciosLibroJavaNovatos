package Capitulo_1;

import java.util.Random;
import java.util.Scanner;

/* @author: Saulolo */

public class Ejercicio1_17 {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        /*Escribe un programa en Java que genere cinco caracteres al azar. 
        Cuando lo hayas conseguido, modifícalo para que genere únicamente 
        vocales al azar.*/
        
        System.out.println("LETRAS AL AZAR");
        System.out.println("--------------");
        
        final String vocal = "abcdefghijklmnñopqrstuvwxyz";
        int longitud = 5;
        String letra;
        double aleatorio;
        
        
        StringBuilder sb = new StringBuilder();
        
        for (int i = 0; i < longitud; i++) {
            aleatorio = Math.random() * vocal.length();
            int posicion = (int) aleatorio;
            char lyrics = vocal.charAt(posicion);
            sb.append(lyrics);
        }
        
        System.out.println(sb.toString() + " = " + sb.length());
        
        
        //EL del libro mucho mas sencillo
        System.out.println(" ");
        System.out.println("============");
        System.out.println("El del libro");
        System.out.println(" ");
        
        char caracterAletorio;
        caracterAletorio = (char) (Math.random() * 26 + 'A');
        
        System.out.println(caracterAletorio);
        
    }

}
