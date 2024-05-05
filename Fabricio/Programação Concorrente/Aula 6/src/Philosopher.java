import java.util.concurrent.Semaphore;

public class Philosopher {
    private Semaphore fork1;
    private Semaphore fork2;
    private final int id;

    public Philosopher(int id, Semaphore f1, Semaphore f2) {
        this.id = id;
        this.fork1 = f1;
        this.fork2 = f2;
    }

    public void run() {
        while (true) {
            think();
            getLeftFork();
            getRightFork();
            eat();
            releaseLeftFork();
            releaseRightFork();
        }
    }

    private void think() {
        try {
            System.out.println("Filosofo " + id + " está pensando.");
            // Thread.sleep(2000);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void getLeftFork() {
        try {
            fork1.acquire();
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    private void getRightFork() {
        try {
            fork2.acquire();
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    private void eat() {
        try {
            System.out.println("Filosofo " + id + " está comendo.");
            // Thread.sleep(5000);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void releaseLeftFork() {
        fork1.release();
    }

    private void releaseRightFork() {
        fork2.release();
    }
}
