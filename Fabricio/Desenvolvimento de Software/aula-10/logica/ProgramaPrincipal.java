package logica;

import javax.swing.JOptionPane;

import grafica.FrmGenius;

public class ProgramaPrincipal {
    public static void main(String args[]) {
        Genius logicaGenius = new Genius();
        FrmGenius frm = new FrmGenius(logicaGenius);
        frm.setVisible(true);
        do {
            boolean match = true;
            logicaGenius.setAguardando(false);
            while (match) {
                try {
                    Thread.sleep(200);
                } catch (Exception e) {
                    e.printStackTrace();
                }
                boolean aguardando = logicaGenius.getAguardando();
                if (!aguardando) {
                    logicaGenius.sortearCor();
                    frm.animarBotoes();
                    logicaGenius.setAguardando(true);
                    logicaGenius.setPontos();
                }
                match = logicaGenius.compararCores();
            }
        } while (!logicaGenius.checkGameOver());

        frm.setVisible(false);
        frm.dispose();
    }
}
