package Threads;

class Prioridade extends Thread {
    private String message;
    public Prioridade(String m) {message = m;}
    public void run() {
        System.out.println("Iniciando " + message);
        for(int i = 0; i < 10; i++);
            for(int j = 0; j < 10; j++);
                for(int k = 0; k < 10; k++);
        System.out.println("Terminando " + message);
    }
}

public class ThreadPriority {
    public static void main(String[] args) {
        Prioridade t1, t2;
        t1 = new Prioridade("Primeira");
        t2 = new Prioridade("Segunda");

        t1.setPriority(10);
        t2.setPriority(1);
        
        t1.start();
        t2.start();
    }
}
