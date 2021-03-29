
public class ThreadOverRiding extends Thread {
    public void strat() {

        System.out.println("start method");
    }


    public void run() {

        System.out.println("run method");
    }
}
class  Threading{
public static void main(String[]args){
       ThreadOverRiding t=new ThreadOverRiding();
       t.start();
    System.out.println("main class");
        }

        }
