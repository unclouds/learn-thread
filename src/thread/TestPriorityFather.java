package thread;

public class TestPriorityFather extends Thread {
    @Override
    public void run() {
        System.out.println("Father run priority=" + this.getPriority());
        TestPrioritySon testPrioritySon = new TestPrioritySon();
        testPrioritySon.start();
    }
}
