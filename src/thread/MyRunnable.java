package thread;

public class MyRunnable implements Runnable {
    public void run() {
        System.out.println("实现Runnable启动一个线程");
    }

    public static void main(String[] args) {
        MyRunnable myRunnable = new MyRunnable();
        new Thread(myRunnable).start();
        new Thread(myRunnable).start();
    }
}
