package advice;

public class ServiceThreadA extends Thread {

    private Object lock;

    public ServiceThreadA(Object lock) {
        super();
        this.lock = lock;
    }

    @Override
    public void run() {
        Service service = new Service();
        service.testMethod(lock);
    }
}
