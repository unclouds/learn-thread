package thread;

public class TestInterruptUseReturn extends Thread {

    @Override
    public void run() {
        while (true) {
            if (this.isInterrupted()) {
                System.out.println("ֹͣ停止了!");
                return;
            }
            System.out.println("timer=" + System.currentTimeMillis());
        }
    }

    public static void main(String[] args) throws InterruptedException {
        TestInterruptUseReturn testInterruptUseReturn = new TestInterruptUseReturn();
        testInterruptUseReturn.start();
        Thread.sleep(2000);
        testInterruptUseReturn.interrupt();
    }
}
