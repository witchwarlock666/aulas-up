import java.util.concurrent.Semaphore;

public class Utility {
    int i;
    boolean bool = false;

    private Semaphore semaphore;

    public Utility() {
        semaphore = new Semaphore(1);
    }

    public void set(int i) {
        try {
            semaphore.acquire();
            this.i = i;
            this.bool = true;
            System.out.println("Producer " + i);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void get() {
        try {
            this.bool = false;
            System.out.println("Consumer " + i);
            semaphore.release();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
