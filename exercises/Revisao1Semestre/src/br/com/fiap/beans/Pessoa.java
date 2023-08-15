package br.com.fiap.beans;

public abstract class Pessoa {
	
	private String name;
	private String email;
	private int age;
	protected double renda;
	
	public Pessoa() {
		super();
	}

	public Pessoa(String name, String email, int age, double renda) {
		super();
		this.name = name;
		this.email = email;
		this.age = age;
		this.renda = renda;
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

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getRenda() {
		return renda;
	}

	public void setRenda(double renda) {
		this.renda = renda;
	}
	
	public abstract String identificador();
	
	public abstract double pagarTaxa();
	
	
}
