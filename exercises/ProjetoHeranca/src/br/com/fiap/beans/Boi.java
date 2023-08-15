package br.com.fiap.beans;

public class Boi extends Mamifero{
	
	private double tamanhoChifre;

	public Boi() {
		super();
	}

	public Boi(double tamanhoChifre) {
		super();
		this.tamanhoChifre = tamanhoChifre;
	}
	
	public Boi (String nome, int idade, double peso, double velocidade, double tamanhoChifre) {
		super(nome, idade, peso, velocidade);
		this.tamanhoChifre = tamanhoChifre;
	}

	public double getTamanhoChifre() {
		return tamanhoChifre;
	}

	public void setTamanhoChifre(double tamanhoChifre) {
		this.tamanhoChifre = tamanhoChifre;
	}
	
	

}
