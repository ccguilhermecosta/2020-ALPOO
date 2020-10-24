
package dao;

import connection.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import model.EnderecoModel;

/**
 *
 * @author guilherme
 */
public class EnderecoDao {
    private Connection conexao = null;

    public EnderecoDao() throws SQLException {
        this.conexao = Conexao.getConexao();
    }

    public void adicionar(EnderecoModel endereco) throws SQLException {
        String sql = "INSERT INTO ENDERECO (ID_ENDERECO, TIPO, LOGRADOURO, CEP, NUMERO, CIDADE, ESTADO)"
                + " VALUES (?, ?, ?, ?, ?, ?, ?)";
        PreparedStatement stm = conexao.prepareStatement(sql);
        stm.setInt(1, endereco.getID_ENDERECO());
        stm.setString(2, endereco.getTIPO());
        stm.setString(3, endereco.getLOGRADOURO());
        stm.setString(4, endereco.getCEP());
        stm.setInt(5, endereco.getNUMERO());
        stm.setString(6, endereco.getCIDADE());
        stm.setString(7, endereco.getESTADO());
        stm.execute();
        stm.close();
    }

    public void alterar(EnderecoModel endereco) throws SQLException {
        String sql = "UPDATE ENDERECO SET TIPO = ?, LOGRADOURO = ?, "
                + "CEP = ?, NUMERO = ?, CIDADE = ?, ESTADO = ? WHERE ID_ENDERECO = ?";
        PreparedStatement stm = conexao.prepareStatement(sql);
        stm.setString(1, endereco.getTIPO());
        stm.setString(2, endereco.getLOGRADOURO());
        stm.setString(3, endereco.getCEP());
        stm.setInt(4, endereco.getNUMERO());
        stm.setString(5, endereco.getCIDADE());
        stm.setString(6, endereco.getESTADO());
        stm.setInt(7, endereco.getID_ENDERECO());
        stm.execute();
        stm.close();
    }

    public void excluir(EnderecoModel endereco) throws SQLException {
        String sql = "DELETE FROM ENDERECO WHERE ID_ENDERECO = ?";
        PreparedStatement stm = conexao.prepareStatement(sql);
        stm.setInt(1, endereco.getID_ENDERECO());
        stm.execute();
        stm.close();
    }
    
     public ArrayList<EnderecoModel> consultar(String condicao) throws SQLException {
        ArrayList<EnderecoModel> lista = null;
        PreparedStatement stm;
        ResultSet rs;
        String sql = "SELECT * FROM ENDERECO";
        if (!condicao.equals("")) {
            sql += " where " + condicao;
        }
        stm = conexao.prepareStatement(sql);
        rs = stm.executeQuery();
        lista = new ArrayList<>();

        while (rs.next()) {
            EnderecoModel obj = new EnderecoModel();
            obj.setID_ENDERECO(rs.getInt("ID_ENDERECO"));
            obj.setTIPO(rs.getString("TIPO"));
            obj.setLOGRADOURO(rs.getString("LOGRADOURO"));
            obj.setCEP(rs.getString("CEP"));
            obj.setNUMERO(rs.getInt("NUMERO"));
            obj.setCIDADE(rs.getString("CIDADE"));
            obj.setESTADO(rs.getString("ESTADO"));
            lista.add(obj);
        }
        rs.close();
        stm.close();
        return lista;
    }
}
