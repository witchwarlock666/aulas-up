import java.util.concurrent.Semaphore;

public class ServerClient {
    private Semaphore semaphore;

    public ServerClient(int maxConn) {
        semaphore = new Semaphore(maxConn);
    }

    public void makeRequest(int requestId) {
        try {
            semaphore.acquire();
            System.out.println("Request "+ requestId +" is being processed with a connection.");
            Thread.sleep(1000);
            System.out.println("Request "+ requestId +" processing is complete.");
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            semaphore.release();
        }
    }

    public static void main(String[] args) {
        final int TOTAL_REQUESTS = 1000;
        final int MAX_CONNECTIONS = 20;

        ServerClient connPool = new ServerClient(MAX_CONNECTIONS);

        for (int i = 0; i < TOTAL_REQUESTS; i++) {
            final int requestId = i + 1;
            Thread requestThread = new Thread(() -> connPool.makeRequest(requestId));
            requestThread.start();
        }
    }


}
