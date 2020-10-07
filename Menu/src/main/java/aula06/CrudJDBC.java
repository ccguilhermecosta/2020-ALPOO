/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula06;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author guilherme
 */
public class CrudJDBC {
    private String DRIVER = "oracle.jdbc.OracleDriver";
    private String BANCO = "jdbc:oracle:thin:@10.10.10.66:1521/pdb02";
    private String USUARIO = "guilherme";
    private String SENHA = "123";

    private Connection conexao;
    private Statement stm;
    private PreparedStatement pstm;
    
    
    public void conectar(String driver, String banco, String usuario, String senha){
        DRIVER = driver;
        BANCO = banco;
        USUARIO = usuario;
        SENHA = senha;
        
        try {
            // 1) Definir o driver JDBC do banco de dados
            Class.forName(DRIVER);
            conexao = DriverManager.getConnection(BANCO, USUARIO, SENHA);
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "Erro na Classe de Conexao do Banco. \n" + ex.getMessage());
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro na Inclusão SQL. \n" + ex.getMessage());
        }
    }
    
     public void incluir(String SQL) {
        try {
            pstm = conexao.prepareStatement(SQL);
            int r = pstm.executeUpdate(); //executar a instrução INSERT 
            if (r == 1) {
                JOptionPane.showMessageDialog(null, "Inclusão efetuada com sucesso!");
            } else {
                JOptionPane.showMessageDialog(null, "Problemas na Inclusão");
            }
            pstm.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro na Inclusão SQL. \n" + ex.getMessage());
        }
    }
     
         public void alterar(String SQL) {
        try {
            pstm = conexao.prepareStatement(SQL);
            int r = pstm.executeUpdate(); //executar a instrução INSERT 
            if (r > 0) {
                JOptionPane.showMessageDialog(null, "Alteração efetuada com sucesso!");
            } else {
                JOptionPane.showMessageDialog(null, "Não houve alteração");
            }
            pstm.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro na Alteração SQL. \n" + ex.getMessage());
        }
    }
         
          public void excluir(String SQL) {
        try {
            pstm = conexao.prepareStatement(SQL);
            int r = pstm.executeUpdate(); //executar a exclusão DELETE
            if (r > 0) {
                JOptionPane.showMessageDialog(null, "Exclusão efetuada com sucesso!");
            } else {
                JOptionPane.showMessageDialog(null, "Não houve exclusão");
            }
            pstm.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro na Exclusão SQL. \n" + ex.getMessage());
        }
    }
          
          


        
       public String consultar(String SQL) {
        String resultado = "";
        try {
            // 3) Criar o objeto da classe Statement (executar comando SQL)
            stm = conexao.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);

            // 4) Criar o objeto da classe ResultSet (armazena o resultado da consulta)
            ResultSet rs = stm.executeQuery(SQL);

            // 5) Exibir todos os registros da consulta (objeto rs = ResultSet)
            resultado += "ID     NOME             DATA DE LANÇAMENTO   GENERO   CLASSIFICAÇAO \n";
            while (rs.next()) {
                int id = rs.getInt("id");
                String nome = rs.getString("nome");
                String data_lancamento = rs.getString("data_lancamento");
                String genero = rs.getString("genero");
                String classificacao = rs.getString("classificacao");
                

                resultado += (id + "    " + nome + "        " + data_lancamento + "      " + genero + "         " + classificacao + "\n");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro na Consulta SQL. \n" + ex.getMessage());
        }

        return resultado;
    }

}

    

