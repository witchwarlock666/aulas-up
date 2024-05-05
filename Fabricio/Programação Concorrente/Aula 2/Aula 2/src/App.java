public class App {
    public static void main(String[] args) throws Exception {
        TarefaRunnable tar1 = new TarefaRunnable("Tarefa 1", 1000);
        TarefaRunnable tar2 = new TarefaRunnable("Tarefa 2", 1000);
        TarefaRunnable tar3 = new TarefaRunnable("Tarefa 3", 1500);

        Thread t1 = new Thread(tar1);
        Thread t2 = new Thread(tar2);
        Thread t3 = new Thread(tar3);

        t1.start();
        t2.start();
        t3.start();

        t1.setPriority(Thread.MAX_PRIORITY);
        t2.setPriority(Thread.MIN_PRIORITY);
        t3.setPriority(Thread.NORM_PRIORITY);

        // try {
        //     t1.join(200);
        //     t2.join();
        // } catch (Exception e) {
        //     e.printStackTrace();
        // }

        while (t1.isAlive() && t2.isAlive() && t3.isAlive()) {
            try {
                System.out.println("3 threads vivas");
                Thread.sleep(1000);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
