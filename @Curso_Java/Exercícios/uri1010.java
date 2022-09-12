package EstruturaSequencial;
// Curso Java, Introdução 
// Exercícios do URI Online Judge (atual Bee Crowd)
// 1010

import java.util.Scanner;
import java.util.Locale;

public class uri1010 {
    public static void main (String [] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int cod_a, cod_b;
        int qtd_a, qtd_b;
        double prc_a, prc_b;
        double total;

        cod_a = sc.nextInt();
        qtd_a = sc.nextInt();
        prc_a = sc.nextDouble();

        cod_b = sc.nextInt();
        qtd_b = sc.nextInt();
        prc_b = sc.nextDouble();

        total = qtd_a*prc_a + qtd_b*prc_b;

        System.out.printf("VALOR A PAGAR: R$ %.2f%n", total);

        sc.close();
    }
}