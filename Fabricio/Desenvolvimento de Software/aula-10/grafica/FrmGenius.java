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

    public FrmGenius(Genius logicaGenius) {
        this.logicaGenius = logicaGenius;

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

        red.addActionListener(new ActionBotao(Cor.VERMELHO, logicaGenius));
        green.addActionListener(new ActionBotao(Cor.VERDE, logicaGenius));
        blue.addActionListener(new ActionBotao(Cor.AZUL, logicaGenius));
        yellow.addActionListener(new ActionBotao(Cor.AMARELO, logicaGenius));
    }

    public void animarBotoes() {
        ThreadAnimacoesBotoes animacao = new ThreadAnimacoesBotoes(red, green, blue, yellow, logicaGenius);
        animacao.run();
    }

    public void sortear() {
        logicaGenius.sortearCor();
    }
}
