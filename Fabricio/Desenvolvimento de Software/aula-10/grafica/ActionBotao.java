package grafica;

import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;

import logica.Genius;
import logica.Genius.Cor;

public class ActionBotao extends AbstractAction {
    private Cor cor;
    private Genius logicaGenius;

    public ActionBotao(Cor cor, Genius logicaGenius) {
        this.cor = cor;
        this.logicaGenius = logicaGenius;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        logicaGenius.lerCor(this.cor);
    }
}
