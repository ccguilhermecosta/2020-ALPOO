/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dao.ClienteDao;
import java.sql.SQLException;
import model.ClienteModel;

/**
 *
 * @author guilherme
 */
public class ClienteController {
    
    public void adicionar(ClienteModel cliente) throws SQLException {
        ClienteDao dao = new ClienteDao();
        dao.adicionar(cliente);
    }
    
    public void gravar(String operacao, ClienteModel cliente) throws SQLException {
        boolean retorno = true;
        if (operacao.equals("incluir")) {
            adicionar(cliente);
        } else if (operacao.equals("alterar")) {
            alterar(cliente);
        }
    }
    
        public void alterar(ClienteModel usuario) throws SQLException {
        ClienteDao dao = new ClienteDao();
        dao.alterar(usuario);
    }
}


