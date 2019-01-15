package syn;

public class MyThread extends Thread {

    @Override
    public void run() {
        MyThread myThread=new MyThread();
        myThread.service1();
    }

    synchronized public void service1() {
        System.out.println("service1");
        service2();
    }

    synchronized public void service2() {
        System.out.println("service2");
        service3();
    }

    synchronized public void service3() {
        System.out.println("service3");
    }

    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        myThread.start();
    }
}
