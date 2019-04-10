package model;

public class Contato {
	
	private String nome;
	private int numero;
	private String bairro;
	private String rua;
	private String telefone;
	
	
	public String getTelefone() {
		return this.telefone;
	}
	
	public void setTelefone(String telefone){
		this.telefone = telefone;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
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
