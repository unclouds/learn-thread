package vola;

public class TestVolatile extends Thread {
    private volatile boolean isRunning = true;
    int m;

    public boolean isRunning() {
        return isRunning;
    }

    public void setRunning(boolean isRunning) {
        this.isRunning = isRunning;
    }

    @Override
    public void run() {
        System.out.println("进入run");
        while (isRunning == true) {
            int a = 2;
            int b = 3;
            int c = a + b;
            m = c;
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(m);
        System.out.println("停止!");
    }

    public static void main(String[] args) throws InterruptedException {
        TestVolatile testVolatile = new TestVolatile();
        testVolatile.start();
        Thread.sleep(1000);
        testVolatile.setRunning(false);
        System.out.println("赋值:false");
    }
}