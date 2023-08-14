package br.com.fiap.beans;

public class PessoaFisica extends Pessoa {
	
	private String rg;
	private String cpf;
	
	public PessoaFisica() {
		super();
	}

	public PessoaFisica(String rg, String cpf) {
		super();
		this.rg = rg;
		this.cpf = cpf;
	}
	
	public PessoaFisica(String name, String email, int idade, double renda, String rg, String cpf) {
		super(name,email,idade,renda);
		this.rg = rg;
		this.cpf = cpf;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public String identificador() {
		return "PessoaFisica";
	}
	
	
	
	

}
