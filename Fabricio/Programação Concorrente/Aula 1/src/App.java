public class App {
    public static void main(String[] args) throws Exception {
        Thread t1 = new Thread(new T1());
        Thread t2 = new Thread(new T2());

        t1.start();
        t2.start();
    }
}
