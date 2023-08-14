package br.com.fiap.main;

import javax.swing.JOptionPane;

import br.com.fiap.beans.Colaborador;
import br.com.fiap.beans.Endereco;

public class TesteColaborador {

	public static void main(String[] args) {
		
		//String nome, String cargo, double valorHora, double qtdadeHora
		Colaborador objColaborador = new Colaborador(JOptionPane.showInputDialog("Digite o nome do colaborador:"),
										JOptionPane.showInputDialog("Diga o cargo:"),
										Double.parseDouble(JOptionPane.showInputDialog("Diga o valor hora do colaborador:")),
										Double.parseDouble(JOptionPane.showInputDialog("Informe a quantidade de horas trabalhadas:")));
		
		//String rua, int numero, String cep
		Endereco objEndereco = new Endereco(JOptionPane.showInputDialog("Digite o logradouro:"),
								Integer.parseInt(JOptionPane.showInputDialog("Diga o número da residência:")),
								JOptionPane.showInputDialog("Digite o CEP:"));
		
		objColaborador.setEndereco(objEndereco);
		
		
		System.out.println("Nome do colaborador: " + objColaborador.getNome() +
						"\nCargo: " + objColaborador.getCargo() +
						"\nValor hora: " + objColaborador.getValorHora() +
						"\nRua: " + objColaborador.getEndereco().getRua() +
						"\nNúmero da residência: " + objColaborador.getEndereco().getNumero() +
						"\nCEP: " + objColaborador.getEndereco().getCep());
		
		System.out.println("\nSalário do colaborador: " + objColaborador.calculoSalario());
		

	}

}
