package model;

public class Fornecedor {
	
	private int fornecedor;
	private String cnpj;
	private Contato contato;
	
	public int getFornecedor() {
		return fornecedor;
	}
	public void setContato(Contato c) {
		this.contato = c;
	}
	
	public Contato getContato() {
		return this.contato;
	}
	public void setFornecedor(int fornecedor) {
		this.fornecedor = fornecedor;
	}
	public String getCnpj() {
		return cnpj;
	}
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	
}
