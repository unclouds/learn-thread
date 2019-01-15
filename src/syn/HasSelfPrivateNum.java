package syn;

/**
 * @Description 相关类：ThreadA.java,ThreadB.java
 * @Author rcss_j
 * @Date 2019/1/7 15:40
 * @Param
 * @Return
 * @Exception
 */
public class HasSelfPrivateNum {

    private int num = 0;

    synchronized public void addName(String username) {
        try {
            if (username.equals("a")) {
                num = 100;
                System.out.println("a set over!");
                Thread.sleep(2000);//如果去掉thread.sleep(2000)，那么运行结果就会显示为同步的效果
            } else {
                num = 200;
                System.out.println("b set over!");
            }
            System.out.println(username + " num=" + num);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        HasSelfPrivateNum hasSelfPrivateNum = new HasSelfPrivateNum();
        HasSelfPrivateNum hasSelfPrivateNum1 = new HasSelfPrivateNum();
        ThreadA threadA = new ThreadA(hasSelfPrivateNum);
        threadA.start();
        ThreadB threadB = new ThreadB(hasSelfPrivateNum1);
        threadB.start();
    }
}
