package br.com.fiap.beans;

public class PessoaFisica extends Pessoa {
	
	private String cpf;
	

	public PessoaFisica() {
		super();
	}
	

	public PessoaFisica(String name, String email, int age, double renda, String cpf) {
		super(name, email, age, renda);
		this.cpf = cpf;
	}


	public String getCpf() {
		return cpf;
	}


	public void setCpf(String cpf) {
		this.cpf = cpf;
	}


	@Override
	public String identificador() {
		return "INFORMAÇÕES, Pessoa Fisica";
	}

	@Override
	public double pagarTaxa() {
		
		double taxaRenda;
		
		if (renda > 2000) {
			return taxaRenda = renda * 12/100;
		}else {
			taxaRenda = 0;
			return taxaRenda;
		}
	}

}
