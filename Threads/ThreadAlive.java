// LPII - Threads
// Finalizando Threads
// Samantha D. Medeiros @ 07/09/2022

package Threads;

public class ThreadAlive extends Thread {
    public void run() {
        System.out.println("Hello World");
    }
    public static void main(String[] args) {
        System.out.println("Iniciando");
        ThreadAlive t = new ThreadAlive();
        t.start();
        while (t.isAlive());
        System.out.println("Terminando...");
    }
}
