package syn;

public class Sub extends Father {

    synchronized public void doSubMethod() {
        try {
            while (i > 0) {
                i--;
                System.out.println("sub print i=" + i);
                Thread.sleep(100);
                this.doFatherMethod();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
