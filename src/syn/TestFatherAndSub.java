package syn;

public class TestFatherAndSub extends Thread {

    @Override
    public void run() {
        Sub sub = new Sub();
        sub.doSubMethod();
    }

    public static void main(String[] args) {
        TestFatherAndSub testFatherAndSub = new TestFatherAndSub();
        testFatherAndSub.start();
    }
}
