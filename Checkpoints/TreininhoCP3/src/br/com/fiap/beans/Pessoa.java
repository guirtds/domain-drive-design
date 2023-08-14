package br.com.fiap.beans;

public class Pessoa {
	
	private String name;
	private String email;
	private int idade;
	private double renda;
	private Endereco endereco;
	
	public Pessoa() {
		super();
	}

	public Pessoa(String name, String email, int idade, double renda) {
		super();
		this.name = name;
		this.email = email;
		this.idade = idade;
		this.renda = renda;
	}

	public Pessoa(String name, String email, int idade, double renda, Endereco endereco) {
		super();
		this.name = name;
		this.email = email;
		this.idade = idade;
		this.renda = renda;
		this.endereco = endereco;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public double getRenda() {
		return renda;
	}

	public void setRenda(double renda) {
		this.renda = renda;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	
	//overwrite
	public String identificador() {
		return "Indefinido";
	}
	
	
	
	

}
