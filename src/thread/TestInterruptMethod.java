package thread;

public class TestInterruptMethod extends Thread {
    @Override
    public void run() {
        super.run();
        for (int i = 0; i < 5000000; i++) {
            System.out.println("i=" + (i + 1));
        }
    }

    public static void main(String[] args) {
        try {
            TestInterruptMethod testInterruptMethod = new TestInterruptMethod();
            testInterruptMethod.start();
            testInterruptMethod.sleep(2000);
            testInterruptMethod.interrupt();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
