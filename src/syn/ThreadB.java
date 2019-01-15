package syn;

/**
 * @Description 参见TestThread.java
 * @Author rcss_j
 * @Date 2019/1/7 15:44
 * @Param
 * @Return
 * @Exception
 */
public class ThreadB extends Thread {

    private HasSelfPrivateNum hasSelfPrivateNum;

    public ThreadB(HasSelfPrivateNum hasSelfPrivateNum) {
        super();
        this.hasSelfPrivateNum = hasSelfPrivateNum;
    }

    @Override
    public void run() {
        super.run();
        hasSelfPrivateNum.addName("b");
    }
}
