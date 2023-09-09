package br.com.fiap.models;

public class ModalCategory {
	
	private int id;
	private String name;
	
	public ModalCategory() {
		super();
	}

	public ModalCategory(int id, String name) {
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
