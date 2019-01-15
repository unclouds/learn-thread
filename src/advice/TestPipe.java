package advice;

import java.io.PipedInputStream;
import java.io.PipedOutputStream;

public class TestPipe {
    public static void main(String[] args) {
        try {
            WriteMethod writeData = new WriteMethod();
            ReadMethod readData = new ReadMethod();
            PipedInputStream inputStream = new PipedInputStream();
            PipedOutputStream outputStream = new PipedOutputStream();
            // inputStream.connect(outputStream);
            outputStream.connect(inputStream);
            ReadThread readThread = new ReadThread(readData, inputStream);
            readThread.start();
            Thread.sleep(2000);
            WriteThread writeThread = new WriteThread(writeData, outputStream);
            writeThread.start();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
