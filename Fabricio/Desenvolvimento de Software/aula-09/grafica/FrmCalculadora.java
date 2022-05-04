package grafica;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

import logica.Calculadora;
import logica.Calculadora.Operacao;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FrmCalculadora extends JFrame {
    private JTextField txtDisplay;
    private Calculadora calculadora;
    public FrmCalculadora() {
        // Instanciar a Calculadora
        this.calculadora = new Calculadora();

        // Define layout do JFrame
        // Divide em 5 regiões: Norte, Sul, Leste, Oeste e Centro
        setLayout(new BorderLayout());

        // JPanel Norte
        JPanel pnlNorte = new JPanel(new BorderLayout());
        this.add(pnlNorte, BorderLayout.NORTH);
        this.txtDisplay = new JTextField();
        txtDisplay.setEditable(false);
        pnlNorte.add(this.txtDisplay, BorderLayout.CENTER);
        txtDisplay.setText("0");

        // JPanel Centro
        JPanel pnlCentro = new JPanel(new GridLayout(5, 4, 5, 5));
        this.add(pnlCentro, BorderLayout.CENTER);

        JButton btn = new JButton("C");
        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calculadora.setOperando1(0);
                calculadora.setOperando2(0);
                calculadora.setAguardando(false);
                txtDisplay.setText("0");
            }
        });         
        pnlCentro.add(btn);

        btn = new JButton("<html>a<sup>b</sup></html>");
        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {                
                String txtAntigo = txtDisplay.getText();
                txtAntigo = txtAntigo.replaceAll("[a-zA-Z]", "");
                txtAntigo = removeCommas(txtAntigo);
                calculadora.setOperando1(Double.parseDouble(txtAntigo.replace(",", ".")));
                calculadora.setOperacao(Operacao.POTENCIA);
                txtDisplay.setText("0");
                calculadora.setAguardando(true);
            }
        });        
        pnlCentro.add(btn);

        btn = new JButton("\u232B");
        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {                
                String txtAntigo = txtDisplay.getText();
                if (txtAntigo.length() > 0) {
                    txtDisplay.setText(txtAntigo.substring(0, txtAntigo.length() - 1));
                    txtAntigo = txtAntigo.replaceAll("[a-zA-Z]", "");
                    txtAntigo = removeCommas(txtAntigo);
                }
                if (txtAntigo.length() == 1) {
                    txtDisplay.setText("0");
                }
            }
        });         
        pnlCentro.add(btn);

        btn = new JButton("*");
        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {                
                String txtAntigo = txtDisplay.getText();
                txtAntigo = txtAntigo.replaceAll("[a-zA-Z]", "");
                txtAntigo = removeCommas(txtAntigo);
                calculadora.setOperando1(Double.parseDouble(txtAntigo.replace(",", ".")));
                calculadora.setOperacao(Operacao.MULTIPLICACAO);
                calculadora.setAguardando(true);
                txtDisplay.setText("0");
            }
        });        
        pnlCentro.add(btn);

        btn = new JButton("7");
        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {                
                String txtAntigo = txtDisplay.getText();
                if (!txtAntigo.equals("0")) {
                txtDisplay.setText(txtAntigo.concat("7"));
                txtAntigo = txtAntigo.replaceAll("[a-zA-Z]", "");
                txtAntigo = removeCommas(txtAntigo);
                }
                else {
                    txtDisplay.setText("7");
                }
            }
        });        
        pnlCentro.add(btn);

        btn = new JButton("8");
        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {                
                String txtAntigo = txtDisplay.getText();
                if (!txtAntigo.equals("0")) {
                    txtDisplay.setText(txtAntigo.concat("8"));
                    txtAntigo = txtAntigo.replaceAll("[a-zA-Z]", "");
                    txtAntigo = removeCommas(txtAntigo);
                }
                else {
                    txtDisplay.setText("8");
                }
            }
        });        
        pnlCentro.add(btn);

        btn = new JButton("9");
        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {                
                String txtAntigo = txtDisplay.getText();
                if (!txtAntigo.equals("0")) {
                    txtDisplay.setText(txtAntigo.concat("9"));
                    txtAntigo = txtAntigo.replaceAll("[a-zA-Z]", "");
                    txtAntigo = removeCommas(txtAntigo);
                }
                else {
                    txtDisplay.setText("9");
                }
            }
        });        
        pnlCentro.add(btn);

        btn = new JButton("/");
        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {                
                String txtAntigo = txtDisplay.getText();
                txtAntigo = txtAntigo.replaceAll("[a-zA-Z]", "");
                txtAntigo = removeCommas(txtAntigo);
                calculadora.setOperando1(Double.parseDouble(txtAntigo.replace(",", ".")));
                calculadora.setOperacao(Operacao.DIVISAO);
                calculadora.setAguardando(true);
                txtDisplay.setText("0");
            }
        });     
        pnlCentro.add(btn);

        btn = new JButton("4");
        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {                
                String txtAntigo = txtDisplay.getText();
                if (!txtAntigo.equals("0")) {
                    txtDisplay.setText(txtAntigo.concat("4"));
                    txtAntigo = txtAntigo.replaceAll("[a-zA-Z]", "");
                    txtAntigo = removeCommas(txtAntigo);
                }
                else {
                    txtDisplay.setText("4");
                }
            }
        });        
        pnlCentro.add(btn);

        btn = new JButton("5");
        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {                
                String txtAntigo = txtDisplay.getText();
                if (!txtAntigo.equals("0")) {
                    txtDisplay.setText(txtAntigo.concat("5"));
                    txtAntigo = txtAntigo.replaceAll("[a-zA-Z]", "");
                    txtAntigo = removeCommas(txtAntigo);
                }
                else {
                    txtDisplay.setText("5");
                }
            }
        });        
        pnlCentro.add(btn);

        btn = new JButton("6");
        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {                
                String txtAntigo = txtDisplay.getText();
                if (!txtAntigo.equals("0")) {
                    txtDisplay.setText(txtAntigo.concat("6"));
                    txtAntigo = txtAntigo.replaceAll("[a-zA-Z]", "");
                    txtAntigo = removeCommas(txtAntigo);
                }
                else {
                    txtDisplay.setText("6");
                }
            }
        });        
        pnlCentro.add(btn);

        btn = new JButton("+");
        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {                
                String txtAntigo = txtDisplay.getText();
                txtAntigo = txtAntigo.replaceAll("[a-zA-Z]", "");
                txtAntigo = removeCommas(txtAntigo);
                calculadora.setOperando1(Double.parseDouble(txtAntigo.replace(",", ".")));
                calculadora.setOperacao(Operacao.SOMA);
                calculadora.setAguardando(true);
                txtDisplay.setText("0");
            }
        });        
        pnlCentro.add(btn);

        btn = new JButton("1");
        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {                
                String txtAntigo = txtDisplay.getText();
                if (!txtAntigo.equals("0")) {
                    txtDisplay.setText(txtAntigo.concat("1"));
                    txtAntigo = txtAntigo.replaceAll("[a-zA-Z]", "");
                    txtAntigo = removeCommas(txtAntigo);
                }
                else {
                    txtDisplay.setText("1");
                }
            }
        });
        pnlCentro.add(btn);

        btn = new JButton("2");
        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {                
                String txtAntigo = txtDisplay.getText();
                if (!txtAntigo.equals("0")) {
                    txtDisplay.setText(txtAntigo.concat("2"));
                    txtAntigo = txtAntigo.replaceAll("[a-zA-Z]", "");
                    txtAntigo = removeCommas(txtAntigo);
                }
                else {
                    txtDisplay.setText("2");
                }
            }
        });
        pnlCentro.add(btn);

        btn = new JButton("3");
        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {                
                String txtAntigo = txtDisplay.getText();
                if (!txtAntigo.equals("0")) {
                    txtDisplay.setText(txtAntigo.concat("3"));
                    txtAntigo = txtAntigo.replaceAll("[a-zA-Z]", "");
                    txtAntigo = removeCommas(txtAntigo);
                }
                else {
                    txtDisplay.setText("3");
                }
            }
        });        
        pnlCentro.add(btn);

        btn = new JButton("-");
        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {                
                String txtAntigo = txtDisplay.getText();
                txtAntigo = txtAntigo.replaceAll("[a-zA-Z]", "");
                txtAntigo = removeCommas(txtAntigo);
                calculadora.setOperando1(Double.parseDouble(txtAntigo.replace(",", ".")));
                calculadora.setOperacao(Operacao.SUBTRACAO);
                calculadora.setAguardando(true);
                txtDisplay.setText("0");
            }
        });     
        pnlCentro.add(btn);

        btn = new JButton("+/-");
        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {                
                String txtAntigo = txtDisplay.getText();
                if (txtAntigo.charAt(0) == '-') {
                    txtAntigo = txtAntigo.substring(1);
                }
                else {
                    if (!txtAntigo.equals("0")) {
                        txtAntigo = "-" + txtAntigo;
                    }
                }
                txtDisplay.setText(txtAntigo);
                txtAntigo = txtAntigo.replaceAll("[a-zA-Z]", "");
                txtAntigo = removeCommas(txtAntigo);
            }
        });     
        pnlCentro.add(btn);

        btn = new JButton("0");
        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {                
                String txtAntigo = txtDisplay.getText();
                if (!txtAntigo.equals("0")) {
                    txtDisplay.setText(txtAntigo.concat("0"));
                }
                txtAntigo = txtAntigo.replaceAll("[a-zA-Z]", "");
                txtAntigo = removeCommas(txtAntigo);
            }
        });        
        pnlCentro.add(btn);

        btn = new JButton(",");
        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {                
                String txtAntigo = txtDisplay.getText();                
                if (!txtAntigo.contains(",")) {
                    txtDisplay.setText(txtAntigo.concat(","));
                }
                txtAntigo = txtAntigo.replaceAll("[a-zA-Z]", "");
            }
        });          
        pnlCentro.add(btn);

        btn = new JButton("=");
        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) { 
                if (calculadora.isAguardando()) {
                    String txtAntigo = txtDisplay.getText();
                    txtAntigo = txtAntigo.replaceAll("[a-zA-Z]", "");
                    txtAntigo = removeCommas(txtAntigo);
                    calculadora.setOperando2(Double.parseDouble(txtAntigo.replace(",", ".")));
                    String dividedByZero = String.format("%f", calculadora.calcular());
                    if (dividedByZero.equals("Infinity") || dividedByZero.equals("-Infinity")) {
                        if (calculadora.getOperacao() == Operacao.DIVISAO && calculadora.getOperando2() == 0) {
                        txtDisplay.setText("Não é possivel dividir por zero");
                        }
                        else {
                            txtDisplay.setText("Numero muito grande");
                        }
                    }
                    else {
                        txtDisplay.setText(String.format("%f", calculadora.calcular()));
                    }
                    calculadora.setAguardando(false);
                }
            }
        });         
        pnlCentro.add(btn);

        this.pack();
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public String removeCommas(String txt) {
        String[] arr = txt.split(",");

        if (arr.length > 2) {
            txt = arr[0] + "," + arr[1];

            for (int i = 2; i < arr.length; i++) {
                txt += arr[i];
            }
        }

        return txt;
    }
}