package br.com.fiap.main;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import br.com.fiap.beans.Cliente;

public class TesteArrayListDoWhile {
	
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
		
		List<Cliente> listaClientes = new ArrayList<Cliente>();
		
		Cliente objCliente = null;
		
		do {
			objCliente = new Cliente();
			objCliente.setNome(texto("Nome:"));
			objCliente.setEmail(texto("Email:"));
			objCliente.setIdade(inteiro("Idade:"));
			objCliente.setValor(real("Valor da consulta:"));
			
			listaClientes.add(objCliente);
			
		} while (JOptionPane.showConfirmDialog(null, "Cadastrar mais clientes?",
				"Cadastro de Clientes", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE) == 0);
		
		//Saídas
		
		for(Cliente c : listaClientes) {
			System.out.println("Nome: " + c.getNome() +
								"\nEmail: " + c.getEmail() +
								"\nIdade: " + c.getIdade() +
								"\nValor: " + c.getValor());
		}

	}

}
