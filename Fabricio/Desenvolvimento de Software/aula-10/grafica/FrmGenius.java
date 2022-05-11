package grafica;

import javax.swing.JButton;
import javax.swing.JFrame;

import java.awt.GridLayout;
import java.awt.Dimension;
import java.awt.Color;

public class FrmGenius extends JFrame {
    public FrmGenius() {
        this.setLayout(new GridLayout(2, 2, 10, 10));

        JButton btn = new JButton();
        btn.setMinimumSize(new Dimension(50, 50));
        btn.setBackground(Color.RED);
        this.add(btn);

        btn = new JButton();
        btn.setMinimumSize(new Dimension(50, 50));
        btn.setBackground(Color.GREEN);
        this.add(btn);

        btn = new JButton();
        btn.setMinimumSize(new Dimension(50, 50));
        btn.setBackground(Color.BLUE);
        this.add(btn);

        btn = new JButton();
        btn.setMinimumSize(new Dimension(50, 50));
        btn.setBackground(Color.YELLOW);
        this.add(btn);

        this.pack();
        this.setSize(600, 600);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
