package model;

/**
 *
 * @author guilherme
 */
public class UsuarioModel {

    private int ID;
    private String NOME;
    private int ATIVO;
    private String CADASTRO;

    public UsuarioModel() {
    }

    public UsuarioModel(int ID, String NOME, int ATIVO, String CADASTRO) {
        this.ID = ID;
        this.NOME = NOME;
        this.ATIVO = ATIVO;
        this.CADASTRO = CADASTRO;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getNOME() {
        return NOME;
    }

    public void setNOME(String NOME) {
        this.NOME = NOME;
    }

    public String getCADASTRO() {
        return CADASTRO;
    }

    public void setCADASTRO(String CADASTRO) {
        this.CADASTRO = CADASTRO;
    }

    public int getATIVO() {
        return ATIVO;
    }

    public void setATIVO(int ATIVO) {
        this.ATIVO = ATIVO;
    }


}
