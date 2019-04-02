
package br.edu.ifal.Loja.BEANS;

public  class  ContatoBEAN{
    private String nome, telefone;
    private int  numero;
    private String bairro, rua;

    public ContatoBEAN(String nome, String telefone, String bairro,  String rua, int numero) {
        this.nome = nome;
        this.telefone = telefone;
        this.numero = numero;
        this.bairro = bairro;
        this.rua = rua;
    }

    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }
    
}
