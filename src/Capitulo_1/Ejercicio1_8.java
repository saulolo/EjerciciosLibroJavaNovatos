package Capitulo_1;

public class Ejercicio1_8 {
    
    public static void main(String[] args) {
        
        /*¿Cuál es la salida por pantalla de cada una de estas secuencias de
        asignaciones?*/
        
        System.out.println("SALIDA POR PANTALLA");
        System.out.println("-------------------");
        
        
//        //A)
//        int a, b, c;
//        a = 3;
//        b = 4;
//        c = a + 2 * b;
//        c = c + b;
//        b = c - a;
//        a = b * c;
//        System.out.println(a + b + c);
//        //Salida por pantalla => 207
        
//        //B)
//        double x;
//        x = 2.0;
//        x = Math.pow((x + x), 2);
//        x = Math.sqrt(x + Math.sqrt(x) + 5);
//        System.out.println(x);
//        //Salida por pantalla => 5.0
        
        //C
        int x, y;
        boolean z;
        x = 5;
        y = x - 2;
        x = y * y + 1;
        z = (x > (y + 5));
        System.out.println("x vale " + x + ", y vale " + y + " y z vale " + z);
        //Salida por pantalla => x vale 10, y vale 3 y z vale true
        
        //D
        int a, b;
        a = 10;
        b = 5;
        a = b;
        b = a;
        System.out.println(a + b);
        //Salida por pantalla => 10
        
    }
    
}
