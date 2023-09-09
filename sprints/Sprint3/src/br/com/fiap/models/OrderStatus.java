package br.com.fiap.models;

public class OrderStatus {
	
	private int id;
	private String name;
	
	public OrderStatus() {
		super();
	}

	public OrderStatus(int id, String name) {
		super();
		this.id = id;
		this.name = name;
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
	
	
	

}
