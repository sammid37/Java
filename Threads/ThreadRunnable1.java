// LPII - Threads
// Interface Runnable
// Samantha D. Medeiros @ 05/09/2022

// package Threads;

public class ThreadRunnable1 implements Runnable {
    public void run() {
        System.out.println("Hello World");
    }
    public static void main(String[] args) {
        /* 
            Criando e inicializando uma Thread implementada 
            a partir da interface runnable  
        */
        ThreadRunnable1 h = new ThreadRunnable1();
        Thread t = new Thread(h);
        t.start();
    }
}