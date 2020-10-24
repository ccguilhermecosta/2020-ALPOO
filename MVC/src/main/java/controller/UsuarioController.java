package controller;

import conexao.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import model.UsuarioModel;

/**
 *
 * @author guilherme
 */
public class UsuarioController {

    private Connection conexao;

    public UsuarioController() {
        conexao = Conexao.getConexao();
    }

    public boolean adicionar(UsuarioModel usuario) {
        boolean retorno = true;
        String sql = "INSERT INTO GRUPO_USUARIO (ID, NOME, ATIVO, CADASTRO)"
                + " VALUES (?, ?, ?, ?)";
        try {
            PreparedStatement stm = conexao.prepareStatement(sql);
            stm.setInt(1, usuario.getID());
            stm.setString(2, usuario.getNOME());
            stm.setInt(3, usuario.getATIVO());
            stm.setString(4, usuario.getCADASTRO());
            stm.execute();
            stm.close();
        } catch (SQLException ex) {
            retorno = false;
        }
        return retorno;
    }

    public boolean alterar(UsuarioModel usuario) {
        boolean retorno = true;
        String sql = "UPDATE GRUPO_USUARIO SET NOME = ?, ATIVO = ?, "
                + "CADASTRO = ? WHERE ID = ?";
        try {
            PreparedStatement stm = conexao.prepareStatement(sql);
            stm.setString(1, usuario.getNOME());
            stm.setInt(2, usuario.getATIVO());
            stm.setString(3, usuario.getCADASTRO());
            stm.setInt(4, usuario.getID());
            stm.execute();
            stm.close();
        } catch (SQLException ex) {
            retorno = false;
        }
        return retorno;
    }

    public boolean excluir(UsuarioModel usuario) {
        boolean retorno = true;
        String sql = "DELETE FROM USUARIO WHERE ID = ?";
        try {
            PreparedStatement stm = conexao.prepareStatement(sql);
            stm.setInt(1, usuario.getID());
            stm.execute();
            stm.close();
        } catch (SQLException ex) {
            retorno = false;
        }
        return retorno;
    }

    public ArrayList<UsuarioModel> consultar(String condicao) {
        PreparedStatement stm;
        ResultSet rs;
        ArrayList<UsuarioModel> lista = null;

        String sql = "SELECT * FROM GRUPO_USUARIO";
        if (!condicao.equals("")) {
            sql += " where " + condicao;
        }
        try {
            stm = conexao.prepareStatement(sql);
            rs = stm.executeQuery();
            lista = new ArrayList<UsuarioModel>();

            while (rs.next()) {
                UsuarioModel objusu = new UsuarioModel();
                objusu.setID(rs.getInt("ID"));
                objusu.setNOME(rs.getString("NOME"));
                objusu.setATIVO(rs.getInt("ATIVO"));
                objusu.setCADASTRO(rs.getString("CADASTRO"));
                lista.add(objusu);
            }
            rs.close();
            stm.close();
        } catch (SQLException ex) {
            lista = null;
        }
        return lista;
    }

    public boolean gravar(String operacao, UsuarioModel usuario) {
        boolean retorno = true;
        if (operacao.equals("incluir")) {
            retorno = adicionar(usuario);
        } else if (operacao.equals("alterar")) {
            retorno = alterar(usuario);
        }
        return retorno;
    }

}
