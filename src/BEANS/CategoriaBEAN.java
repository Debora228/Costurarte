
package BEANS;


public class CategoriaBEAN {
    private int cod;
    private String nome;

    public CategoriaBEAN(int cod, String nome) {
        this.cod = cod;
        this.nome = nome;
    }
     public CategoriaBEAN( String nome) {
        this.nome = nome;
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
    
    
}
