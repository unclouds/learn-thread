package syn;

public class PublicVar {

    public String username = "A";

    public String password = "AA";

    synchronized public void setValue(String username, String password) {

        try {
            this.username = username;
            Thread.sleep(5000);
            this.password = password;
            System.out.println("setValue method thread name=" + Thread.currentThread().getName() + " username=" + username + " password=" + password);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    //该方法前加上synchronized关键字就同步了
    public void getValue() {
        System.out.println("getValue method thread name=" + Thread.currentThread().getName() + " username=" + username + " password=" + password);
    }

    public static void main(String[] args) {
        try {
            PublicVar publicVar = new PublicVar();
            DirtyReadA dirtyReadA = new DirtyReadA(publicVar);
            dirtyReadA.start();
            Thread.sleep(200);
            //打印结果受此值大小影响
            publicVar.getValue();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
