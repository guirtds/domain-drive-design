package br.com.fiap.main;

import javax.swing.JOptionPane;

import br.com.fiap.beans.Cliente;
import br.com.fiap.beans.Endereco;
import br.com.fiap.beans.Telefone;

public class TesteCliente {

	public static void main(String[] args) {
		
		//instanciar objetos
		
		Cliente objCliente = new Cliente();
		Endereco objEndereco = new Endereco();
		Telefone objTelefone = new Telefone();
		
		//setters
		
		objCliente.setNome(JOptionPane.showInputDialog("Digite seu nome:"));
		objCliente.setIdade(Integer.parseInt(JOptionPane.showInputDialog("Diga sua idade:")));
		objCliente.setPeso(Double.parseDouble(JOptionPane.showInputDialog("Informe seu peso:")));
		objCliente.setEndereco(objEndereco);
		
		//endereço
		
		objEndereco.setLogradouro(JOptionPane.showInputDialog("Informe o seu logradouro:"));
		objEndereco.setNumero(Integer.parseInt(JOptionPane.showInputDialog("Diga o número de sua casa:")));
		objEndereco.setBairro("Jd Henriqueta");
		objEndereco.setMunicipio("Taboão da Serra");
		objEndereco.setCep("06764290");
		objEndereco.setEstado("São Paulo");
		objEndereco.setNacionalidade("Brasileiro");
		
		//telefone
		
		objTelefone.setFixo("(11) 5555-555");
		objTelefone.setCelular("947166838");
		objTelefone.setComercial("(11)947166838");
		objTelefone.setContato("9999-999");
		
		//getters
		
		System.out.println("Nome: " + objCliente.getNome() +
				"\nIdade: " + objCliente.getIdade() +
				"\nPeso: " + objCliente.getPeso() +
				"\nLogradouro: " + objCliente.getEndereco().getLogradouro() +
				"\nNumero: " + objCliente.getEndereco().getNumero() +
				"\nCep: " + objCliente.getEndereco().getCep() +
				"\nBairro: " + objCliente.getEndereco().getBairro() +
				"\nMunicipio: " + objCliente.getEndereco().getMunicipio() +
				"\nEstado: " + objCliente.getEndereco().getEstado() +
				"\nNacionalidade: " + objCliente.getEndereco().getNacionalidade() +
				"\nTelefone fixo: " + objTelefone.getFixo() +
				"\nTelefone celular: " + objTelefone.getCelular() +
				"\nTelefone comercial: " + objTelefone.getComercial() +
				"\nTelefone contato: " + objTelefone.getContato());
		
		
	}

}
