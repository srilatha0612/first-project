public class SuperThread extends Thread {
    public void strat() {
        super.start();
        System.out.println("start method");
    }

    public void run() {
        System.out.println("run method");
    }
}
class MySuper{
    public static void main(String[] args) {
        SuperThread s=new SuperThread();
        s.strat();
        System.out.println("main method");
    }
}
