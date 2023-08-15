package br.com.fiap.beans;

public class Colaborador {
	
	private String nome;
	private String cargo;
	private Endereco endereco;
	private double valorHora;
	private double qtdadeHora;
	
	public Colaborador() {
		super();
	}

	public Colaborador(String nome, String cargo, double valorHora, double qtdadeHora) {
		super();
		this.nome = nome;
		this.cargo = cargo;
		this.valorHora = valorHora;
		this.qtdadeHora = qtdadeHora;
	}

	public Colaborador(String nome, String cargo, Endereco endereco, double valorHora, double qtdadeHora) {
		super();
		this.nome = nome;
		this.cargo = cargo;
		this.endereco = endereco;
		this.valorHora = valorHora;
		this.qtdadeHora = qtdadeHora;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public double getValorHora() {
		return valorHora;
	}

	public void setValorHora(double valorHora) {
		this.valorHora = valorHora;
	}
	
	public void setQtdadeHora(double qtdadeHora) {
		this.qtdadeHora = qtdadeHora;
	}

	public double calculoSalario(double qntdadeHoras) {
		return valorHora * qtdadeHora;
	}
	
	//método "workers"
	
	public double calculoSalario () {
		return valorHora * qtdadeHora;
	}
	
}
