package thread;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

public class MyThread3 implements Callable<String> {
    public String call() throws Exception {
        return "callable+futureTask，通过future.get()获取";
    }
    public static void main(String[] args) throws Exception{
        Callable<String> myThread3=new MyThread3();
        FutureTask<String> futureTask=new FutureTask<String>(myThread3);
        new Thread(futureTask).start();
        //通过futureTask.get()获取结果
        System.out.println(futureTask.get());
    }
}
