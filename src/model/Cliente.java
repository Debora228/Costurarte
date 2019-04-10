package model;

public class Cliente {
	
	private int clienteId;
	private String cpf;
	private String dataNascimento;
	private Contato contato;
	
	public int getClienteId() {
		return clienteId;
	}
	public Contato getContato() {
		return this.contato;
	}
	public void setContato(Contato c) {
		this.contato = c;
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
