import java.util.concurrent.Semaphore;

public class PhilosopherSalt {
    private Semaphore fork1;
    private Semaphore fork2;
    private Semaphore salt;
    private final int id;

    public PhilosopherSalt(int id, Semaphore f1, Semaphore f2, Semaphore salt) {
        this.id = id;
        this.fork1 = f1;
        this.fork2 = f2;
        this.salt = salt;
    }

    public void run() {
        while (true) {
            think();
            getSalt();
            getLeftFork();
            getRightFork();
            eat();
            releaseLeftFork();
            releaseRightFork();
            releaseSalt();
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

    private void getSalt() {
        try {
            salt.acquire();
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
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

    private void releaseSalt() {
        salt.release();
    }
}
