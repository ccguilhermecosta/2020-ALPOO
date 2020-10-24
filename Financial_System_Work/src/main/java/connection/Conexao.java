package connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author guilherme
 */
public class Conexao {
    
    //CONECTAR O BANCO
    private final static String DRIVER = "oracle.jdbc.OracleDriver";
    private final static String BANCO = "jdbc:oracle:thin:@10.10.10.66:1521/pdb02";
    private final static String USUARIO = "java01";
    private final static String SENHA = "123";

    private static Connection conexao;

    public Conexao() {
        try {
            Class.forName(DRIVER);
            conexao = DriverManager.getConnection(BANCO, USUARIO, SENHA);
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "Erro na Classe de Conexao do Banco. \n" + ex.getMessage());
            conexao = null;
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao conectar no banco.\n" + ex.getMessage());
            conexao = null;
        }
    }

    public static Connection getConexao() {
        return conexao;
    }

    public static void desconectar() {
        try {
            conexao.close();
        } catch (SQLException ex) {
            System.out.println("Falha ao fechar conexao.\n" + ex.getMessage());
        }
    }
}
