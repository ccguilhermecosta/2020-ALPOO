package com.guilherme;

import javax.swing.*;
import java.awt.*;

/**
 *
 * @author guilherme
 */
public class FrameProdutos extends JFrame {

    //Declaração dos componentes Swing
    private JTextField jCod, jNome, jPreco_Custo, jLucro, jPreco_Venda, jICMS, jSubs_Tribut, jCST, jNCM, jCod_Barras;
    private JButton jBttnAdd, jBttnSave, jBttnUndo, jBttnDel, jBttnSearch, jBttnHelp;
    private JLabel jLNew, jLSave, jLUndo, jLDel, jLSearch, jLHelp, jLCod, jLNome, jLPreco_Custo, jLLucro, jLPreco_Venda, jLICMS, jLSubs_Trib, jLCST, jLNCM, jLUni_Med,
            jLMarca, jLCategoria, jLOrigem, jLCod_Barras, jLAviso;
    private JComboBox jComboMarca, jComboCategoria, jComboOrigem, jComboUnidade;

    public FrameProdutos() {
        //Setar o título do frame
        setTitle("Cadastramento Rápido de Produtos");

        //Ajuste do tamanho do layout
        setPreferredSize(new Dimension(640, 480));

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

        jCod = new JTextField();
        jNome = new JTextField();
        jPreco_Custo = new JTextField();
        jLucro = new JTextField();
        jPreco_Venda = new JTextField();
        jICMS = new JTextField();
        jSubs_Tribut = new JTextField();
        jCST = new JTextField();
        jNCM = new JTextField();
        jCod_Barras = new JTextField();

        jBttnAdd = new JButton();
        jBttnSave = new JButton();
        jBttnUndo = new JButton();
        jBttnDel = new JButton();
        jBttnSearch = new JButton();
        jBttnHelp = new JButton();

        jLNew = new JLabel();
        jLSave = new JLabel();
        jLUndo = new JLabel();
        jLDel = new JLabel();
        jLSearch = new JLabel();
        jLHelp = new JLabel();
        jLCod = new JLabel();
        jLNome = new JLabel();
        jLPreco_Custo = new JLabel();
        jLLucro = new JLabel();
        jLPreco_Venda = new JLabel();
        jLICMS = new JLabel();
        jLSubs_Trib = new JLabel();
        jLCST = new JLabel();
        jLNCM = new JLabel();
        jLUni_Med = new JLabel();
        jLMarca = new JLabel();
        jLCategoria = new JLabel();
        jLOrigem = new JLabel();
        jLCod_Barras = new JLabel();
        jLAviso = new JLabel();

        jComboMarca = new JComboBox();
        jComboCategoria = new JComboBox();
        jComboOrigem = new JComboBox();
        jComboUnidade = new JComboBox();

    }

