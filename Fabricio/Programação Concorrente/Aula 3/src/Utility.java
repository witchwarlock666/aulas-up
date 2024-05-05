public class Utility {
    int i;
    boolean bool = false;

    public synchronized void set(int i) throws InterruptedException {
        while (this.bool) {
            wait();
        }

        this.i = i;
        this.bool = true;
        System.out.println("Producer " + i);
        notify();
    }

    public synchronized void get() throws InterruptedException {
        while (!this.bool) {
            wait();
        }

        this.bool = false;
        System.out.println("Consumer " + i);
        notify();
    }
}
