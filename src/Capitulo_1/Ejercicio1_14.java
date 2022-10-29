package Capitulo_1;

/* @author: Saulolo */

public class Ejercicio1_14 {
    
    public static void main(String[] args) {
        
        /*Los siguientes programas contienen uno o varios errores que hacen que 
        no compilen. Modíficalos hasta que funcionen correctamente.*/
        
        System.out.println("CORRIJE LOS ERRORES");
        System.out.println("-------------------");
        
        /*A)
        int n2 = 30, suma = 0, n3;
        suma = n1 + n2;
        System.out.println("La suma es: " + suma);
        suma = suma + n3;
        System.out.println(suma);
        */

        int n1 = 15;
        int n2 = 30;
        int n3 = 12;
        int suma = n1 + n2;
        System.out.println("La suma es: " + suma);
        suma = suma + n3;
        System.out.println(suma);
        
        /*B)
        int n1 = 5, n2 = 6;
        boolean suma = 0;
        suma = n1 + n2;
        System.out.println(La suma es = suma);
        */
        
        int n4 = 5;int n5 = 6;
        int suma2;
        suma2 = n4 + n5;
        System.out.println("La suma es = " + suma2);
        
        /*C)
        int n = 8;
        cuad = n * n;
        System.out.println("El cuadrado de " + N + " es: " + cuad);
        */
        
        int n = 8;
        int cuad = n * n;
        System.out.println("El cuadrado de " + n + " es: " + cuad);
        
    }
}
