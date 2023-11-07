public class DemoRunnable implements Runnable {
  public static void main(String[] args) {
    System.out.println("A");
    Thread t1 = new Thread(new Demo());
    Thread t2 = new Thread(new Demo());
    t1.start();
    t2.start();
    System.out.println("B");
    try {
      t1.join();
    } catch (Exception e) {
      System.out.println(e);
    }
    System.out.println("C");
    try {
      t2.join();
    } catch (Exception e) {
      System.out.println(e);
    }
  }
  public void run() {
    System.out.print("1");
    System.out.print("2");
  }
}