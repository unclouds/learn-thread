package syn;

public class DirtyReadA extends Thread {

    private PublicVar publicVar;

    public DirtyReadA(PublicVar publicVar) {
        super();
        this.publicVar = publicVar;
    }

    @Override
    public void run() {
        super.run();
        publicVar.setValue("B", "BB");
    }
}
