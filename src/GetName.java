public class GetName extends Thread {

}
class ThreadDem{
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName());
        Thread.currentThread().setName("child");
        System.out.println(Thread.currentThread().getName());
    }
}
