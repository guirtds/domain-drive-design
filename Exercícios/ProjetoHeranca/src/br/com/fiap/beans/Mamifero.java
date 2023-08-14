package br.com.fiap.beans;

public class Mamifero {
	
	private String nome;
	private int idade;
	private double peso;
	private double velocidade;
	
	public Mamifero() {
		super();
	}

	public Mamifero(String nome, int idade, double peso, double velocidade) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.peso = peso;
		this.velocidade = velocidade;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public double getVelocidade() {
		return velocidade;
	}

	public void setVelocidade(double velocidade) {
		this.velocidade = velocidade;
	}
	
	
	
	

}
