package br.com.fiap.beans;

public class Colaborador {
	
	private String nome;
	private int idade;
	private String rg;
	private String cargo;
	private double salario;
	
	//vazio
	
	public Colaborador() {
		super();
	}

	//cheio
	
	public Colaborador(String nome, int idade, String rg, String cargo, double salario) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.rg = rg;
		this.cargo = cargo;
		this.salario = salario;
	}

	//entradas e saídas
	
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


	public String getRg() {
		return rg;
	}


	public void setRg(String rg) {
		this.rg = rg;
	}


	public String getCargo() {
		return cargo;
	}


	public void setCargo(String cargo) {
		this.cargo = cargo;
	}


	public double getSalario() {
		return salario;
	}


	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	

}
