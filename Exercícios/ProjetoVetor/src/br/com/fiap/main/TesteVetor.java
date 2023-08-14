package br.com.fiap.main;

import javax.swing.JOptionPane;

import br.com.fiap.beans.Produto;

public class TesteVetor {
	
	static String texto(String j) {
		return JOptionPane.showInputDialog(j);
	}
	
	static int inteiro(String j) {
		return Integer.parseInt(JOptionPane.showInputDialog(j));
	}
	
	static double real(String j) {
		return Double.parseDouble(JOptionPane.showInputDialog(j));
	}
	
	static double valorTotal(Produto[] p, int i) {
		double total = 0;
		for (int c = 0; c < i; c ++) {
			total += p[c].getValor() * p[c].getQuantidade();
		}
		
		return total;
	}

	public static void main(String[] args) {
		
		Produto[] vetorProdutos = new Produto[3];
		
		int indice = 0;
		
		do {
			
			vetorProdutos[indice] = new Produto();
			vetorProdutos[indice].setTipo(texto("Diga o tipo de produto:"));
			vetorProdutos[indice].setMarca(texto("Informe a marca do produto:"));
			vetorProdutos[indice].setQuantidade(inteiro("Digite a quantidade:"));
			vetorProdutos[indice].setValor(real("Informe o valor do produto:"));
			
			indice ++;
			
		}while(JOptionPane.showConfirmDialog(null, "Adicionar produto no carrinho?", "Carrinho de Compras", 
			   JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE) == 0);
		
		for (int contador = 0; contador < indice; contador ++) {
			System.out.println("Tipo de produto: " + vetorProdutos[contador].getTipo() +
							   "\nMarca do produto: " + vetorProdutos[contador].getMarca() +
							   "\nQuantidade do(s) produto(s): " + vetorProdutos[contador].getQuantidade() +
							   "\nValor do(s) produto(s): " + vetorProdutos[contador].getValor() + "\n");
		}
		
		System.out.println("Valor Total: " + valorTotal(vetorProdutos, indice));
		
	}

}
