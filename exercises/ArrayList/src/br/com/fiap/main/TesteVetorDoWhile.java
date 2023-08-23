package br.com.fiap.main;

import javax.swing.JOptionPane;

import br.com.fiap.beans.Cliente;

public class TesteVetorDoWhile {
	
	static String texto(String j) {
		return JOptionPane.showInputDialog(j);
	}
	
	static int inteiro(String j) {
		return Integer.parseInt(JOptionPane.showInputDialog(j));
	}
	
	static double real(String j) {
		return Double.parseDouble(JOptionPane.showInputDialog(j));
	}

	public static void main(String[] args) {
		
		//Instanciar
		
		Cliente[] vetorCliente = new Cliente[2];
		
		int indice = 0;
		
		//Entradas (índice)
		
		do {
			vetorCliente[indice] = new Cliente();
			vetorCliente[indice].setNome(texto("Nome:"));
			vetorCliente[indice].setEmail(texto("Email:"));
			vetorCliente[indice].setIdade(inteiro("Idade:"));
			vetorCliente[indice].setValor(real("Valor da consulta:"));
			
			indice ++;
			
		} while (JOptionPane.showConfirmDialog(null, "Cadastrar mais cliente?",
				"Cadastro de Clientes", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE) == 0);
		
		//Saídas (contador)
		
		for(int contador = 0; contador < indice; contador ++) {
			System.out.println("Nome: " + vetorCliente[contador].getNome() +
								"\nEmail: " + vetorCliente[contador].getEmail() +
								"\nIdade: " + vetorCliente[contador].getIdade() +
								"\nValor: " + vetorCliente[contador].getValor());
		}

	}

}
