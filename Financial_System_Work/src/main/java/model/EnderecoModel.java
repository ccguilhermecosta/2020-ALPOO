/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author guilherme
 */
public class EnderecoModel {

    private int ID_ENDERECO;
    private String TIPO;
    private String LOGRADOURO;
    private String CEP;
    private int NUMERO;
    private String CIDADE;
    private String ESTADO;
    
    public EnderecoModel(){
        
    }

    public EnderecoModel(int ID_ENDERECO, String TIPO, String LOGRADOURO, String CEP, int NUMERO, String CIDADE, String ESTADO) {
        this.ID_ENDERECO = ID_ENDERECO;
        this.TIPO = TIPO;
        this.LOGRADOURO = LOGRADOURO;
        this.CEP = CEP;
        this.NUMERO = NUMERO;
        this.CIDADE = CIDADE;
        this.ESTADO = ESTADO;
    }

    public int getID_ENDERECO() {
        return ID_ENDERECO;
    }

    public void setID_ENDERECO(int ID_ENDERECO) {
        this.ID_ENDERECO = ID_ENDERECO;
    }

    public String getTIPO() {
        return TIPO;
    }

    public void setTIPO(String TIPO) {
        this.TIPO = TIPO;
    }

    public String getLOGRADOURO() {
        return LOGRADOURO;
    }

    public void setLOGRADOURO(String LOGRADOURO) {
        this.LOGRADOURO = LOGRADOURO;
    }

    public String getCEP() {
        return CEP;
    }

    public void setCEP(String CEP) {
        this.CEP = CEP;
    }

    public int getNUMERO() {
        return NUMERO;
    }

    public void setNUMERO(int NUMERO) {
        this.NUMERO = NUMERO;
    }

    public String getCIDADE() {
        return CIDADE;
    }

    public void setCIDADE(String CIDADE) {
        this.CIDADE = CIDADE;
    }

    public String getESTADO() {
        return ESTADO;
    }

    public void setESTADO(String ESTADO) {
        this.ESTADO = ESTADO;
    }

}
