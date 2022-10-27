package Capitulo_1;

public class Ejercicio1_5 {
    
    public static void main(String[] args) {
        
        /*Calcula el valor de estas expresiones, sabiendo que 
        a = 2, b = 5 y c = 8:
        */
        
        System.out.println("CÁLCULO EXPRESIONES ARITMÉTICAS");
        System.out.println("-------------------------------");
        
        int a = 2;
        int b = 5;
        int c = 8;
        
        
        //a) 4 / 2 * 3 / 6 + 6 / 2 / 1 /4 * 2
        System.out.println("a) 4 / 2 * 3 / 6 + 6 / 2 / 1 /4 * 2 = " + 
                4 / 2 * 3 / 6 + 6 / 2 / 1 /4 * 2);
        
        //b) (7 * (10 – 5) % 3) * 4 +9
        System.out.println("b) (7 * (10 – 5) % 3) * 4 + 9 = " 
                + (7 * (10 - 5) % 3) * 4 + 9) ; 
        
        //c) 3 * a – 4 * b /Math.pow(c, 2)
        System.out.println("c) 3 * a – 4 * b /Math.pow(c, 2) = " 
                + (3 * a - 4 * b / Math.pow(c, 2)));
        
        //d) 7 % 5 % 3
        System.out.println("d) 7 % 5 % 3 = " + 7 % 5 % 3);
        
        //e) b * a – Math.pow(b, 2* 4 / c)
        System.out.println("e) b * a – Math.pow(b, 2* 4 / c) = " + 
                (b * a - Math.pow(b, (2 * 4 / c ))));
        
        //f) Math.sqrt(Math.pow(b,2))
        System.out.println("f) Math.sqrt(Math.pow(b,2)) = " 
                + Math.sqrt(Math.pow(b,2)));
        
        //g) (((b + c) / 2 * a + 10) * 3 * b) - 6
        System.out.println("g) (((b + c) / 2 * a + 10) * 3 * b) - 6 = " + 
                (((b + c) / 2 * a + 10) * 3 * b) );
        
        //h) Math.sqrt(b*b)
        System.out.println("h) Math.sqrt(b*b) = " + Math.sqrt(b*b));
        
        //i) 7 / 2 
        System.out.println("i) 7 / 2 = " + 7 / 2);
        
        //j) Math.round(81.4) + Math.round(81.6)
        System.out.println("j) Math.round(81.4) + Math.round(81.6) = " 
                + Math.round(81.4) + Math.round(81.6));
        
        //k) 7 % 2 
        System.out.println("k) 7 % 2 = " + 7 % 2);
        
        //l) Math.round(Math.sqrt(c))> Math.abs(-(a^2))
        System.out.println("Math.round(Math.sqrt(c)) > Math.abs(-(a^2)) = " 
                + (Math.abs(-(a^2)) > Math.round(Math.sqrt(c))));
        
        //m) 0 % 5 
        System.out.println("0 % 5 = " + 0 % 5);
        
        //n) 7 * 10 – 50 % 3 * 4 + 9
        System.out.println("n) 7 * 10 – 50 % 3 * 4 + 9 = " 
                + (7 * 10 - 50 % 3 * 4 + 9));
        
        
    }
    
}
