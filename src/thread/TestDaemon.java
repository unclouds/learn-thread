package thread;

public class TestDaemon extends Thread {
    private int i = 0;

    @Override
    public void run() {
        try {
            while (true) {
                i++;
                System.out.println("i=" + i);
                Thread.sleep(100);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        try {
            TestDaemon testDaemon = new TestDaemon();
            testDaemon.setDaemon(true);
            testDaemon.start();
            Thread.sleep(5000);
            System.out.println("停止！");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
