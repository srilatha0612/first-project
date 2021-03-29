public class Impl implements Runnable {
    @Override
    public void run() {
        for (int i=0;i<5;i++){
            System.out.println("child class");
        }
    }
}
class Thrdd{
    public static void main(String[] args) {
        Impl ii=new Impl();
        Thread t=new Thread(ii);
        t.start();
        for (int i=0;i<5;i++){
            System.out.println("main class");
        }
    }
}
