package Capitulo_1;

/* @author: Saulolo */

public class Ejercicio1_11 {

    public static char getLetra() {
        return (char) (Math.random() * 26 + 'a');
    }

    public static void main(String[] args) {

        /*Teclea y ejecuta este programa. ¿Qué es lo que ocurre? ¿Qué son esos
        caracteres que aparecen en la consola al ejecutarlo?*/
        
        System.out.println("GENERADOR DE LETRAS");
        System.out.println("-------------------");

        System.out.println(getLetra());
        System.out.println(getLetra());
        System.out.println(getLetra());
        System.out.println(getLetra());
        
        //Programa para generar letras aleatoriamente.

    }

}