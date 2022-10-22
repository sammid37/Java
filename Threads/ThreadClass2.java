// LPII - Threads
// Classe Thread
// Samantha D. Medeiros @ 05/09/2022

// package Threads;

// Implementando a Thread e a Thread Main
class MyThread extends Thread {
    /*
        O método run() é executado quando a Thread é inicializada, 
        sendo assim, a  mensagem recebida pelo método
        irá se repetir 10 vezes
    */
    private String message;
    public MyThread(String m) { message = m; }
    public void run() {
        for(int i = 0; i < 10; i++) {
            System.out.println(message);
        }
    }
}
public class ThreadClass2 {
    public static void main(String[] args) {
        // instanciando 2 objs. Thread
        MyThread t1, t2; 
        t1 = new MyThread("Thread #1");
        t2 = new MyThread("Thread #2");
        
        // inicializando as Threads
        /*
         Quando as Threads forem inicializadas, a saída pode ser uma das combinações possíveis das saídas de t1 e t2

         Ou seja, pode sair as 10 repetições de t1 e em segudia as 10 repetições de t2
         */
        t1.start();
        t2.start();
    }
}