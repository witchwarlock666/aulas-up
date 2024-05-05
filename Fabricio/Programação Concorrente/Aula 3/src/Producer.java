public class Producer implements Runnable {
    private Utility utility;

    public Producer(Utility utility) {
        this.utility = utility;
        Thread producer = new Thread(this, "Producer");
        producer.start();
    }

    @Override
    public void run() {
        int i = 0;
        while (true) {
            try {
                Thread.sleep(1000);
                utility.set(++i);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    
}