    public void Configurar() {

        jLNew.setBounds(15, 70, 100, 15);
        jLNew.setText("Novo [F5]");
        jLSave.setBounds(115, 70, 100, 15);
        jLSave.setText("Gravar [F6]");
        jLUndo.setBounds(215, 70, 100, 15);
        jLUndo.setText("Desfazer");
        jLDel.setBounds(315, 70, 100, 15);
        jLDel.setText("Excluir");
        jLSearch.setBounds(415, 70, 100, 15);
        jLSearch.setText("Pesquisar");
        jLHelp.setBounds(515, 70, 100, 15);
        jLHelp.setText("Suporte");

        jBttnAdd.setBounds(20, 5, 64, 64);
        jBttnAdd.setIcon(new javax.swing.ImageIcon("/home/guilherme/NetBeansProjects/CadastroProdutos/src/add.png"));
        jBttnAdd.setMargin(new Insets(0, 0, 0, 0));
        jBttnAdd.setBorder(null);
        jBttnAdd.setOpaque(false);
        jBttnAdd.setContentAreaFilled(false);
        jBttnAdd.setBorderPainted(false);

        jBttnSave.setBounds(120, 5, 60, 60);
        jBttnSave.setIcon(new javax.swing.ImageIcon("/home/guilherme/NetBeansProjects/CadastroProdutos/src/save.png"));
        jBttnSave.setMargin(new Insets(0, 0, 0, 0));
        jBttnSave.setBorder(null);
        jBttnSave.setOpaque(false);
        jBttnSave.setContentAreaFilled(false);
        jBttnSave.setBorderPainted(false);

        jBttnUndo.setBounds(220, 5, 60, 60);
        jBttnUndo.setIcon(new javax.swing.ImageIcon("/home/guilherme/NetBeansProjects/CadastroProdutos/src/undo.png"));
        jBttnUndo.setMargin(new Insets(0, 0, 0, 0));
        jBttnUndo.setBorder(null);
        jBttnUndo.setOpaque(false);
        jBttnUndo.setContentAreaFilled(false);
        jBttnUndo.setBorderPainted(false);

        jBttnDel.setBounds(310, 5, 60, 60);
        jBttnDel.setIcon(new javax.swing.ImageIcon("/home/guilherme/NetBeansProjects/CadastroProdutos/src/lixo.png"));
        jBttnDel.setMargin(new Insets(0, 0, 0, 0));
        jBttnDel.setBorder(null);
        jBttnDel.setOpaque(false);
        jBttnDel.setContentAreaFilled(false);
        jBttnDel.setBorderPainted(false);

        jBttnSearch.setBounds(420, 5, 60, 60);
        jBttnSearch.setIcon(new javax.swing.ImageIcon("/home/guilherme/NetBeansProjects/CadastroProdutos/src/search.png"));
        jBttnSearch.setMargin(new Insets(0, 0, 0, 0));
        jBttnSearch.setBorder(null);
        jBttnSearch.setOpaque(false);
        jBttnSearch.setContentAreaFilled(false);
        jBttnSearch.setBorderPainted(false);

        jBttnHelp.setBounds(520, 5, 60, 60);
        jBttnHelp.setIcon(new javax.swing.ImageIcon("/home/guilherme/NetBeansProjects/CadastroProdutos/src/info.png"));
        jBttnHelp.setMargin(new Insets(0, 0, 0, 0));
        jBttnHelp.setBorder(null);
        jBttnHelp.setOpaque(false);
        jBttnHelp.setContentAreaFilled(false);
        jBttnHelp.setBorderPainted(false);

        jLCod.setBounds(15, 100, 100, 15);
        jLCod.setText("Código");
        jCod.setBounds(15, 120, 100, 20);
        jCod.setBorder(null);
        jCod.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, Color.black));

        jLNome.setBounds(15, 145, 100, 15);
        jLNome.setText("Nome");
        jLNome.setForeground(Color.red);
        jNome.setBounds(15, 160, 300, 20);
        jNome.setBorder(null);
        jNome.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, Color.black));

        jLPreco_Custo.setBounds(15, 185, 100, 15);
        jLPreco_Custo.setText("Preço custo");
        jPreco_Custo.setBounds(15, 200, 120, 20);
        jPreco_Custo.setBorder(null);
        jPreco_Custo.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, Color.black));

        jLICMS.setBounds(15, 230, 50, 15);
        jLICMS.setText("ICMS %");
        jICMS.setBounds(15, 250, 70, 20);
        jICMS.setBorder(null);
        jICMS.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, Color.black));

        jLMarca.setBounds(15, 280, 100, 15);
        jLMarca.setText("Marca");
        jComboMarca.setBounds(15, 300, 200, 20);
        jComboMarca.addItem("Selecione...");
        jComboMarca.addItem("Lenovo");
        jComboMarca.addItem("Positivo");
        jComboMarca.addItem("Dell");
        jComboMarca.addItem("RedDragon");

        jLOrigem.setBounds(15, 330, 100, 15);
        jLOrigem.setText("Origem");
        jLOrigem.setForeground(Color.red);
        jComboOrigem.setBounds(15, 350, 200, 20);
        jComboOrigem.addItem("Selecione...");
        jComboOrigem.addItem("China");
        jComboOrigem.addItem("Brasil");
        jComboOrigem.addItem("Índia");

        jLCod_Barras.setBounds(230, 330, 300, 15);
        jLCod_Barras.setText("Código de Barras ( Passe o produto no leitor )");
        jCod_Barras.setBounds(230, 350, 300, 20);
        jCod_Barras.setBorder(null);
        jCod_Barras.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, Color.black));

        jLCategoria.setBounds(230, 280, 100, 15);
        jLCategoria.setText("Categoria");
        jComboCategoria.setBounds(230, 350, 200, 20);
        jComboCategoria.addItem("Selecione...");

        jLSubs_Trib.setBounds(100, 230, 150, 15);
        jLSubs_Trib.setText("Subst. Tributária");
        jSubs_Tribut.setBounds(100, 250, 100, 20);
        jSubs_Tribut.setBorder(null);
        jSubs_Tribut.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, Color.black));

        jLCST.setBounds(240, 230, 100, 15);
        jLCST.setText("CST - NFE");
        jCST.setBounds(240, 250, 100, 20);
        jCST.setBorder(null);
        jCST.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, Color.black));

        jLNCM.setBounds(360, 230, 100, 15);
        jLNCM.setText("NCM - NFE");
        jLNCM.setForeground(Color.red);
        jNCM.setBounds(360, 250, 100, 20);
        jNCM.setBorder(null);
        jNCM.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, Color.black));

        jLUni_Med.setBounds(480, 230, 200, 15);
        jLUni_Med.setText("Unidade Medida");
        jLUni_Med.setForeground(Color.red);
        jComboUnidade.setBounds(480, 250, 125, 20);
        jComboUnidade.addItem("Real");
        jComboUnidade.addItem("Dolár");
        jComboUnidade.addItem("Euro");
        jComboUnidade.addItem("Libra Esterlina");

        jLLucro.setBounds(170, 185, 100, 15);
        jLLucro.setText("Lucro %");
        jLucro.setBounds(170, 200, 100, 20);
        jLucro.setBorder(null);
        jLucro.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, Color.black));

        jLPreco_Venda.setBounds(300, 185, 200, 15);
        jLPreco_Venda.setText("Preço de Venda");
        jLPreco_Venda.setForeground(Color.red);
        jPreco_Venda.setBounds(300, 200, 120, 20);
        jPreco_Venda.setBorder(null);
        jPreco_Venda.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, Color.black));

        jLAviso.setBounds(180, 420, 500, 15);
        jLAviso.setText("Campos em Vermelho são obrigatórios para emissão de NF-e");
        jLAviso.setForeground(Color.red);

    }

    public void Adicionar() {

        add(jLNew);
        add(jLSave);
        add(jLUndo);
        add(jLDel);
        add(jLSearch);
        add(jLHelp);
        add(jBttnAdd);
        add(jBttnSave);
        add(jBttnUndo);
        add(jBttnDel);
        add(jBttnSearch);
        add(jBttnHelp);
        add(jLCod);
        add(jCod);
        add(jLNome);
        add(jNome);
        add(jLPreco_Custo);
        add(jPreco_Custo);
        add(jICMS);
        add(jLICMS);
        add(jLMarca);
        add(jComboMarca);
        add(jLOrigem);
        add(jComboOrigem);
        add(jLCod_Barras);
        add(jCod_Barras);
        add(jLCategoria);
        add(jComboCategoria);
        add(jLSubs_Trib);
        add(jSubs_Tribut);
        add(jLCST);
        add(jCST);
        add(jLNCM);
        add(jNCM);
        add(jLUni_Med);
        add(jComboUnidade);
        add(jLLucro);
        add(jLucro);
        add(jLPreco_Venda);
        add(jPreco_Venda);
        add(jLAviso);
    }

    public static void main(String[] args) {
        FrameProdutos instance = new FrameProdutos();
    }

}
