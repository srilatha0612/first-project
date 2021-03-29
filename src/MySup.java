public class MySup extends Thread {
    public void start(){
        super.start();
        System.out.println("start method");
    }
    public void run(){
        System.out.println("run method");
    }
}
class My{
    public static void main(String[] args) {
        MySup m=new MySup();
        m.start();
        System.out.println("main class");
    }
}
