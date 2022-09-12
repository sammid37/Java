// Curso Java, Introdução 
// Exercícios do URI Online Judge (atual Bee Crowd)
// 1002

import java.util.Scanner;
import java.util.Locale;

public class uri1002 {
    public static void main (String [] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double pi = 3.14159;
        double raio = sc.nextDouble();

        double area = pi * (Math.pow(raio, 2));

        System.out.printf("A=%.4f%n", area);

        sc.close();
    }
}
