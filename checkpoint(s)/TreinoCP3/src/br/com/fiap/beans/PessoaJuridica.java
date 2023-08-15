package br.com.fiap.beans;

public class PessoaJuridica extends Pessoa{
	
	private String razaoSocial;
	private String cnpj;
	
	public PessoaJuridica() {
		super();
	}

	public PessoaJuridica(String razaoSocial, String cnpj) {
		super();
		this.razaoSocial = razaoSocial;
		this.cnpj = cnpj;
	}

	public PessoaJuridica(String nome, String email, int idade, double venda, String razaoSocial, String cnpj) {
		super(nome, email, idade, venda);
		this.razaoSocial = razaoSocial;
		this.cnpj = cnpj;
	}

	public String getRazaoSocial() {
		return razaoSocial;
	}

	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	
	public String identificador() {
		return "PJ!";
	}

}
