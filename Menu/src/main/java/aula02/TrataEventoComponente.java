package aula02;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author guilherme
 */
public class TrataEventoComponente extends JFrame implements ActionListener {

    private JButton botaoOK, botaoCancela;

    public TrataEventoComponente(JButton botaoOK, JButton botaoCancela) {
        this.botaoOK = botaoOK;
        this.botaoCancela = botaoCancela;
    }

    @Override
    public void actionPerformed(ActionEvent evento) {
        if (evento.getSource() == botaoOK) {
            JOptionPane.showMessageDialog(null, "Botão OK foi clicado");

        }

        if (evento.getSource() == botaoCancela) {
            JOptionPane.showMessageDialog(null, "Botão CANCELA foi clicado");

        }
    } //Fim do método actionPerformed

} //Fim da classe TrataEventoComponente
