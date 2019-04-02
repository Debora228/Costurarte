
package br.edu.ifal.Loja.BEANS;
public class Serviços {
    private String nome;
    private double preco;
    private int quant;

    public Serviços(String nome, double preco,int quant) {
        this.nome = nome;
        this.preco = preco;
        this.quant=quant;
    }
    public Serviços(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQuant() {
        return quant;
    }

    public void setQuant(int quant) {
        this.quant = quant;
    }
    
    
}
