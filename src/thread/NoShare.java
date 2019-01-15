package thread;

public class NoShare extends Thread {

    private int count = 5;

    public NoShare(String name) {
        super();
        this.setName(name);
    }

    @Override
    public void run() {
        super.run();
        while (count > 0) {
            count--;
            System.out.println("由 " + MyThread.currentThread().getName()
                    + " 计算，count=" + count);
        }
    }

    public static void main(String[] args) {
        NoShare a = new NoShare("A");
        NoShare b = new NoShare("B");
        NoShare c = new NoShare("C");
        a.start();
        b.start();
        c.start();
    }
}
