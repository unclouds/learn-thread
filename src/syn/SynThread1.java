package syn;

public class SynThread1 extends Thread{

    private Task task;


    public SynThread1(Task task) {
        super();
        this.task = task;
    }

    @Override
    public void run() {
        super.run();
        CommonUtils.beginTime1 = System.currentTimeMillis();
        task.doLongTimeTask();
        //updateTask.doLongTimeTask();
        CommonUtils.endTime1 = System.currentTimeMillis();
    }
}
