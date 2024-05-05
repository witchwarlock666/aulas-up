public class App {
    public static void main(String[] args) throws Exception {
        Utility utility = new Utility();
        Producer producer = new Producer(utility);
        Consumer consumer = new Consumer(utility);
    }
}
