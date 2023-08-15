package br.com.fiap.beans;

public class Endereco {
	
	private String rua;
	private int numero;
	private String cep;
	private String bairro;
	private String municipio;
	private String estado;
	
	//vazio
	
	public Endereco() {
		super();
	}

	//cheio
	
	public Endereco(String rua, int numero, String cep, String bairro, String municipio, String estado) {
		super();
		this.rua = rua;
		this.numero = numero;
		this.cep = cep;
		this.bairro = bairro;
		this.municipio = municipio;
		this.estado = estado;
	}

	//entradas e saídas
	
	public String getRua() {
		return rua;
	}

	public void setRua(String rua) {
		this.rua = rua;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getMunicipio() {
		return municipio;
	}

	public void setMunicipio(String municipio) {
		this.municipio = municipio;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}
	
	

}
