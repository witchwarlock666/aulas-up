package logica;

import java.util.ArrayList;
import java.util.Random;

import javax.swing.JOptionPane;

public class Genius {
    public enum Cor {
        VERMELHO,
        VERDE,
        AZUL,
        AMARELO
    }

    private ArrayList<Cor> coresSorteadas;
    private ArrayList<Cor> coresJogador;
    private boolean gameOver, aguardando;
    private int pontos;

    public Genius() {
        coresSorteadas = new ArrayList<Cor>();
        coresJogador = new ArrayList<Cor>();
        gameOver = false;
        pontos = -1;
    }
    
    public boolean getAguardando() {
        return aguardando;
    }

    public void setAguardando(boolean bool) {
        this.aguardando = bool;
    }

    public void setPontos() {
        this.pontos += 1;
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
                boolean match = true;
                gameOver();
                try {
                    JOptionPane.showMessageDialog(null, "Voce perdeu!\nPontuacao: " + pontos, "Perdeu", JOptionPane.ERROR_MESSAGE);
                } catch (Exception e) {
                    match = true;
                }
                try {
                    if (JOptionPane.showOptionDialog(null, "Deseja continuar?", "Genius", JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE, null, null, null) == JOptionPane.NO_OPTION) match = false;
                } catch (Exception e) {
                    match = true;
                }
                pontos = -1;
                return match;
            }
        }
        if (coresJogador.size() == coresSorteadas.size()) {
            this.aguardando = false;
            limparListaJogador();
        }
        return true;
    }

    public void limparListaJogador() {
        this.coresJogador.clear();
    }

    public void gameOver() {
        limparListaJogador();
        this.coresSorteadas.clear();
        this.gameOver = true;
    }

    public boolean checkGameOver() {
        return gameOver;
    }
}
