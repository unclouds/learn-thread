package advice;

public class TestThreadLocal2 {
    public static ThreadLocalExt threadLocalExt = new ThreadLocalExt();

    public static void main(String[] args) {
        if (threadLocalExt.get() == null) {
            System.out.println("从未放过值");
            threadLocalExt.set("我的值");
        }
        System.out.println(threadLocalExt.get());
        System.out.println(threadLocalExt.get());
    }

    static public class ThreadLocalExt extends ThreadLocal {
        @Override
        protected Object initialValue() {
            return "我是默认值 第一次get不再为null";
        }
    }
}
