package advice;

import java.util.ArrayList;
import java.util.List;

public class MyList {
    private static List<String> list = new ArrayList<String>();

    public static void add() {
        list.add("anyString");
    }

    public static int size() {
        return list.size();
    }

    public static void main(String[] args) {
        try {
            Object lock = new Object();
            TestAdviceThreadA testAdviceThreadA = new TestAdviceThreadA(lock);
            testAdviceThreadA.start();
            Thread.sleep(50);
            TestAdviceThreadB testAdviceThreadB = new TestAdviceThreadB(lock);
            testAdviceThreadB.start();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

