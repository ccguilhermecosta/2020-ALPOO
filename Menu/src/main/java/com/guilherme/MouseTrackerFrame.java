package com.guilherme;

// Demonstrando eventos do mouse
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import javax.swing.*;

/**
 *
 * @author guilherme
 */
public class MouseTrackerFrame extends JFrame {

    private JPanel mousePanel; //Painel em que os eventos do mouse ocorrerão
    private JLabel statusBar; //Rótulo que exibe informações sobre o evento

//Construtor
//Registra handlers de evento de mouse
    public MouseTrackerFrame() {
        super("Demonstarting Mouse Events");

        mousePanel = new JPanel();
        mousePanel.setBackground(Color.white);
        add(mousePanel, BorderLayout.CENTER);

        statusBar = new JLabel("Mouse outside JPanel");
        add(statusBar, BorderLayout.SOUTH);

        MouseHandler handler = new MouseHandler();
        mousePanel.addMouseListener(handler);
        mousePanel.addMouseMotionListener(handler);
    }

    private class MouseHandler implements MouseListener,
            MouseMotionListener {

        public void mouseClicked(MouseEvent event) {
            statusBar.setText(String.format("Clicked at [%d ,%d]", event.getX(), event.getY()));
        }

        public void mousePressed(MouseEvent event) {
            statusBar.setText(String.format("Pressed at [%d ,%d]", event.getX(), event.getY()));
        }

        public void mouseReleased(MouseEvent event) {
            statusBar.setText(String.format("Released at [%d, %d]", event.getX(), event.getY()));
        }

        public void mouseEntered(MouseEvent event) {
            statusBar.setText(String.format("Mouse entered at [%d, %d]", event.getX(), event.getY()));
            mousePanel.setBackground(Color.GREEN);
        }

        public void mouseExited(MouseEvent event) {
            statusBar.setText("Mouse outside JPanel");
            mousePanel.setBackground(Color.WHITE);
        }

        public void mouseDragged(MouseEvent event) {
            statusBar.setText(String.format("Dragged at [%d, %d]", event.getX(), event.getY()));
        }

        public void mouseMoved(MouseEvent event) {
            statusBar.setText(String.format("Moved at [%d, %d]", event.getX(), event.getY()));
        }

    }
}
