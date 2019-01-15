package thread;

public class MyThread extends Thread {
    @Override
    public void run(){
        System.out.println("继承Thread启动一个线程");
    }
    //test
    public static void main(String[] args) {
        new MyThread().start();
        System.out.println("main finished");
        new MyThread().start();
    }
}