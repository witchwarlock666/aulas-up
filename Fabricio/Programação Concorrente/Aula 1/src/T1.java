public class T1 implements Runnable {
    @Override
    public void run() {
        try {
            Thread.sleep(1000);
            System.out.println("Tarefa 1");
        } catch (Exception e) {
            // TODO: handle exception
        }
        
    }
}
