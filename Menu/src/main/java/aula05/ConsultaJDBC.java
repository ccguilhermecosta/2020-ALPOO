package aula05;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author guilherme
 */
public class ConsultaJDBC {

    private static String DRIVER;
    private static String BANCO;
    private static String USUARIO;
    private static String SENHA;
    private static String SQL;
    public ConsultaJDBC() {
        final String SGBD = "Oracle"; //PostgreSQL, Oracle ou MySQL

        switch (SGBD) {
            case "PostgreSQL":
                DRIVER = "org.postgresql.Driver";
                BANCO = "jdbc:postgresql://localhost/teste"; //mudar aqui
                USUARIO = "teste"; //mudar aqui
                SENHA = "teste"; //mudar aqui
                break;
            case "Oracle":
                DRIVER = "oracle.jdbc.OracleDriver";
                BANCO = "jdbc:oracle:thin:@10.10.10.66:1521:pdb02";
                USUARIO = "unip"; //mudar aqui
                SENHA = "unip"; // mudar aqui
                break;
            case "MySQL":
                DRIVER = "com.mysql.jdbc.Driver";
                BANCO = "jdbc:mysql://localhost:3306/test"; //mudar aqui
                USUARIO = "root"; //mudar aqui
                SENHA = "root"; //mudar aqui
                break;
            default:
                JOptionPane.showMessageDialog(null,
                        "Banco de dados não possui driver JDBC instalado\n"
                        + "Confira no arquivo pom.xml");
        }
    }

    public static void main(String[] args) {
        ConsultaJDBC consulta = new ConsultaJDBC();
        try {
            // Definir o Driver JDBC do banco de dados
            Class.forName(DRIVER);

            //Criar o objeto da classe Connection
            Connection conexao = DriverManager.getConnection(BANCO, USUARIO, SENHA);

            //Criar o objeto da classe Statement (Executar SQL)
            Statement stm = conexao.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);

            //Criar o objeto da classe ResultSet (Armazena o resultado da consulta)
            ResultSet rs = stm.executeQuery(SQL);

            //Exibir todos os registros do Result Set 
            System.out.println("ID     NOME     DESC          PREÇO");

            while (rs.next()) {
                int id = rs.getInt("id");
                String nome = rs.getString("prod_name");
                String descricao = rs.getString("prod_desc");
                double preco = rs.getDouble("prod_price");

                System.out.println(id + "   " + nome + "    " + descricao + "   " + preco);
            }
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "Erro na Classe de Conexao do Banco. \n" + ex.getMessage());
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro na Consulta SQL. \n" + ex.getMessage());
        }
    }

}
