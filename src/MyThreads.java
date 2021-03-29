public class MyThreads extends Thread {
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("child class");
        }
    }
}
class Extends {
    public static void main(String[] args) {
        MyThreads m = new MyThreads();
        m.start();
        for (int i = 0; i < 5; i++) {
            System.out.println("main class");
        }
    }
}