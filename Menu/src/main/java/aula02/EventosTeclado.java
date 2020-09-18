package aula02;

import java.awt.Color;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;
import javax.swing.JFrame;
import javax.swing.JTextArea;

/**
 *
 * @author guilherme
 */
public class EventosTeclado extends JFrame implements KeyListener {

    private String line1 = ""; //Primeira linha da textarea
    private String line2 = ""; //Segunda linha da textarea
    private String line3 = ""; //Terceira linha da textarea
    private JTextArea textArea; //Textarea a exibir saída

    //Construtor
    public EventosTeclado() {
        super("Demonstrando Eventos de Teclado em Java");

        textArea = new JTextArea(10, 15); //Configura JTextArea
        textArea.setText("Pressione uma tecla...");
        textArea.setEnabled(false); //Desativa a textarea
        textArea.setDisabledTextColor(Color.BLACK);
        add(textArea); //Adiciona ao frame

        addKeyListener(this); //Permite que o frame processe os eventos de teclado
    }//Fim do construtor

    public void keyPressed(KeyEvent event) {
        line1 = String.format("Tecla pressionada: %s", event.getKeyText(event.getKeyCode())); //Gera saída de tecla pressionada
        setLines2and3(event); //Configura a saída das linhas dois e três
    } //Fim do método keyPressed

    public void keyReleased(KeyEvent event) {
        line1 = String.format("Tecla liberada: %s", event.getKeyText(event.getKeyCode())); //Gera saída de tecla liberada
        setLines2and3(event);//Configura saída das linhas dois e três
    }//Fim do método keyReleased

    public void keyTyped(KeyEvent event) {
        line1 = String.format("Tecla pressionada: %s", event.getKeyChar());
        setLines2and3(event); //Configura a saída das linhas dois e três
    }//Fim do método keyTyped

    //Configura a segunda e terceira linhas de saída
    private void setLines2and3(KeyEvent event) {
        line2 = String.format("\n Essa tecla %s é uma tecla de função", (event.isActionKey() ? "" : "Não "));

        String temp = event.getKeyModifiersText(event.getModifiers());

        line3 = String.format("\nTecla modificadora pressionada: %s", (temp.equals("") ? "Nenhuma" : temp)); //Modificadores de saída

        textArea.setText(String.format("%s\n%s\n%s\n", line1, line2, line3)); //Gera saída de três linhas de texto
    }//Fim do método setLines2and3

    public static void main(String[] args) {
        EventosTeclado teclado = new EventosTeclado();
        teclado.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        teclado.setSize(500, 300);
        teclado.setLocation(300, 300);
        teclado.setVisible(true);
    }//Fim do main
}//Fim da classe
