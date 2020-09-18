package aula03;

import java.awt.Dimension;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

/**
 *
 * @author Guilherme
 */
public class MenuSimples extends JFrame{
    JMenuBar barraMenu;
    JMenu menuCadastros, menuRelatorios;
    JMenuItem itemMenuCadastroCliente, itemMenuCadastroProduto, itemMenuRelatorioCliente, itemMenuRelatorioProduto;
    
    public void instanciar(){
        barraMenu = new JMenuBar();
        
        menuCadastros = new JMenu("Cadastros");
        menuRelatorios = new JMenu("Relatorios");
        
        itemMenuCadastroCliente = new JMenuItem("Clientes");
        itemMenuCadastroProduto = new JMenuItem("Produtos");
        
        itemMenuRelatorioCliente = new JMenuItem("Clientes");
        itemMenuRelatorioProduto = new JMenuItem("Produto");
        
    }
    public void posicionar(){
        
    }
    
    public void adicionar(){
        setJMenuBar(barraMenu); //adiciona a barra de menus no frame
        
        barraMenu.add(menuCadastros); //adiciona o menu cadastro na barra de menus 
        barraMenu.add(menuRelatorios); //adiciona o menu relatorio na barra de menus 
        
        menuCadastros.add(itemMenuCadastroCliente);
        menuCadastros.add(itemMenuCadastroProduto);
        
        menuRelatorios.add(itemMenuRelatorioCliente);
        menuRelatorios.add(itemMenuRelatorioProduto);
        
    }
    
    public MenuSimples() {
       // super("trabalhando com menus no Java Swing");
        
        setPreferredSize(new Dimension(500, 400)); //
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        instanciar();
        posicionar();
        adicionar();
        
        setVisible(true);
        pack();
        
    }
    
 public static void main(String[] args) {
        MenuSimples obj = new MenuSimples();        
    }   
}