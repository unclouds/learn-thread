package thread;

public class TestPrioritySon extends Thread {

    @Override
    public void run() {
        System.out.println("son run priority=" + this.getPriority());
    }

    public static void main(String[] args) {
        System.out.println("main thread begin priority="
                + Thread.currentThread().getPriority());
        Thread.currentThread().setPriority(4);
        System.out.println("main thread end   priority="
                + Thread.currentThread().getPriority());
        TestPriorityFather testPriorityFather=new TestPriorityFather();
        testPriorityFather.start();
    }
}
