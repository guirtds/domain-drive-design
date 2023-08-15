package br.com.fiap.main;

import javax.swing.JOptionPane;

import br.com.fiap.beans.Cliente;
import br.com.fiap.beans.Endereco;
import br.com.fiap.beans.Telefone;

public class TesteCliente {

	public static void main(String[] args) {
		
	Cliente objCliente = new Cliente();
	Endereco objEndereco = new Endereco();
	Telefone objTelefone = new Telefone();
		
	//Entrada
	
	objCliente.setNome(JOptionPane.showInputDialog("Digite seu nome: "));
	objCliente.setIdade(17);
	objCliente.setPeso(62);
	objCliente.setEndereco(objEndereco);
	objCliente.setTelefone(objTelefone);
	
	//Endereço
	
	objEndereco.setLogradouro("Est São Francisco");
	objEndereco.setNumero(1800);
	objEndereco.setCep("06764290");
	objEndereco.setBairro("Jardim Henriqueta");
	objEndereco.setMunicipio("Taboão da Serra");
	objEndereco.setEstado("São Paulo");
	
	//Telefone
	
	objTelefone.setFoneFixo("(11)9999-999");
	objTelefone.setFoneCelular("(11)94716-6838");
	objTelefone.setFoneComercial("(11)99999-9999");
	objTelefone.setFoneContato("(11)94716-6838");
	
	
	
	//Saída
	
		System.out.println("Nome: " + objCliente.getNome() +
				"\nIdade: " + objCliente.getIdade() +
				"\nPeso: " + objCliente.getPeso() +
				"\nLogradouro: " + objCliente.getEndereco().getLogradouro() +
				"\nNumero: " + objCliente.getEndereco().getNumero() +
				"\nCep: " + objCliente.getEndereco().getCep() +
				"\nBairro: " + objCliente.getEndereco().getBairro() +
				"\nMunicipio: " + objCliente.getEndereco().getMunicipio() + 
				"\nEstado: " + objCliente.getEndereco().getEstado() +
				"\nFoneFixo: " + objCliente.getTelefone().getFoneFixo() +
				"\nFoneCelular: " + objCliente.getTelefone().getFoneCelular() +
				"\nFoneComercial: " + objCliente.getTelefone().getFoneComercial() +
				"\nFoneContato: " + objCliente.getTelefone().getFoneContato());	

	}

}
