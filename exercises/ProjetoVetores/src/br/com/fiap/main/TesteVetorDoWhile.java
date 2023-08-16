package br.com.fiap.main;

import javax.swing.JOptionPane;

import br.com.fiap.beans.Produto;

public class TesteVetorDoWhile {
	
	static String texto (String j) {
		return JOptionPane.showInputDialog(j);
	}
	
	static int inteiro (String j) {
		return Integer.parseInt(JOptionPane.showInputDialog(j));
	}
	
	static double real (String j) {
		return Double.parseDouble(JOptionPane.showInputDialog(j));
	}
	
	static double valorTotal(Produto[] p, int i) {
		double total = 0;
		
		for (int c = 0; c < i; c ++)
			
			total += p[c].getValor() * p[c].getQuantidade();
 		
		return total;
	}

	public static void main(String[] args) {
		
		Produto[] vetorProdutos = new Produto[3];
		
		int indice = 0;
		
		//Entradas
		
		do {
			
			vetorProdutos[indice] = new Produto();
			vetorProdutos[indice].setTipo(texto("Tipo:"));
			vetorProdutos[indice].setMarca(texto("Marca:"));
			vetorProdutos[indice].setQuantidade(inteiro("Quantidade:"));
			vetorProdutos[indice].setValor(real("Valor:"));
			
			indice ++;
		
		}while(JOptionPane.showConfirmDialog(null, "Adicionar produto?", "Carrinho de compras",
			   JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE) == 0);
		
		//Saídas
		
		for (int contador = 0; contador < indice; contador ++) {
			
			System.out.println("Tipo: " + vetorProdutos[contador].getTipo() +
							   "\nMarca: " + vetorProdutos[contador].getMarca() +
							   "\nQuantidade: " + vetorProdutos[contador].getQuantidade() +
							   "\nValor: " + vetorProdutos[contador].getValor() + "\n");
		}
		
		System.out.println("VALOR TOTAL: " + valorTotal(vetorProdutos, indice));

	}

}
