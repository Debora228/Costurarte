package model;
import java.util.List;

public class Carrinho {	
	private double desconto;
	private String fornecedor;
	private String nome;
	private int quant;
	private int codCarrinho;
	private double precoTotal;
	private String descricao;
	private String cor;
	private String marca;
	private double precoCompra;
	private List<Produto> produtos;
	
	public double getDesconto() {
		return desconto;
	}
	
	public List<Produto> getListaProdutos() {
		return this.produtos;
	}
	public void setListaProdutos(Produto p) {
		this.produtos.add(p);
	}
	public void setDesconto(double desconto) {
		this.desconto = desconto;
	}
	public String getFornecedor() {
		return fornecedor;
	}
	public void setFornecedor(String fornecedor) {
		this.fornecedor = fornecedor;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getQuant() {
		return quant;
	}
	public void setQuant(int quant) {
		this.quant = quant;
	}
	public int getCodCarrinho() {
		return codCarrinho;
	}
	public void setCodCarrinho(int codCarrinho) {
		this.codCarrinho = codCarrinho;
	}
	public double getPrecoTotal() {
		return precoTotal;
	}
	public void setPrecoTotal(double precoTotal) {
		this.precoTotal = precoTotal;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
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
	public double getPrecoCompra() {
		return precoCompra;
	}
	public void setPrecoCompra(double precoCompra) {
		this.precoCompra = precoCompra;
	}
	

}
