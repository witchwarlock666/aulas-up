import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class BK {
    public static void main(String[] args) {
        int bufferSize = 10;
        int numProducers = 5;
        int numConsumers = 5;

        Buffer buffer = new Buffer(bufferSize);

        ExecutorService producerPool = Executors.newFixedThreadPool(numProducers);
        ExecutorService consumerPool = Executors.newFixedThreadPool(numConsumers);

        for (int i = 0; i < numProducers; i++) {
            producerPool.execute(new Producer(buffer, i));
        }

        for (int i = 0; i < numProducers; i++) {
            consumerPool.execute(new Consumer(buffer, i));
        }

        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        producerPool.shutdown();
        consumerPool.shutdown();
    }    
}