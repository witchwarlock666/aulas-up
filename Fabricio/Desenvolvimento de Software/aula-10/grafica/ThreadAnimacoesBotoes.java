package grafica;

import javax.swing.JButton;
import javax.swing.JOptionPane;

import logica.Genius;
import logica.Genius.Cor;

import java.awt.Color;

public class ThreadAnimacoesBotoes extends Thread {
    private JButton red, green, blue, yellow;
    private Genius logicaGenius;

    public ThreadAnimacoesBotoes(JButton red, JButton green, JButton blue, JButton yellow, Genius logicaGenius) {
        this.red = red;
        this.green = green;
        this.blue = blue;
        this.yellow = yellow;
        this.logicaGenius = logicaGenius;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(500);
            for (Cor cor : logicaGenius.getCoresSorteadas()) {
                switch (cor) {
                    case VERMELHO:
                        red.setBackground(Color.GRAY);
                        Thread.sleep(500);
                        red.setBackground(Color.RED);
                        Thread.sleep(100);
                        break;
                    case VERDE:
                        green.setBackground(Color.GRAY);
                        Thread.sleep(500);
                        green.setBackground(Color.GREEN);
                        Thread.sleep(100);
                        break;
                    case AZUL:
                        blue.setBackground(Color.GRAY);
                        Thread.sleep(500);
                        blue.setBackground(Color.BLUE);
                        Thread.sleep(100);
                        break;
                    case AMARELO:
                        yellow.setBackground(Color.GRAY);
                        Thread.sleep(500);
                        yellow.setBackground(Color.YELLOW);
                        Thread.sleep(100);
                        break;
                }
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }
}
