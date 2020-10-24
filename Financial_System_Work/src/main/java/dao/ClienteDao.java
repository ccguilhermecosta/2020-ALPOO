package dao;

import connection.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import model.ClienteModel;

/**
 *
 * @author guilherme
 */
public class ClienteDao {

    private Connection conexao = null;

    public ClienteDao() throws SQLException {
        this.conexao = Conexao.getConexao();
    }

    public void adicionar(ClienteModel cliente) throws SQLException {
        String sql = "INSERT INTO CLIENTE (ID_CLIENTE, NOME, CPF, EMAIL, DDD, TELEFONE)"
                + " VALUES (?, ?, ?, ?, ?, ?, SELECT E.ID_ENDERECO FROM ENDERECO E INNER JOIN CLIENTE C ON C.ID_CLIENTE = )";
        PreparedStatement stm = conexao.prepareStatement(sql);
        stm.setInt(1, cliente.getID_CLIENTE());
        stm.setString(2, cliente.getNOME());
        stm.setString(3, cliente.getCPF());
        stm.setString(4, cliente.getEMAIL());
        stm.setInt(5, cliente.getDDD());
        stm.setInt(6, cliente.getTELEFONE());
        stm.execute();
        stm.close();
    }

    public void alterar(ClienteModel cliente) throws SQLException {
        String sql = "UPDATE CLIENTE SET NOME = ?, CPF = ?, "
                + "EMAIL = ?, DDD = ?, TELEFONE = ? WHERE ID_CLIENTE = ?";
        PreparedStatement stm = conexao.prepareStatement(sql);
        stm.setString(1, cliente.getNOME());
        stm.setString(2, cliente.getCPF());
        stm.setString(3, cliente.getEMAIL());
        stm.setInt(4, cliente.getDDD());
        stm.setInt(5, cliente.getTELEFONE());
        stm.setInt(6, cliente.getID_CLIENTE());
        stm.execute();
        stm.close();
    }

    public void excluir(ClienteModel cliente) throws SQLException {
        String sql = "DELETE FROM CLIENTE WHERE USU_ID = ?";
        PreparedStatement stm = conexao.prepareStatement(sql);
        stm.setInt(1, cliente.getID_CLIENTE());
        stm.execute();
        stm.close();
    }

}
