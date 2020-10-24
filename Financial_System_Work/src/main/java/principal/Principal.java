/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;
import connection.Conexao;
import view.ViewMenu;


/**
 *
 * @author guilherme
 */
public class Principal {
    Conexao objconexao;
    ViewMenu viewmenu;

    public Principal() {
        objconexao = new Conexao();
        ViewMenu menu = new ViewMenu();
    }

    public static void main(String[] args) {
        Principal principal = new Principal();
    }
    
}
