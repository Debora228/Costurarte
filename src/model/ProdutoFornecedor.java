package model;

public class ProdutoFornecedor {
	
	private int codFornecedor;
	private int codProdutos;
	private int precoCompraUnitario;
	private int quant;
	private double precoCompra;
	
	public int getCodFornecedor() {
		return codFornecedor;
	}
	public void setCodFornecedor(int codFornecedor) {
		this.codFornecedor = codFornecedor;
	}
	public int getCodProdutos() {
		return codProdutos;
	}
	public void setCodProdutos(int codProdutos) {
		this.codProdutos = codProdutos;
	}
	public int getPrecoCompraUnitario() {
		return precoCompraUnitario;
	}
	public void setPrecoCompraUnitario(int precoCompraUnitario) {
		this.precoCompraUnitario = precoCompraUnitario;
	}
	public int getQuant() {
		return quant;
	}
	public void setQuant(int quant) {
		this.quant = quant;
	}
	public double getPrecoCompra() {
		return precoCompra;
	}
	public void setPrecoCompra(double precoCompra) {
		this.precoCompra = precoCompra;
	}
	
	@Override
	public String toString() {
		return "ProdutoFornecedor [codFornecedor=" + codFornecedor + ", codProdutos=" + codProdutos
				+ ", precoCompraUnitario=" + precoCompraUnitario + ", quant=" + quant + ", precoCompra=" + precoCompra
				+ "]";
	}
	
}
