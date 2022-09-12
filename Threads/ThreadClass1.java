// LPII - Threads
// Classe Thread
// Samantha D. Medeiros @ 05/09/2022

package Threads;

// Implementando na classe Thread 
// Thread Principal
public class ThreadClass1 extends Thread {
    public void run(){
        System.out.println("Hello World");
    }
    public static void main(String[] args) {
        // Instanciando e inicializando obj. Thread
        ThreadClass1 t = new ThreadClass1();
        t.start();
    }
}
