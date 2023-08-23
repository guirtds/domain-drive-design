package br.com.fiap.main;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import br.com.fiap.beans.Cliente;

public class TesteArrayListWhile {
	
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
		
		int continuar = 0;
		
		while (continuar == 0) {
			
			objCliente = new Cliente();
			objCliente.setNome(texto("Nome:"));
			objCliente.setEmail(texto("Email:"));
			objCliente.setIdade(inteiro("Idadae:"));
			objCliente.setValor(real("Valor da consulta:"));
			
			listaClientes.add(objCliente);
			
			continuar = JOptionPane.showConfirmDialog(null, "Cadastrar mais clientes?",
					"Cadastro de Clientes", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
		}
		
		//Saídas
		
		for(Cliente cliente : listaClientes) {
			System.out.println("Nome: " + cliente.getNome() +
								"\nEmail: " + cliente.getEmail() +
								"\nIdade: " + cliente.getIdade() +
								"\nValor: " + cliente.getValor());
		}

	}

}
