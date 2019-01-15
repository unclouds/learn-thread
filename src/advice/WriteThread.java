package advice;

import java.io.PipedOutputStream;

public class WriteThread extends Thread {
    private WriteMethod write;
    private PipedOutputStream pipedOutputStream;

    public WriteThread(WriteMethod write, PipedOutputStream pipedOutputStream) {
        super();
        this.write = write;
        this.pipedOutputStream = pipedOutputStream;
    }

    @Override
    public void run() {
        write.writeMethod(pipedOutputStream);
    }
}
