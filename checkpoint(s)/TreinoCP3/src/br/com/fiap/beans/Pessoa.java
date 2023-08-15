package br.com.fiap.beans;

public class Pessoa {
	
	private String nome;
	private String email;
	private int idade;
	private double venda;
	private Endereco endereco;
	
	public Pessoa() {
		super();
	}

	public Pessoa(String nome, String email, int idade, double venda) {
		super();
		this.nome = nome;
		this.email = email;
		this.idade = idade;
		this.venda = venda;
	}

	public Pessoa(String nome, String email, int idade, double venda, Endereco endereco) {
		super();
		this.nome = nome;
		this.email = email;
		this.idade = idade;
		this.venda = venda;
		this.endereco = endereco;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
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

	public double getVenda() {
		return venda;
	}

	public void setVenda(double venda) {
		this.venda = venda;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	
	//Sobre escrita
	
	public String identificador() {
		return "Indefinido!";
	}

}
