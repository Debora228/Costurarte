package model;

public class Cliente {
	
	private int clienteId;
	private String cpf;
	private String dataNascimento;
	private Contato contato;
	
	public void setClienteId(int clienteId) {
		this.clienteId = clienteId;
	}
	public int getClienteId() {
		return clienteId;
	}
	public Contato getContato() {
		return this.contato;
	}
	public Contato setContato(Contato c) {
		this.contato = c;
		return contato;
	}
	
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

}
