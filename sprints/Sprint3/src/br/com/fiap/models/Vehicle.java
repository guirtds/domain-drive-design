package br.com.fiap.models;

public class Vehicle {
	
	private int id;
	private String transitBoard;
	private double height;
	private double width;
	private double lenght;
	private double weight;
	private boolean isAxle;
	
	public Vehicle() {
		super();
	}

	public Vehicle(int id, String transitBoard, double height, double width, double lenght, double weight,
			boolean isAxle) {
		super();
		this.id = id;
		this.transitBoard = transitBoard;
		this.height = height;
		this.width = width;
		this.lenght = lenght;
		this.weight = weight;
		this.isAxle = isAxle;
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

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getLenght() {
		return lenght;
	}

	public void setLenght(double lenght) {
		this.lenght = lenght;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public boolean isAxle() {
		return isAxle;
	}

	public void setAxle(boolean isAxle) {
		this.isAxle = isAxle;
	}
	
	
	
}
