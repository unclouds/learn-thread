package syn;

public class SynThread2 extends Thread{

    private Task task;


    public SynThread2(Task task) {
        super();
        this.task = task;
    }


    @Override
    public void run() {
        super.run();
        CommonUtils.beginTime2 = System.currentTimeMillis();

        task.doLongTimeTask();
        //updateTask.doLongTimeTask();
        CommonUtils.endTime2 = System.currentTimeMillis();
    }
}
