package vola;

public class TestVolatileAtomicity extends Thread {
    volatile public static int count;

    private static void addCount() {
        for (int i = 0; i < 100; i++) {
            count = i;
        }
        System.out.println("count=" + count);

    }

    @Override
    public void run() {
        addCount();
    }

    public static void main(String[] args) {
        TestVolatileAtomicity[] testVolatileAtomicities = new TestVolatileAtomicity[100];
        for (int i = 0; i < 100; i++) {
            testVolatileAtomicities[i] = new TestVolatileAtomicity();
        }
        for (int i = 0; i < 100; i++) {
            testVolatileAtomicities[i].start();
        }
    }
}
