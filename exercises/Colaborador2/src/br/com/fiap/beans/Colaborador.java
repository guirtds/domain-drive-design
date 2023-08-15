package br.com.fiap.beans;

public class Colaborador {
	
	private String nome;
	private String cargo;
	private double percentual;
	private double valorHora;
	private double qtHoras;
	private Endereco endereco;
	
	public Colaborador() {
		super();
	}


	public Colaborador(String nome, String cargo, double percentual, double valorHora, double qtHoras) {
		super();
		this.nome = nome;
		this.cargo = cargo;
		this.valorHora = valorHora;
		this.qtHoras = qtHoras;
		this.percentual = percentual;
	}

	
	public Colaborador(String nome, String cargo, double percentual, Endereco endereco) {
		super();
		this.nome = nome;
		this.cargo = cargo;
		this.valorHora = valorHora;
		this.qtHoras = qtHoras;
		this.percentual = percentual;
		this.endereco = endereco;
		
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
	
	public double getValorHora() {
		return valorHora;
	}

	public void setValorHora(double valorHora) {
		this.valorHora = valorHora;
	}

	public double getQtHoras() {
		return qtHoras;
	}

	public void setQtHoras(double qtHoras) {
		this.qtHoras = qtHoras;
	}

	public double getPercentual() {
		return percentual;
	}

	public void setPercentual(double percentual) {
		this.percentual = percentual;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	
	public double calcularSalario() {
		return valorHora * qtHoras;
	}
	
	public double calcularIr () {
		return calcularSalario() * percentual/100;
	}
	
	public String informacaoSalario() {
		String informacao;
		if (calcularSalario() <= 2000) {
			informacao = "Não descontado imposto de renda!";
		}else {
			informacao = "Descontado imposto de renda!";
		}
			return informacao;
	}

	public double salarioLiquido() {
		double salario;
		if(calcularSalario() <= 2000) {
			salario = calcularSalario();
		}else {
			salario = calcularSalario() - calcularIr();
		}
			return salario;
	}
	
}
