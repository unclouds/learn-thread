package syn;

public class TestSynObject {

    public void testMethod(MyObject object) {

        synchronized (object) {
            try {
                System.out.println("testMethod ____getLock time=" + System.currentTimeMillis() + " run ThreadName=" + Thread.currentThread().getName());
                Thread.sleep(2000);
                System.out.println("testMethod releaseLock time=" + System.currentTimeMillis() + " run ThreadName=" + Thread.currentThread().getName());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        TestSynObject testSynObject = new TestSynObject();
        MyObject object = new MyObject();
        MyObject object1 = new MyObject();
        SynObjThread1 synObjThread1 = new SynObjThread1(testSynObject, object);
        synObjThread1.setName("a");
        synObjThread1.start();
        SynObjThread2 synObjThread2 = new SynObjThread2(testSynObject, object1);
        synObjThread2.setName("b");
        synObjThread2.start();
    }
}
