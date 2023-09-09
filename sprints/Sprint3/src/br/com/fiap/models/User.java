package br.com.fiap.models;

public class User {
	
	private int id;
	private String name;
	private String lastName;
	private String fullName;
	private String cpf;
	
	public User() {
		super();
	}

	public User(int id, String name, String lastName, String fullName, String cpf) {
		super();
		this.id = id;
		this.name = name;
		this.lastName = lastName;
		this.fullName = fullName;
		this.cpf = cpf;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	
	

}
