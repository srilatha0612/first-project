public class MyRunnable implements Runnable {
    @Override
    public void run() {
         for (int i=0;i<5;i++){
             System.out.println("cild class");
         }
    }
}
class MyDemo{
    public static void main(String[] args) {
        MyRunnable mm=new MyRunnable();
        Thread t=new Thread(mm);
        t.start();
        for (int i=0;i<5;i++){
            System.out.println("main class");
        }
    }
}