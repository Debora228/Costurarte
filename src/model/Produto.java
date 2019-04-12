package model;

public class Produto {
	
	private int cod;
	private String nome;
	private double precoCusto;
	private String descricao;
	private String cor;
	private String marca;
	private double precoVenda;
	private Categoria categoria;
	private int quantidade;
	
	
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
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
	public double getPrecoCusto() {
		return precoCusto;
	}
	public void setPrecoCusto(double precoCusto) {
		this.precoCusto = precoCusto;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String decricao) {
		this.descricao = decricao;
	}
	public Categoria getCategoria() {
		return categoria;
	}
	public Categoria setCategoria(Categoria categoria) {
		this.categoria = categoria;
		return categoria;
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
	public double getPrecoVenda() {
		return precoVenda;
	}
	public void setPrecoVenda(double precoVenda) {
		this.precoVenda = precoVenda;
	}
	@Override
	public String toString() {
		return "Produto [cod=" + cod + ", nome=" + nome + ", precoCusto=" + precoCusto + ", descricao=" + descricao
				+ ", cor=" + cor + ", marca=" + marca + ", precoVenda=" + precoVenda + ", categoria=" + categoria
				+ ", quantidade=" + quantidade + "]";
	}
	
	
	
}
