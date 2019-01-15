package thread;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class MyThread4 {
    public static void main(String[] args) throws Exception {
        //缓存线程池，4大线程池之一
        ExecutorService threadPool = Executors.newCachedThreadPool();
        Future<String> future = threadPool.submit(new Callable<String>() {
            public String call() throws Exception {
                return "callable+线程池，通过future.get()获取";
            }
        });
        System.out.println(future.get());
    }
}
