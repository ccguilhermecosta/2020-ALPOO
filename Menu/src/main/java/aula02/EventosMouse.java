package aula02;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.event.MouseEvent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author guilherme
 */
public class EventosMouse extends JFrame {

    private JPanel mousePanel; //Painel em que os eventos de mouse ocorrerão
    private JLabel statusBar; //Rótulo que exibe informações de evento

    //Construtor MouseTrackerFrame configura GUI e registra handlers de evento de mouse
    public EventosMouse() {
        super("Demonstração de eventos do Mouse");

        mousePanel = new JPanel(); //Cria o painel
        mousePanel.setBackground(Color.white); //Configura cor de fundo
        add(mousePanel, BorderLayout.CENTER); //Adicioanr painel ao JFrame

        statusBar = new JLabel("Mouse fora do JPanel");
        add(statusBar, BorderLayout.SOUTH); //Adicionar rótulo ao JFrame

        //Cria e registra Listener para mouise e eventos de movimento
        MouseHandler handler = new MouseHandler();
        mousePanel.addMouseListener(handler);
        mousePanel.addMouseMotionListener(handler);
    } // Fim do construtor

    private class MouseHandler implements MouseListener, MouseMotionListener {

        //Handlers de evento de MouseListener
        //Trata evento quando o mouse é liberado logo depois de pressionado
        public void mouseClicked(MouseEvent event) {
            statusBar.setText(String.format("Clicado em [%d, %d]", event.getX(), event.getY()));
        }//Fim do método mouseClicked

        //Trata evento quando o mouse é pressionado
        public void mousePressed(MouseEvent event) {
            statusBar.setText(String.format("Pressionado em [%d, %d]", event.getX(), event.getY()));
        }//Fim do método mousePressed

        //Trata evento quando o mouse é liberado depois de arrastado
        public void mouseReleased(MouseEvent event) {
            statusBar.setText(String.format("Liberado em [%d, %d]", event.getX(), event.getY()));
        }//Fim do método mouseReleased

        public void mouseEntered(MouseEvent event) {
            statusBar.setText(String.format("Mouse na área [%d, %d]", event.getX(), event.getY()));
        }//Fim do método mouseEntered

        public void mouseExited(MouseEvent event) {
            statusBar.setText(String.format("Mouse fora do JPanel"));
        }//Fim do método mouseExited

        public void mouseDragged(MouseEvent event) {
            statusBar.setText(String.format("Arrastando em [%d, %d]", event.getX(), event.getY()));
        }//Fim do método mouseDragged

        public void mouseMoved(MouseEvent event) {
            statusBar.setText(String.format("Movido em [%d, %d]", event.getX(), event.getY()));
        }//Fim do método mouseMoved
    }
    
    public static void main(String[] args) {
        EventosMouse eventos = new EventosMouse();
        eventos.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        eventos.setSize(500, 300);
        eventos.setLocation(300,200);
        eventos.setVisible(true);
    }//Fim do main
}//Fim da classe
