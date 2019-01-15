package thread;

public class Share extends Thread {

    private int count = 5;

    @Override
    public void run() {
        super.run();
        count--;
        System.out.println("由 " + Share.currentThread().getName() + " 计算，count=" + count);
    }

    public static void main(String[] args) {
        Share share = new Share();
        //下列线程都是通过share对象创建的
        Thread a = new Thread(share, "A");
        Thread b = new Thread(share, "B");
        Thread c = new Thread(share, "C");
        Thread d = new Thread(share, "D");
        Thread e = new Thread(share, "E");
        a.start();
        b.start();
        c.start();
        d.start();
        e.start();
    }
}