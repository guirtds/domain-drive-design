package br.com.fiap.main;

import javax.swing.JOptionPane;

import br.com.fiap.beans.Produto;

public class TesteProduto {
	
	static String texto (String j) {
		return JOptionPane.showInputDialog(j);
	}
	
	static int inteiro (String j) {
		return Integer.parseInt(JOptionPane.showInputDialog(j));
	}
	
	static double real (String j) {
		return Double.parseDouble(JOptionPane.showInputDialog(j));
	}

	public static void main(String[] args) {
		
		Produto[] vetorProduto = new Produto[5];
		
		int indice = 0;
		
		do {
			
			vetorProduto[indice] = new Produto();
			vetorProduto[indice].setTipo(texto("Informe o tipo de produto:"));
			vetorProduto[indice].setMarca(texto("Informe a marca:"));
			vetorProduto[indice].setQuantidade(inteiro("Diga a quantidade:"));
			vetorProduto[indice].setValor(real("Informe o valor:"));
			
			indice ++;
			
		}while(JOptionPane.showConfirmDialog(null, "Adicionar produtos no carrinho?", "Carrinho de compras",
				JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE) == 0);
		
		
			for(int contador = 0; contador < indice; contador ++) {
				System.out.println("Tipo: " + vetorProduto[contador].getTipo() +
									"\nMarca: " + vetorProduto[contador].getMarca() +
									"\nQuantidade: " + vetorProduto[contador].getQuantidade() +
									"\nValor: " + vetorProduto[contador].getValor());
			}
		

	}

}
