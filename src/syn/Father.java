package syn;

public class Father {

    public int i = 10;

    synchronized public void doFatherMethod() {
        try {
            i--;
            System.out.println("father print i=" + i);
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

