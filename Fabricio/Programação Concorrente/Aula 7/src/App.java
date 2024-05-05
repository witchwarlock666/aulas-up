public class App {
    public static void main(String[] args) throws Exception {
        CircularBuffer buffer = new CircularBuffer(5);
        Producer producer = new Producer(buffer);
        Consumer consumer = new Consumer(buffer);

        producer.start();
        consumer.start();
    }
}
