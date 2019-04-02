
package br.edu.ifal.Loja.BEANS;

public class LoginBEAN {
   private int cod;
   private String nome;
   private String senha;

    public LoginBEAN(int cod, String nome, String senha) {
        this.cod = cod;
        this.nome = nome;
        this.senha = senha;
    }

    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
   
}
