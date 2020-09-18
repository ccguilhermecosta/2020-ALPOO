package com.mycompany.exemplo1;

import java.awt.*;
import javax.swing.*;

/**
 *
 * @author guilherme
 */
public class ExemploComboBox extends JFrame {
    
    private JLabel lblTitulo, lblRA, lblCurso, lblNome, lblSemestre;
    private JTextField edtRA, edtNome, edtCurso;
    private JComboBox boxSemestre;
    private JButton btnGravar, btnSair;
    private String[] boxBimestreItens = {"Primeiro", "Segundo", "Terceiro", "Quarto"};
    
    public ExemploComboBox(){
        setTitle("Exemplo de Layout Absoluto em Java");
        
        //Ajuste do tamanho e layout
        
        setPreferredSize(new Dimension(456, 277));
        setLayout(null); // Definição do Layout absoluto
        
        CriarComponentes(); //Instancia componentes
        AdicionarComponentes(); //Adiciona os componentes ao form
        ConfigurarPosicoes(); //Configura as posições dos componentes
        
        pack(); //Reorganiza
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
    
    public void CriarComponentes(){
    lblTitulo = new JLabel ("Utilizao de Leioute Absoluto em Java");
    edtRA = new JTextField (5);
    edtNome = new JTextField (5);
    edtCurso = new JTextField (5);
    lblRA = new JLabel ("R.A.");
    lblCurso = new JLabel ("Curso");
    lblNome = new JLabel ("Nome");
    lblSemestre = new JLabel ("Semestre");
    boxSemestre = new JComboBox (boxBimestreItens);
    btnGravar = new JButton ("Gravar");
    btnSair = new JButton ("Sair");
    btnSair = new JButton ("Sair");
    }
    
    public void AdicionarComponentes(){
        add (lblTitulo);
        add (edtRA);
        add (edtNome);
        add (edtCurso);
        add (lblRA);
        add (lblCurso);
        add (lblNome);
        add (lblSemestre);
        add (boxSemestre);
        add (btnGravar);
        add (btnSair);
    }
    
    public void ConfigurarPosicoes(){
        //Configura a posicao dos objetos no frame
        // Setbounds( posicao x, posicao y, largura, algura )
        lblTitulo.setBounds(115, 15, 225, 20);
        lblRA.setBounds(25, 55, 100, 25);
        lblNome.setBounds(15, 90, 100, 25);
        lblCurso.setBounds(15, 125, 100, 25);
        lblSemestre.setBounds(290, 125,  65, 25);
        edtRA.setBounds(55, 55, 375, 25);
        edtNome.setBounds(55, 90, 375, 25);
        edtNome.setBounds(55, 90, 375, 25);
        edtCurso.setBounds(55, 125, 220, 25);
        boxSemestre.setBounds(350, 125, 80, 25);
        btnGravar.setBounds(100, 190, 100, 25);
        btnSair.setBounds(260, 190, 100, 25);
    }
    
    public static void main(String[] args) {
        ExemploComboBox obj = new ExemploComboBox();
    }
    
}
