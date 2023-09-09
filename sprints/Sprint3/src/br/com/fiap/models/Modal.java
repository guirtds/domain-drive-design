package br.com.fiap.models;

public class Modal {
	
	private int id;
	private String transitBoard;
	
	public Modal() {
		super();
	}

	public Modal(int id, String transitBoard) {
		super();
		this.id = id;
		this.transitBoard = transitBoard;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTransitBoard() {
		return transitBoard;
	}

	public void setTransitBoard(String transitBoard) {
		this.transitBoard = transitBoard;
	}
	
	

}
