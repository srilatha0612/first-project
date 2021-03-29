public class Extend extends Thread {
    public void run(){
        for (int i=0;i<5;i++){
            System.out.println("main class");
        }
    }
}
class MyThread{
    public static void main(String[] args) {
        Extend e=new Extend();
        e.start();
        for(int i=0;i<5;i++){
            System.out.println("child class");
        }
    }
}
