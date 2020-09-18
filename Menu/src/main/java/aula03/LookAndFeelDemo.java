package aula03;

import javax.swing.JFrame;

/**
 *
 * @author guilherme
 */
public class LookAndFeelDemo {

    public static void main(String args[]) {
        LookAndFeelFrame lookAndFeelFrame = new LookAndFeelFrame();
        lookAndFeelFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        lookAndFeelFrame.setSize(300, 200);
        lookAndFeelFrame.setVisible(true);
    }
}
