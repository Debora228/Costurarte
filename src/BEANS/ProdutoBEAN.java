
package BEANS;

public class ProdutoBEAN {
    private  int id;
    private String nome;
    private double preco_Custo;
    private String descricao;
    private String categoria;
    private String cor;
    private String marca;
    private double preco_venda;
    private int quantidade;
    
    public ProdutoBEAN(int id, String nome, double preco_Custo, String descricao, String categoria, String cor, String marca,double preco_venda, int quantidade) {
        this.id = id;
        this.nome = nome;
        this.preco_Custo = preco_Custo;
        this.descricao = descricao;
        this.categoria = categoria;
        this.cor = cor;
        this.marca = marca;
        this.preco_venda = preco_venda;
        this.quantidade = quantidade;
    }
    public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	public ProdutoBEAN() {
    }
    
   public String toString (){
       return getId() + " " + getNome() + ": " + getPreco_Custo()+"; "+ getDescricao() + "; " + getCategoria() + "; " + getCor() + "; " + getMarca() + "; " + getPreco_venda();
   }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco_Custo() {
        return preco_Custo;
    }

    public void setPreco_Custo(double preco_Custo) {
        this.preco_Custo = preco_Custo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getPreco_venda() {
        return preco_venda;
    }

    public void setPreco_venda(double preco_venda) {
        this.preco_venda = preco_venda;
    }
}
