package syn;

/**
 * @Description 参见TestThread.java
 * @Author rcss_j
 * @Date 2019/1/7 15:44
 * @Param
 * @Return
 * @Exception
 */
public class ThreadA extends Thread {
    private HasSelfPrivateNum hasSelfPrivateNum;

    public ThreadA(HasSelfPrivateNum hasSelfPrivateNum) {
        super();
        this.hasSelfPrivateNum = hasSelfPrivateNum;
    }

    @Override
    public void run() {
        super.run();
        hasSelfPrivateNum.addName("a");
    }
}
