package advice;

public class TestThreadLocal {
    public static ThreadLocal<String> threadLocal= new ThreadLocal<String>();

    public static void main(String[] args) {
        if (threadLocal.get() == null) {
            System.out.println("为ThreadLocal类对象放入值:aaa");
            threadLocal.set("aaaֵ");
        }
        System.out.println(threadLocal.get());//aaa
        System.out.println(threadLocal.get());//aaa
    }
}
