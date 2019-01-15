package syn;

public class SynObjThread2 extends Thread{

    private TestSynObject testSynObject;
    private MyObject object;

    public SynObjThread2(TestSynObject testSynObject, MyObject object) {
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
