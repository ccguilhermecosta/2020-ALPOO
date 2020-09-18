package aula02;

import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JButton;

/**
 *
 * @author guilherme
 */
public class EventoComponente extends JFrame {

    private final JButton btnOK = new JButton("OK");
    private final JButton btnCancela = new JButton("Cancela");
    private final TrataEventoComponente evento;
    
    public EventoComponente(){
        super("Tratamento de Eventos de Componentes");
        setLayout(new FlowLayout());
        evento = new TrataEventoComponente(btnOK, btnCancela);
        
        btnOK.addActionListener(evento);
        add(btnOK);
        
        btnCancela.addActionListener(evento);
        add(btnCancela);
    }
    
    public static void main(String[] args) {
        EventoComponente obj = new EventoComponente();
        
        obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        obj.setSize(350, 100);
        obj.setLocation(300, 300);
        obj.setVisible(true);
    }
}
