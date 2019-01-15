package thread;

public class TestInterruptUseBreak extends Thread {
    @Override
    public void run() {
        super.run();
        for (int i = 0; i < 500000; i++) {
            if (this.interrupted()) {
                System.out.println("停止!");
                break;
            }
            System.out.println("i=" + (i + 1));
        }
        System.out.println("线程并未终止------");
    }

    public static void main(String[] args) {
        try {
            TestInterruptUseBreak testInterruptUseBreak = new TestInterruptUseBreak();
            testInterruptUseBreak.start();
            testInterruptUseBreak.sleep(2000);
            testInterruptUseBreak.interrupt();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("end!");
    }
}
