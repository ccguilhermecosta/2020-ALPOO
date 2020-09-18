package com.guilherme;

import javax.swing.*;
import java.awt.*;
import static java.awt.Transparency.TRANSLUCENT;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author guilherme
 */
public class Principal extends JFrame {

    //Declaração dos componentes Swing
    private JTextField jSearch;
    private JButton jHideBttn, jShowBttn, jProject1, jProject2, jProject3, jProject4;
    private JLabel jTitle, jLogo, jLogo2;

    public Principal() {
        //Setar o título do frame
        setTitle("Menu - Aulas ALPOO");

        //Ajuste do tamanho do layout
        setPreferredSize(new Dimension(800, 600));

        //Ajuste do Background
        this.getContentPane().setBackground(Color.white);

        //Declaração do layout absoluto
        setLayout(null);

        //Declaração das classes dos componentes
        Criar();
        Configurar();
        Adicionar();

        //Reogarnização
        pack();

        //Opções padrões
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    //Classes dos componentes
    public void Criar() {

        jSearch = new JTextField();
        jHideBttn = new JButton();
        jShowBttn = new JButton();
        jProject1 = new JButton();
        jProject2 = new JButton();
        jProject3 = new JButton();
        jProject4 = new JButton();
        jTitle = new JLabel();
        jLogo = new JLabel();
        jLogo2 = new JLabel();

    }

    public void Configurar() {

        jSearch.setBounds(650, 50, 125, 25);
        jSearch.setBorder(null);
        jSearch.setText("Pesquisa...");
        jSearch.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, Color.black));
        jSearch.setHorizontalAlignment(jSearch.CENTER);

        jHideBttn.setBounds(25, 15, 64, 64);
        jHideBttn.setIcon(new javax.swing.ImageIcon("/home/guilherme/NetBeansProjects/Menu/src/hideeye.png"));
        jHideBttn.setMargin(new Insets(0, 0, 0, 0));
        jHideBttn.setBorder(null);
        jHideBttn.setOpaque(false);
        jHideBttn.setContentAreaFilled(false);
        jHideBttn.setBorderPainted(false);
        jHideBttn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                jShowBttn.show();
                jProject1.hide();
                jProject2.hide();
                jProject3.hide();
                jProject4.hide();
                jHideBttn.hide();

            }
        });

        jShowBttn.hide();
        jShowBttn.setBounds(25, 15, 64, 64);
        jShowBttn.setIcon(new javax.swing.ImageIcon("/home/guilherme/NetBeansProjects/Menu/src/vieweye.png"));
        jShowBttn.setMargin(new Insets(0, 0, 0, 0));
        jShowBttn.setBorder(null);
        jShowBttn.setOpaque(false);
        jShowBttn.setContentAreaFilled(false);
        jShowBttn.setBorderPainted(false);
        jShowBttn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                jShowBttn.hide();
                jProject1.show();
                jProject2.show();
                jProject3.show();
                jProject4.show();
                jHideBttn.show();

            }
        });

        jProject1.setBounds(10, 100, 150, 25);
        jProject1.setText("Objects Training");
        jProject1.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent arg0) {
                ObjectsTraining open = new ObjectsTraining();
                open.setVisible(true);
                dispose();
            }
        });

        jProject2.setBounds(10, 130, 150, 25);
        jProject2.setText("Nome do Projeto");

        jProject3.setBounds(10, 160, 150, 25);
        jProject3.setText("Nome do Projeto");

        jProject4.setBounds(10, 190, 150, 25);
        jProject4.setText("Nome do Projeto");

        jTitle.setBounds(300, 35, 120, 25);
        jTitle.setText("Menu ");
        jTitle.setFont(new Font("Verdana", Font.BOLD, 35));

        jLogo.setBounds(420, 5, 96, 96);
        jLogo.setIcon(new javax.swing.ImageIcon("/home/guilherme/NetBeansProjects/Menu/src/unip.png"));

        jLogo2.setBounds(210, 8, 64, 64);
        jLogo2.setIcon(new javax.swing.ImageIcon("/home/guilherme/NetBeansProjects/Menu/src/java.png"));

    }

    public void Adicionar() {

        add(jSearch);
        add(jHideBttn);
        add(jShowBttn);
        add(jProject1);
        add(jProject2);
        add(jProject3);
        add(jProject4);
        add(jTitle);
        add(jLogo);
        add(jLogo2);

    }

    public static void main(String[] args) {
        Principal instance = new Principal();
    }

}
