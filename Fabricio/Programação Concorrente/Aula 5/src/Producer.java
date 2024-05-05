public class Producer implements Runnable {

    private Buffer buffer;
    private String name;

    public Producer(Buffer buffer, int id) {
        this.buffer = buffer;
        this.name = Integer.toString(id);
    }

    @Override
    public void run() {
        try {
            while (true) {
                int value = (int)(Math.random() * 10);
                buffer.produce(value);
                Thread.currentThread().setName("Numero: " + name);
                System.out.println("Produtor " + Thread.currentThread().getName() + " - Valor: " + value);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
