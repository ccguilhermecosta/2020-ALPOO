/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;
import connection.Conexao;
import view.ViewCadastroCliente;

/**
 *
 * @author guilherme
 */
public class Principal {
    Conexao objconexao;
    ViewCadastroCliente clienteview;

    public Principal() {
        objconexao = new Conexao();
        clienteview = new ViewCadastroCliente();
    }

    public static void main(String[] args) {
        Principal mvc_dao = new Principal();
    }
    
}
