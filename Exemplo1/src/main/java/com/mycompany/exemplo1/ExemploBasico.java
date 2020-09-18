package com.mycompany.exemplo1;

import java.awt.*;
import javax.swing.*;
/**
 *
 * @author guilherme
 */
public class ExemploBasico extends JFrame {
    private JLabel lblTitulo, lblRA, lblNome;
    private JTextField edtRA, edtNome;   
    
    public ExemploBasico() {
    setTitle("Exemplo de Componentes Swing em Java");   // título do frame
    setPreferredSize (new Dimension (600, 277)); // ajuste do tamanho e layoutsetLayout
    setLayout (null); //Aqui a definição para utilização do layout absoluto
    
    CriarComponentes(); //Instancia componentes
    AdicionarComponentes(); //Adiciona componentes no frame
    ConfigurarPosicoes(); //Configura as posições dos componentes
    pack(); //Reorganiza os componentes no frame
    setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
    setVisible(true); //Deixa o frame visivel
    }
    
    public void CriarComponentes(){
        lblTitulo = new JLabel("Utilização de Componentes Swing em Java");
        lblRA = new JLabel("RA"); // Label do RA
        edtRA = new JTextField(5); //TextField do RA
        
        lblNome = new JLabel("Nome"); //Label do Nome
        edtNome = new JTextField(50); //TextField do Nome
        
    }
    
    public void AdicionarComponentes(){
        add(lblTitulo); //Adiciona o Label do Título ao Frame
        add(lblRA);
        add(lblNome);
        
        add(edtRA);
        add(edtNome);
    }
    
    public void ConfigurarPosicoes(){
        lblTitulo.setBounds(115, 15, 300, 20);
        lblRA.setBounds(25, 55, 100, 25);
        lblNome.setBounds(15, 90, 100, 25);
        
        edtRA.setBounds(55, 55, 375, 25);
        edtNome.setBounds(55, 90, 375, 25);
    }
    
    public static void main(String[] args) {
        ExemploBasico obj = new ExemploBasico();
    }
    
}

    