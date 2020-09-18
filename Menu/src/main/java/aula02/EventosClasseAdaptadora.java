package aula02;

import java.awt.FlowLayout;
import java.awt.event.*;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author guilherme
 */
public class EventosClasseAdaptadora extends MouseAdapter {

    public static void main(String[] args) {
        ClasseAdaptadoraJanela janela = new ClasseAdaptadoraJanela();
        janela.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                JOptionPane.showMessageDialog(null, "Mouse pressionado", "Tratamento de Evento", JOptionPane.WARNING_MESSAGE);
            }
        });
    }
}

class ClasseAdaptadoraJanela extends JFrame {

    JButton btnOK = new JButton("Botão OK");

    public ClasseAdaptadoraJanela() {
        setTitle("Classe Adaptadora de Evento no Java");
        setSize(400, 300);
        setLocation(300, 300);
        setLayout(new FlowLayout());
        add(btnOK);
        setVisible(true);
    }
}
