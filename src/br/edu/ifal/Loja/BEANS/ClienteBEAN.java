
package br.edu.ifal.Loja.BEANS;

public class ClienteBEAN {
  
   
    private int cliente_id;
    private String cpf;
    private String data_nascimento;
    private ContatoBEAN contato;

    public ClienteBEAN(int cliente_id, String cpf, String data_nascimento, ContatoBEAN contato) {
        this.cliente_id = cliente_id;
        this.cpf = cpf;
        this.data_nascimento = data_nascimento;
        this.contato = contato;
    }
     public ClienteBEAN( String cpf, String data_nascimento, ContatoBEAN contato) {
        this.cpf = cpf;
        this.data_nascimento = data_nascimento;
        this.contato = contato;
    }
    
    public String getCpf(){
        return cpf;
    }
    public void setCpf(String cpf){
        this.cpf = cpf;
    }
    public String getData_nascimento(){
        return data_nascimento;
    }
    public void setData_nascimento(String data_nascimento){
        this.data_nascimento = data_nascimento;
}

    public ContatoBEAN getContato() {
        return contato;
    }

    public void setContato(ContatoBEAN contato) {
        this.contato = contato;
    }

    public int getCliente_id() {
        return cliente_id;
    }

    public void setCliente_id(int cliente_id) {
        this.cliente_id = cliente_id;
    }
    
    
}