// LPII - Threads
// Interface Runnable
// Samantha D. Medeiros @ 05/09/2022

// package Threads;

// Implementand a partir da Interface Runnable a Thread Main
/*
 * Implementar com a Interface Runnable
 * permite que possa criar outra classe que extende da classe Thread.
 * 
 * Pois em Java, não é permitido herança múltipla.
 */
class MyRun implements Runnable {
    /*
        O método run() é executado quando a Thread é inicializada, 
        sendo assim, a  mensagem recebida pelo método
        irá se repetir 10 vezes
    */
    private String message;
    public MyRun(String m) { message = m; }
    public void run() {
        for(int i = 0; i < 10; i++) {
            System.out.println(message);
        }
    }
}
public class ThreadRunnable2 {
    public static void main(String[] args) {
        MyRun r1, r2;
        r1 = new MyRun("Thread #1");
        r2 = new MyRun("Thread #2");
        
        Thread t1, t2;
        t1 = new Thread(r1);
        t2 = new Thread(r2);
        /*
            Quando as Threads forem inicializadas, 
            a saída pode ser uma das combinações possíveis das saídas de t1 e t2

            Ou seja, pode sair as 10 repetições de t1 e 
            em segudia as 10 repetições de t2
         */
        t1.start();
        t2.start();
    }
    
}