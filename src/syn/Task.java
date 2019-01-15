package syn;

public class Task {
    private String getData1;
    private String getData2;

    public void doLongTimeTask() {
        try {
            System.out.println("begin task");
            Thread.sleep(3000);
//            getData1 = "长时间处理任务后从远程返回的值1 threadName=" + Thread.currentThread().getName();
//            getData2 = "长时间处理任务后从远程返回的值2 threadName=" + Thread.currentThread().getName();
            String privateGetData1 = "长时间处理任务后从远程返回的值1 threadName=" + Thread.currentThread().getName();
            String privateGetData2 = "长时间处理任务后从远程返回的值2 threadName=" + Thread.currentThread().getName();
            synchronized (this) {
                getData1 = privateGetData1;
                getData2 = privateGetData2;
            }
            System.out.println(getData1);
            System.out.println(getData2);
            System.out.println("end task");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Task task = new Task();
        SynThread1 synThread1 = new SynThread1(task);
        synThread1.start();
        SynThread2 synThread2 = new SynThread2(task);
        synThread2.start();
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        long beginTime = CommonUtils.beginTime1;
        if (CommonUtils.beginTime2 < CommonUtils.beginTime1) {
            beginTime = CommonUtils.beginTime2;
        }
        long endTime = CommonUtils.endTime1;
        if (CommonUtils.endTime2 > CommonUtils.endTime1) {
            endTime = CommonUtils.endTime2;
        }
        System.out.println("耗时：" + ((endTime - beginTime) / 1000));
    }
}


