package br.com.fiap.main;

import br.com.fiap.beans.Cliente;
import br.com.fiap.beans.Endereco;
import br.com.fiap.beans.Produto;

public class TesteCliente {

	public static void main(String[] args) {
		
		Cliente objCliente = new Cliente();
		Endereco objEndereco = new Endereco();
		Produto objProduto = new Produto();
		
		
		//entrada
		
		objCliente.setNome("Guilherme");
		objCliente.setCpf("42877514854");
		objCliente.setRg("577547410");
		objCliente.setEndereco(objEndereco);
		
		//endere�o
		
		objEndereco.setLogradouro("Estrada S�o Francisco");
		objEndereco.setNumero(1800);
		objEndereco.setCep("06764290");
		objEndereco.setBairro("Jardim Henriqueta");
		objEndereco.setCidade("Tabo�o da Serra");
		objEndereco.setEstado("S�o Paulo");
		objEndereco.setNacionalidade("Brasileiro");
		
		//produto
		
		objProduto.setNomeProduto("T�nis");
		objProduto.setMarca("Nike");
		objProduto.setValor(800);
		
		//sa�da
		
		System.out.println("Nome: " + objCliente.getNome() +
		"\nCpf: " + objCliente.getCpf() +
		"\nRg: " + objCliente.getRg() +
		"\nLogradouro: " + objCliente.getEndereco().getLogradouro() +
		"\nN�mero: " + objCliente.getEndereco().getNumero() +
		"\nCep: " + objCliente.getEndereco().getCep() +
		"\nBairro: " + objCliente.getEndereco().getBairro() +
		"\nCidade: " + objCliente.getEndereco().getCidade() +
		"\nEstado: " + objCliente.getEndereco().getEstado() +
		"\nNacionalidade: " + objCliente.getEndereco().getNacionalidade() +
		"\nNomeProduto: " + objProduto.getNomeProduto() +
		"\nMarca: " + objProduto.getMarca() +
		"\nValor:" + objProduto.getValor());
		
		
	}

}
