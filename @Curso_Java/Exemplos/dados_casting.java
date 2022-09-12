// Curso Java, Introdução 
// Casting 

import java.util.Locale;
public class dados_casting {
    public static void main (String [] args) {
        Locale.setDefault(Locale.US);
        double raio = 2.5;
        double pi = 3.1421;
        double area_circulo = pi*(raio*raio);

        // Imprimindo a área do círculo com quebra de linha %n
        System.out.printf("A área do círculo é: " + "%.2f%n", area_circulo);
        System.out.printf("A área do círculo é %.2f%n", area_circulo);

        // Casting, quando queremos forçar a mudança de tipo float para int (por exemplo)
        int area = (int) area_circulo;
        System.out.printf("A área do ciirculo é de aproximadamente: %d%n", area);
    }  
}