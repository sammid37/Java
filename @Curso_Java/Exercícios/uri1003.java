package EstruturaSequencial;
// Curso Java, Introdução 
// Exercícios do URI Online Judge (atual Bee Crowd)
// 1003 

import java.util.Scanner;
import java.util.Locale;

public class uri1003 {
    public static void main (String [] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n1, n2;
        int soma;

        n1 = sc.nextInt();
        n2 = sc.nextInt();

        soma = n1+n2;
        System.out.printf("SOMA = %d%n", soma);

        sc.close();
    }
}