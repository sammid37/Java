public class HelloWorldJoin extends Thread {
    public void run() {
        System.out.println("Hello World");
    }
    public static void main(String[] args) {
        System.out.println("Iniciando ...");
        HelloWorldJoin t = new HelloWorldJoin();
        t.start();

        try {
            t.join();
        } catch (Exception e) {
            System.out.println(e);
        }
        
        System.out.println("Terminando ...");
    }
}