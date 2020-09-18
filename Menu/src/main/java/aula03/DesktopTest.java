package aula03;

import javax.swing.JFrame;
/**
 *
 * @author guilherme
 */

public class DesktopTest {
    public static void main(String[] args) {
        DesktopFrame desktopFrame = new DesktopFrame();
        desktopFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        desktopFrame.setSize(600, 480);
        desktopFrame.setVisible(true);
    }
}
