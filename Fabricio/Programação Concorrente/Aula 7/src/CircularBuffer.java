import java.util.concurrent.Semaphore;

public class CircularBuffer {
    Semaphore mutex;
    Semaphore empty;
    Semaphore full;
    int in;
    int out;
    int[] buffer;

    public CircularBuffer(int size) {
        buffer = new int[size];
        in = 0;
        out = 0;
        mutex = new Semaphore(1);
        empty = new Semaphore(size);
        full = new Semaphore(0);
    }

    public void produce(int item) throws InterruptedException {
        empty.acquire();
        mutex.acquire();
        buffer[in] = item;
        in = (in + 1) % buffer.length;
        System.out.println("Produzindo: " + item);
        mutex.release();
        full.release();
    }

    public int consume() throws InterruptedException {
        full.acquire();
        mutex.acquire();
        int x = buffer[out];
        out = (out + 1) % buffer.length;
        System.out.println("Consumindo: " + x);
        mutex.release();
        empty.release();
        return x;
    }
}

class Consumer extends Thread {
    private CircularBuffer buffer;

    public Consumer(CircularBuffer buffer) {
        this.buffer = buffer;
    }

    @Override
    public void run() {
        try {
            for (int i = 0; i < 10; i++) {
                buffer.consume();
                sleep(1500);
            }
        } catch (Exception e) {
            // TODO: handle exception
        }
    }
}

class Producer extends Thread {
    private CircularBuffer buffer;

    public Producer(CircularBuffer buffer) {
        this.buffer = buffer;
    }

    @Override
    public void run() {
        try {
            for (int i = 0; i < 10; i++) {
                buffer.produce(i);
                sleep(1000);
            }
        } catch (Exception e) {
            // TODO: handle exception
        }
    }
}
