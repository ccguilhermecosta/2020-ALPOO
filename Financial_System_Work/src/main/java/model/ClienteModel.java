package model;

/**
 *
 * @author guilherme
 */
public class ClienteModel {
    
    private int ID_CLIENTE;
    private String NOME;
    private String CPF;
    private String EMAIL;
    private int DDD;
    private int TELEFONE;
    
    public ClienteModel() {
    }
    
     public ClienteModel(int ID_CLIENTE, String NOME, String CPF, String EMAIL, int DDD, int TELEFONE) {
         this.ID_CLIENTE = ID_CLIENTE;
         this.NOME = NOME;
         this.CPF = CPF;
         this.EMAIL = EMAIL;
         this.DDD = DDD;
         this.TELEFONE = TELEFONE;
    }

    public int getID_CLIENTE() {
        return ID_CLIENTE;
    }

    public void setID_CLIENTE(int ID_CLIENTE) {
        this.ID_CLIENTE = ID_CLIENTE;
    }

    public String getNOME() {
        return NOME;
    }

    public void setNOME(String NOME) {
        this.NOME = NOME;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public String getEMAIL() {
        return EMAIL;
    }

    public void setEMAIL(String EMAIL) {
        this.EMAIL = EMAIL;
    }

    public int getDDD() {
        return DDD;
    }

    public void setDDD(int DDD) {
        this.DDD = DDD;
    }

    public int getTELEFONE() {
        return TELEFONE;
    }

    public void setTELEFONE(int TELEFONE) {
        this.TELEFONE = TELEFONE;
    }
     
     
    
}
