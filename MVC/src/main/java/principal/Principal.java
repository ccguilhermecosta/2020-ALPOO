package principal;

import conexao.Conexao;
import view.UsuarioView;

/**
 *
 * @author guilherme
 */
public class Principal {
    public static void main(String[] args) {
        Conexao objconexao = new Conexao();
        UsuarioView usuarioview = new UsuarioView();
        objconexao.desconectar();
    }
}
