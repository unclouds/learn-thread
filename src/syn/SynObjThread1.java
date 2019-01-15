package syn;

public class SynObjThread1 extends Thread {

    private TestSynObject testSynObject;
    private MyObject object;

    public SynObjThread1(TestSynObject testSynObject, MyObject object) {
        super();
        this.testSynObject = testSynObject;
        this.object = object;
    }

    @Override
    public void run() {
        super.run();
        testSynObject.testMethod(object);
    }
}
