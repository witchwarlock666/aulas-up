package grafica;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

import logica.Genius;
import logica.Genius.Cor;

import java.awt.GridLayout;
import java.awt.Dimension;
import java.awt.Color;

public class FrmGenius extends JFrame {

    private Genius logicaGenius;

    private JButton red;
    private JButton green;
    private JButton blue;
    private JButton yellow;

    public FrmGenius() {
        this.logicaGenius = new Genius();

        this.setLayout(new GridLayout(2, 2, 10, 10));

        red = new JButton();
        red.setMinimumSize(new Dimension(50, 50));
        red.setBackground(Color.RED);
        this.add(red);

        green = new JButton();
        green.setMinimumSize(new Dimension(50, 50));
        green.setBackground(Color.GREEN);
        this.add(green);

        blue = new JButton();
        blue.setMinimumSize(new Dimension(50, 50));
        blue.setBackground(Color.BLUE);
        this.add(blue);

        yellow = new JButton();
        yellow.setMinimumSize(new Dimension(50, 50));
        yellow.setBackground(Color.YELLOW);
        this.add(yellow);

        this.pack();
        this.setSize(600, 600);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void animarBotoes() {
        new Thread() {
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
                                break;
                            case VERDE:
                                green.setBackground(Color.GRAY);
                                Thread.sleep(500);
                                green.setBackground(Color.GREEN);
                                break;
                            case AZUL:
                                blue.setBackground(Color.GRAY);
                                Thread.sleep(500);
                                blue.setBackground(Color.BLUE);
                                break;
                            case AMARELO:
                                yellow.setBackground(Color.GRAY);
                                Thread.sleep(500);
                                yellow.setBackground(Color.YELLOW);
                                break;
                        }
                    }
                }
                catch (Exception ex) {
                    JOptionPane.showMessageDialog(null, ex.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
                }
            }
        };
    }
}
