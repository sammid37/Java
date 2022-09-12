// Curso Java, Introdução 
// Operações e funções matemáticas
// Java.lang.math

public class matematico {
    public static void main (String [] args) {
        double x, y, z;
        double a, b, c;
        x = 3.0; 
        y = 4.0;
        z = -5.0;

        // Potenciação
        System.out.println("Potenciação");
        a = Math.pow(x,1);
        b = Math.pow(x,2);
        c = Math.pow(x,3);

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);


        // Raiz quadrada
        System.out.println("Raiz quadrada");
        a = Math.sqrt(y);
        b = Math.sqrt(16.0);
        c = Math.sqrt(25.0);

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

        // Valor absoluto
        System.out.println("Valor absoluto");
        a = Math.abs(z);
        System.out.println(a);
    }    
}
