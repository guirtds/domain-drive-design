package br.com.fiap.main;

import javax.swing.JOptionPane;

import br.com.fiap.beans.Cliente;
import br.com.fiap.beans.Produto;

public class Exec {

	public static void main(String[] args) {
		
		Cliente objCliente = new Cliente();
		Produto objProduto = new Produto();
		
		objCliente.setNome(JOptionPane.showInputDialog("Digite seu nome:"));
		objCliente.setIdade(Integer.parseInt(JOptionPane.showInputDialog("Diga sua idade:")));
		objCliente.setPeso(Double.parseDouble(JOptionPane.showInputDialog("Diga seu peso:")));
		objCliente.setProduto(objProduto);
		
		objProduto.setTipo("Celular");
		objProduto.setMarca("Apple");
		objProduto.setQuantidade(1);
		objProduto.setValor(4500);
		
		System.out.println("Nome:" + objCliente.getNome() +
						"\nIdade:" + objCliente.getIdade() +
						"\nPeso:" + objCliente.getPeso() +
						"\nTipo de produto:" + objCliente.getProduto().getTipo() +
						"\nMarca:" + objCliente.getProduto().getMarca() +
						"\nQuantidade:" + objCliente.getProduto().getQuantidade() +
						"\nValor:" + objCliente.getProduto().getValor());
		
	}

}
