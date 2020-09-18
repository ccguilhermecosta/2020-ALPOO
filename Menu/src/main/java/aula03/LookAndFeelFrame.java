package aula03;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;

/**
 *
 * @author Guilherme
 */
public class LookAndFeelFrame extends JFrame {

    private final String strings[] = {"Metal", "Motif", "Windows"};
    private UIManager.LookAndFeelInfo looks[];
    private JRadioButton radio[];
    private ButtonGroup group;
    private JButton button;
    private JLabel label;
    private JComboBox comboBox;

    public LookAndFeelFrame() {
        super(" Look and Feel Demo");

        JPanel northPanel = new JPanel(); // Cria o painel norte
        northPanel.setLayout(new GridLayout(3, 1, 0, 5));

        label = new JLabel("This is a Metal look-feel", SwingConstants.CENTER); // Cria o rótulo
        northPanel.add(label); // adiciona o rotulo no painel

        button = new JButton("JButton"); // cria o botão
        northPanel.add(button); // adiciona o botao no painel

        comboBox = new JComboBox(strings); // cria a combo box
        northPanel.add(comboBox); // adiciona o cmobobox ao painel

        radio = new JRadioButton[strings.length]; // cria um array para botões de opção

        JPanel southPanel = new JPanel(); // cria o painel south
        southPanel.setLayout(new GridLayout(1, radio.length));

        group = new ButtonGroup(); // grupo de botões para aparencia e comportamento
        ItemHandler handler = new ItemHandler();

        for (int count = 0; count < radio.length; count++) {
            radio[count] = new JRadioButton(strings[count]);
            radio[count].addItemListener(handler);
            group.add(radio[count]);
            southPanel.add(radio[count]);
        }

        add(northPanel, BorderLayout.NORTH);
        add(southPanel, BorderLayout.SOUTH);

        looks = UIManager.getInstalledLookAndFeels();
        radio[0].setSelected(true);
    }

    private void changeTheLookAndFeel(int value) {
        try {
            UIManager.setLookAndFeel(looks[value].getClassName());

            SwingUtilities.updateComponentTreeUI(this);
        } catch (Exception exception) {
            exception.printStackTrace();

        }

    }

    private class ItemHandler implements ItemListener {

        public void itemStateChanged(ItemEvent event) {

            for (int count = 0; count < radio.length; count++) {

                if (radio[count].isSelected()) {

                    label.setText(String.format("Este é um %s look-and-feel", strings[count]));
                    comboBox.setSelectedIndex(count);
                    changeTheLookAndFeel(count);
                }
            }
        }

    }
}