package advice;

import java.io.PipedInputStream;

public class ReadThread extends Thread {
    private ReadMethod read;
    private PipedInputStream pipedInputStream;

    public ReadThread(ReadMethod read, PipedInputStream pipedInputStream) {
        super();
        this.read = read;
        this.pipedInputStream = pipedInputStream;
    }

    @Override
    public void run() {
        read.readMethod(pipedInputStream);
    }
}
