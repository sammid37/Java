package EstruturaSequencial;
// Curso Java, Introdução 
// Exercícios do URI Online Judge (atual Bee Crowd)
// 1012

import java.util.Scanner;
import java.util.Locale;

public class uri1012 {
    public static void main (String [] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double a, b, c;
        double pi = 3.14159;
        double triangulo, circulo, trapezio, quadrado, retangulo;

        a = sc.nextDouble();
        b = sc.nextDouble();
        c = sc.nextDouble();

        triangulo = (a * c) / 2.0;
        circulo = pi * c * c;
        trapezio = (a + b) / 2.0 * c;
        quadrado = b * b;
        retangulo = a * b;

        System.out.printf("TRAINGULO: %.3f%n", triangulo);
        System.out.printf("CIRCULO: %.3f%n", circulo);
        System.out.printf("TRAPEZIO: %.3f%n", trapezio);
        System.out.printf("QUADRADO: %.3f%n", quadrado);
        System.out.printf("RETANGULO: %.3f%n", retangulo);

        sc.close();
    }
}