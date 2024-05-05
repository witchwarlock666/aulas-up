import java.util.concurrent.ArrayBlockingQueue;

public class Buffer {
    private ArrayBlockingQueue<Integer> buffer;

    public Buffer(int capacity) {
        buffer = new ArrayBlockingQueue<>(capacity);
    }

    public void produce(int value) throws InterruptedException {
        buffer.put(value);
    }

    public int consume() throws InterruptedException {
        return buffer.take();
    }
}
