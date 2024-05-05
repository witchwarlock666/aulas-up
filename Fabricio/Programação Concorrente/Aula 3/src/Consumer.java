public class Consumer implements Runnable {
    private Utility utility;

    public Consumer (Utility utility) {
        this.utility = utility;
        Thread consumer = new Thread(this, "Consumer");
        consumer.start();
    }

    @Override
    public void run() {
        try {
            while (true) {
                Thread.sleep(5000);
                utility.get();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    
}
