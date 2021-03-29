public class ThreadOverLoading extends Thread {
    public void run(){
        System.out.println("no arg method");
    }
    public void run(int i){
        System.out.println("int ard method");
    }
}
class MyThreadd{
    public static void main(String[] args) {
        ThreadOverLoading t=new ThreadOverLoading();
        t.start();
    }
}
