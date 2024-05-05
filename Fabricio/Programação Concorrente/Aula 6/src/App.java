import java.util.concurrent.Semaphore;

public class App {
    public static void main(String[] args) throws Exception {
        Semaphore fork1 = new Semaphore(1);
        Semaphore fork2 = new Semaphore(1);
        Semaphore fork3 = new Semaphore(1);
        Semaphore fork4 = new Semaphore(1);
        Semaphore fork5 = new Semaphore(1);

        Semaphore salt = new Semaphore(4);

        // Philosopher p1 = new Philosopher(1, fork1, fork2);
        // Philosopher p2 = new Philosopher(2, fork2, fork3);
        // Philosopher p3 = new Philosopher(3, fork3, fork4);
        // Philosopher p4 = new Philosopher(4, fork4, fork5);
        // Philosopher p5 = new Philosopher(5, fork5, fork1);

        // PhilosopherSalt p1 = new PhilosopherSalt(1, fork1, fork2, salt);
        // PhilosopherSalt p2 = new PhilosopherSalt(2, fork2, fork3, salt);
        // PhilosopherSalt p3 = new PhilosopherSalt(3, fork3, fork4, salt);
        // PhilosopherSalt p4 = new PhilosopherSalt(4, fork4, fork5, salt);
        // PhilosopherSalt p5 = new PhilosopherSalt(5, fork5, fork1, salt);

        PhilosopherInvert p1 = new PhilosopherInvert(1, fork1, fork2, false);
        PhilosopherInvert p2 = new PhilosopherInvert(2, fork2, fork3, false);
        PhilosopherInvert p3 = new PhilosopherInvert(3, fork3, fork4, false);
        PhilosopherInvert p4 = new PhilosopherInvert(4, fork4, fork5, false);
        PhilosopherInvert p5 = new PhilosopherInvert(5, fork5, fork1, true);

        Thread rt1 = new Thread(() -> p1.run());
        Thread rt2 = new Thread(() -> p2.run());
        Thread rt3 = new Thread(() -> p3.run());
        Thread rt4 = new Thread(() -> p4.run());
        Thread rt5 = new Thread(() -> p5.run());
 
        rt1.start();
        rt2.start();
        rt3.start();
        rt4.start();
        rt5.start();
    }
}
