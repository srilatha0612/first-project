public class Yield1 extends Thread {
    public void run(){
        Thread.currentThread().setPriority(4);
            Thread.yield();
            System.out.println("child thread ");
        }
    }
class demon{
    public static void main(String[] args) {
        Yield1 y=new Yield1();
        y.start();
        Thread.currentThread().setPriority(10);
        System.out.println("main thread");
    }
}
