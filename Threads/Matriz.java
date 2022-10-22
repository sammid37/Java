// LP2 - Threads, matriz
// Main e Cálculo Sequencial
// Samantha D. Medeiros @ 22/09/2022
/*
    Exibindo o tempo de calcular o produto de 
    duas matrizes quadrada A e B em segundos
 
    Foram utilizados o cálculo sequencial, Threads 
    para cada célula da matriz, Thread por Quadrante 
    e Pool de Threads
 */


import java.util.Random;

// Thread Principal, main
public class Matriz {

    // Métodos de preenchimento da matrizR = mA x mB
    private static void Sequencial(int[][] mA, int[][] mB) {
        System.out.println("Sequencial");
        int r = mA.length;
        int c = mA[0].length;
        int[][] mR = new int[r][c];

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                mR[i][j] = mA[i][j] * mB[i][j];
            }
        }
    }

    private static void ThreadCell(int[][] mA, int[][] mB) {
        System.out.println("Threads by cell");
    }
    private static void ThreadQuadrant(int[][] mA, int[][] mB) {
        System.out.println("Threads w/ quadrant");
    }

    private static void PoolThread(int[][] mA, int[][] mB) {
        System.out.println("Pool Thread");
    }

    public static void main (String[] args) {
        // Passando argumentos string para tipo int
        // Row (linha) e col (coluna) da matriz, ex: 100 x 100
        int row = Integer.parseInt(args[0]);
        int col = Integer.parseInt(args[1]);
        int d3 = Integer.parseInt(args[2]);

        // será utilizado para preencher as matrizes A e B
        Random rand = new Random();

        // Declarando as matrizes quadradas A e B
        int[][] matrizA = new int[row][col];
        int[][] matrizB = new int[row][col];

        // Preenchendo as matrizes A e B com valores aleatórios entre 0 e 10
        for(int i = 0; i < row; i++) {
            for(int j = 0; j < col; j++) {
                matrizA[i][j] = rand.nextInt(11);
                matrizB[i][j] = rand.nextInt(11);
            }
        }

        // Declarando as matrizes resultantes
        // int[][] matrizSeq = new int[row][col]; // seq
        // int[][] matrizThread = new int[row][col]; // thread por célula
        // int[][] matrizThreadQua = new int[row][col]; // thread por quadrante
        // int[][] matrizPoolThread = new int[row][col]; // pool de threads

        //~ Calcula o tempo em segundos de cada método de preenchdimento da matriz AxB
        // tempo sequencial - ts
        long iniS = System.currentTimeMillis();
        Sequencial(matrizA, matrizB);
        long fimS = System.currentTimeMillis();
        float ts = (fimS - iniS) / 1000F;
        System.out.println(ts + " secs");
       
        // tempo threads by cell - tc
        // tempo threads by quadrant - tq
        // tempo pool de threads - tp
    }
}