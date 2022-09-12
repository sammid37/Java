// Curso Java, Introdução 
// Entrada e saída de dados

import java.util.Scanner;
import java.util.Locale;

public class dados_entrada {
    public static void main (String [] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in); // Utiliza-se para informar que valores serão lidos

        /*
        >> Especificando o tipo de valor a ser lido
         sc.next() -> ler uma string
         sc.next().charAt(0) -> ler o primeiro character
         sc.nextLine() -> ler várias strings
         sc.nextInt() -> ler inteiro
         sc.nextDouble -> ler número de ponto flutuante
        */

        int num;
        String s1, s2, s3;
        char letra;
        
        // Ler um texto até a quebra de linha
        num = sc.nextInt();
        sc.nextLine(); // garante que não haja problema para ler os próximos textos
        s1 = sc.nextLine();
        s2 = sc.nextLine();
        s3 = sc.nextLine();
        letra = sc.next().charAt(0);

        System.out.println("Você informou: ");
        System.out.println(num);
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        System.out.println(letra);

        sc.close(); // sempre tem de fechar o scanner
    }
    
}
