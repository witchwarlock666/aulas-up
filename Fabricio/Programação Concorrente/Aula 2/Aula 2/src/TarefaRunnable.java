public class TarefaRunnable implements Runnable {

    private String nome;
    private int tempo;

    public TarefaRunnable(String nome, int tempo) {
        this.nome = nome;
        this.tempo = tempo;
    }

    @Override
    public void run() {
        try {
            for (int i = 0; i < 10; i++) {
                System.out.println(nome + ": Contador: " + i);
                Thread.sleep(tempo);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(nome + " Terminou a execução");
    }
    
}
