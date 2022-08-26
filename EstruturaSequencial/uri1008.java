package EstruturaSequencial;
// Curso Java, Introdução 
// Exercícios do URI Online Judge (atual Bee Crowd)
// 1008

import java.util.Scanner;
import java.util.Locale;

public class uri1008 {
    public static void main (String [] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int id_funcionario, horas_trabalhadas;
        double salario_hora;
        
        id_funcionario = sc.nextInt();
        horas_trabalhadas = sc.nextInt();
        salario_hora = sc.nextDouble();
        
        double salario = horas_trabalhadas*salario_hora;

        System.out.printf("NUMBER = %d%n", id_funcionario);
        System.out.printf("SALARY = U$ %.2f%n", salario);

        sc.close();
    }
}
