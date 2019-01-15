package advice;

import java.util.Date;

public class TestIsolationOfThreadVariable {

    public static void main(String[] args) {
        try {
            for (int i = 0; i < 10; i++) {
                System.out.println("       在Main线程中取值=" + Tools.inheritableThreadLocalExt.get());
                Thread.sleep(100);
            }
            Thread.sleep(5000);
            ThreadA a = new ThreadA();
            a.start();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    static public class Tools {
        //        public static ThreadLocalExt tl = new ThreadLocalExt();
        public static InheritableThreadLocalExt inheritableThreadLocalExt = new InheritableThreadLocalExt();
    }



    //    static public class ThreadLocalExt extends ThreadLocal {
//        @Override
//        protected Object initialValue() {
//            return new Date().getTime();
//        }
//    }
    static public class InheritableThreadLocalExt extends InheritableThreadLocal {
        @Override
        protected Object initialValue() {
            return new Date().getTime();
        }

        @Override
        protected Object childValue(Object parentValue) {
            return parentValue + " 我在子线程加的~!";
        }
    }


    static public class ThreadA extends Thread {

        @Override
        public void run() {
            try {
                for (int i = 0; i < 10; i++) {
                    System.out.println("在ThreadA线程中取值=" + Tools.inheritableThreadLocalExt.get());
                    Thread.sleep(100);
                }
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }
}
