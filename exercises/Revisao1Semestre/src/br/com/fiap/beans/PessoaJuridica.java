package br.com.fiap.beans;

public class PessoaJuridica extends Pessoa {
	
	private String cnpj;
	

	public PessoaJuridica(String name, String email, int age, double renda, String cnpj) {
		super(name, email, age, renda);
		this.cnpj = cnpj;
	}

	public PessoaJuridica() {
		super();
	}
	

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	@Override
	public String identificador() {
		return "Pessoa Juridica";
	}

	@Override
	public double pagarTaxa() {
		
double taxaRenda;
		
		if (renda > 2000) {
			return taxaRenda = renda * 20/100;
		}else {
			taxaRenda = 0;
			return taxaRenda;
		}
		
	}

}
