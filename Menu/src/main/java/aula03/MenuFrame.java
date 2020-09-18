package aula03;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.*;
import javax.swing.plaf.basic.BasicComboBoxUI.ItemHandler;

/**
 *
 * @author guilherme
 */
public class MenuFrame extends JFrame {

    private final Color colorValues[]
            = {Color.BLACK, Color.BLUE, Color.RED, Color.GREEN};

    private JRadioButtonMenuItem colorItens[]; //Itens do menu Color
    private JRadioButtonMenuItem fonts[]; //Itens do menu Font
    private JCheckBoxMenuItem styleItens[]; //Itens do menu Font Style
    private JLabel displayJLabel; //Exibe o texto de exemplo
    private ButtonGroup fontButtonGroup; //Gerencia itens do menu font
    private ButtonGroup colorButtonGroup; //Genrecia itens do menu COlor
    private int style; //Utilizando para criar estilo para fonte

    //Construtor sem argumentos configura a GUI
    public MenuFrame() {
        super("Using JMenus");

        JMenu fileMenu = new JMenu("File"); //Cria o menu file
        fileMenu.setMnemonic('F'); //Configura o mnemônico como F

        //Create About... menu item
        JMenuItem aboutItem = new JMenuItem("About...");
        aboutItem.setMnemonic('A');
        fileMenu.add(aboutItem);
        aboutItem.addActionListener(
                new ActionListener() ///Classe Interna anonima
        {
            public void actionPerformed(ActionEvent event) {
                System.exit(0); //Encerra o aplicativo
            }//Fim do método actionPerformed
        }//Fim da Classe interna anonima
        );//Fim da chamada para addActionListener

        JMenuBar bar = new JMenuBar(); //Cria a barra de menu
        setJMenuBar(bar); //Adiciona a barra de menu ao aplicativo
        bar.add(fileMenu); //Adiciona o menu File a barra de menu

        JMenu formatMenu = new JMenu("Format"); //Cria o menu Format
        formatMenu.setMnemonic('r'); //Configura o mnemonico como r

        //Array listando cores de string
        String color[] = {"Black", "Blue", "Red", "Green"};

        JMenu colorMenu = new JMenu("Color"); //Cria o menu color
        colorMenu.setMnemonic('c'); //Configura o mnemonico

        //Cria itens do menu Color com botões de opção
        colorItens = new JRadioButtonMenuItem[color.length];
        colorButtonGroup = new ButtonGroup(); //gerencia cores
        ItemHandler itemHandler = new ItemHandler();

        //Cria itens do menu Color com botões de opção
        for (int count = 0; count < color.length; count++) {
            colorItens[count]
                    = new JRadioButtonMenuItem(color[count]);
            colorMenu.add(colorItens[count]);
            colorButtonGroup.add(colorItens[count]);
            colorItens[count].addActionListener(itemHandler);

        }

        colorItens[0].setSelected(true); //Seleciona primeiro item color

        formatMenu.add(colorMenu);
        formatMenu.addSeparator();

        //Array listing font names
        String fontNames[] = {"Serif", "Monospaced", "SansSerif"};
        JMenu fontMenu = new JMenu("Font");
        fontMenu.setMnemonic('n');

        //Cria itens do menu radiobutton para nomes de fonte
        fonts = new JRadioButtonMenuItem[fontNames.length];
        fontButtonGroup = new ButtonGroup();

        //Cria itens do menu Font com botões de opção
        for (int count = 0; count < fonts.length; count++) {
            fonts[count] = new JRadioButtonMenuItem(fontNames[count]);
            fontMenu.add(fonts[count]);
            fontButtonGroup.add(fonts[count]);
            fonts[count].addActionListener(itemHandler);
        }// Fim do for

        fonts[0].setSelected(true);
        fontMenu.addSeparator();

        String styleNames[] = {"Bold", "Italic"}; //Nomes de estilos
        styleItens = new JCheckBoxMenuItem[styleNames.length];
        StyleHandler styleHandler = new StyleHandler(); //Handler de Estilos

        //Criar itens do menu Style com ciaxas de seleção
        for (int count = 0; count < styleNames.length; count++) {

            styleItens[count]
                    = new JCheckBoxMenuItem(styleNames[count]);
            fontMenu.add(styleItens[count]);
            styleItens[count].addItemListener(styleHandler);
        }// Fim do for

        formatMenu.add(fontMenu);
        bar.add(formatMenu);

        //Set up label to display text
        displayJLabel = new JLabel("Sample Text", SwingConstants.CENTER);
        displayJLabel.setForeground(colorValues[0]);
        displayJLabel.setFont(new Font("Serif", Font.PLAIN, 72));

        getContentPane().setBackground(Color.CYAN);
        add(displayJLabel, BorderLayout.CENTER);
    }//Fim do construtor

    //clase interna para tratar eventos de ação dos itens de menu 
    private class ItemHandler implements ActionListener {
        //processa seleções de cor e fonte 

        public void actionPerformed(ActionEvent event) {
            //processa seleções de cor
            for (int count = 0; count < colorItens.length; count++) {
                if (colorItens[count].isSelected()) {
                    displayJLabel.setForeground(colorValues[count]);
                    break;
                }//fim do if 
            }//fim do for

            for (int count = 0; count < fonts.length; count++) {
                if (event.getSource() == fonts[count]) {
                    displayJLabel.setFont(
                            new Font(fonts[count].getText(), style, 72));
                }//fim do if 
            }//fim do for

            repaint(); // desenha novamente o aplicativo

        }//fim do actionPerformed
    }//fim da classe itemHandler

// classe interna para tratar eventos dos itens
    private class StyleHandler implements ItemListener {
        // processa seleções de estilo da fonte

        public void itemStateChanged(ItemEvent e) {
            style = 0; // iniciliza estilo

            //verifica seleção de negrito
            if (styleItens[0].isSelected()) {
                style += Font.BOLD;//adiciona negrito ao estilo
            }
            //verifica seleção de itálico
            if (styleItens[1].isSelected()) {
                style += Font.ITALIC; //adiciona itálico ao escrito
            }
            displayJLabel.setFont(
                    new Font(displayJLabel.getFont().getName(), style, 72));
            repaint();//desenha novamente o aplicativo 
        }
    }
}

