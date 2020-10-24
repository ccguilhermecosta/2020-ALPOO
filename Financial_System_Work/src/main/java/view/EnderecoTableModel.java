/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;
import model.EnderecoModel;

/**
 *
 * @author guilherme
 */
public class EnderecoTableModel extends AbstractTableModel {

    private ArrayList<EnderecoModel> linhas;
    String[] colunas;
    
    public EnderecoTableModel(ArrayList<EnderecoModel> array, String[] colunas) {
        this.colunas = colunas;
        linhas = array;
    }
    
    //Retorna a quantidade de colunas do modelo, que no caso será fixa
    @Override
    public int getColumnCount() {
        return colunas.length;
    }
    
    //Retorna a quantidade de linhas atual do objeto, que no caso é o tamnho da lista
    @Override
    public int getRowCount() {
        return linhas.size();
    }
    
     //Retorna o nome da coluna, recebendo seu índice
    @Override
    public String getColumnName(int indiceColuna) {
        return colunas[indiceColuna];
    }
    
     @Override
    public Object getValueAt(int row, int col) {
        EnderecoModel endereco = (EnderecoModel) linhas.get(row);
        switch (col) {
            case 0:
                return endereco.getID_ENDERECO();
            case 1:
                return endereco.getTIPO();
            case 2:
                return endereco.getLOGRADOURO();
            case 3:
                return endereco.getCEP();
            case 4: 
                return endereco.getNUMERO();
            case 5:
                return endereco.getCIDADE();
            case 6:
                return endereco.getESTADO();
            default:
                return null;
        }
    }
    
    //Adicionamos várias linhas na tabela de uma vez, recebendo um List de UsuarioModel
    public void addLista(ArrayList<EnderecoModel> endereco) {
        int tamanhoAntigo = getRowCount();

        //Adiciona os usuários
        linhas.addAll(endereco);

        //Aqui reportamos a mudança para o JTable, assim ele pode se redesenhar, para visualizarmos a alteração
        fireTableRowsInserted(tamanhoAntigo, getRowCount() - 1);
    }
}
