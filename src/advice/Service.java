package advice;

public class Service {
    public void testMethod(Object lock) {
        try {
            synchronized (lock) {
                System.out.println("begin wait()");
                lock.wait();
                System.out.println("  end wait()");
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
            System.out.println("出现异常了，因为呈wait状态的线程被interrupt了！");
        }
    }

    public static void main(String[] args) {
        try {
            Object lock = new Object();

            ServiceThreadA serviceThreadA = new ServiceThreadA(lock);
            serviceThreadA.start();
            Thread.sleep(5000);
            serviceThreadA.interrupt();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
