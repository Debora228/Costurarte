
package br.edu.ifal.Loja.BEANS;

public class FornecedorBEAN {
 private int fornecedor_id;
    private String cnpj;
    private ContatoBEAN con;

    public FornecedorBEAN(int fornecedor_id, String cnpj, ContatoBEAN con) {
        this.fornecedor_id = fornecedor_id;
        this.cnpj = cnpj;
        this.con = con;
    }
    public FornecedorBEAN( String cnpj, ContatoBEAN con){
        this.cnpj = cnpj;
        this.con = con;
    } 
    
    
    public int getFornecedor_id(){
        return fornecedor_id;
    }
    public void setFornecedor_id(int fornecedor_id){
        this.fornecedor_id = fornecedor_id;
    }
    public String getCnpj(){
        return cnpj;
    }
    public void setCnpj(String cnpj){
        this.cnpj=cnpj;
    }

    public ContatoBEAN getCon() {
        return con;
    }

    public void setCon(ContatoBEAN con) {
        this.con = con;
    }
}

    
