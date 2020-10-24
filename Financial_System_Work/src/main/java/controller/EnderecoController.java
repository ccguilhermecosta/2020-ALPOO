/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dao.EnderecoDao;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.EnderecoModel;

/**
 *
 * @author guilherme
 */
public class EnderecoController {
    
    public void adicionar(EnderecoModel cliente) throws SQLException {
        EnderecoDao dao = new EnderecoDao();
        dao.adicionar(cliente);
    }
    
      private List<EnderecoModel> listaenderecos;

    public ArrayList<EnderecoModel> consultar(String filtro) throws SQLException {
        listaenderecos = new EnderecoDao().consultar(filtro);
        return (ArrayList<EnderecoModel>) listaenderecos;
    }
    
    public void gravar(String operacao, EnderecoModel cliente) throws SQLException {
        boolean retorno = true;
        if (operacao.equals("incluir")) {
            adicionar(cliente);
        } else if (operacao.equals("alterar")) {
            alterar(cliente);
        }
    }
    
        public void alterar(EnderecoModel usuario) throws SQLException {
        EnderecoDao dao = new EnderecoDao();
        dao.alterar(usuario);
    }
}
