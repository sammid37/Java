public class Demo extends Thread {
    public static void main(String[] args) {
        System.out.println("1 A");
        Demo d = new Demo();
        d.start(); // inicia a thread, método run()
        System.out.println("2 B");
        try {
            d.join(); // coloca a thread em espera
        }
        catch(Exception e) {
            System.out.println(e);
        }
        System.out.println("3 C");
    }
    public void run() {
        System.out.println("4 D");
        System.out.println("5 E");
    }
}
