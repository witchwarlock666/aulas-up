package logica;

import java.util.ArrayList;
import java.util.Random;

public class Genius {
    public enum Cor {
        VERMELHO,
        VERDE,
        AZUL,
        AMARELO
    }

    private ArrayList<Cor> coresSorteadas;
    private ArrayList<Cor> coresJogador;

    public Genius() {
        coresSorteadas = new ArrayList<Cor>();
        coresJogador = new ArrayList<Cor>();
    }

    public ArrayList<Cor> getCoresSorteadas() {
        return coresSorteadas;
    }

    public ArrayList<Cor> getCoresJogador() {
        return coresJogador;
    }

    public void sortearCor() {
        Random rnd = new Random();
        int i = rnd.nextInt(4);
        Cor corSorteada = Cor.values()[i];
        coresSorteadas.add(corSorteada);
    }

    public void lerCor(Cor corJogador) {
        coresJogador.add(corJogador);
    }

    public boolean compararCores() {
        for (int i = 0; i < coresJogador.size(); i++) {
            if (coresSorteadas.get(i) != coresJogador.get(i)) {
                return false;
            }
        }
        return true;
    }

    public void limparListaJogador() {
        this.coresJogador.clear();
    }

    public void gameOver() {
        limparListaJogador();
        this.coresSorteadas.clear();
    }
}
