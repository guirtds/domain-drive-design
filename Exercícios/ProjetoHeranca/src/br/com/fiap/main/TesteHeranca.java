package br.com.fiap.main;

import javax.swing.JOptionPane;

import br.com.fiap.beans.Boi;
import br.com.fiap.beans.Humano;

public class TesteHeranca {
	
	//Método Static
	
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
		
		
		//String nome, int idade, double peso, double velocidade, String rg
		Humano objHumano = new Humano(texto("Digite o nome do humano:"),
										inteiro("Diga a idade do humano:"),
										real("Informe o peso do humano:"),
										real("Diga a velocidade do humano:"),
										texto("Informe o RG do humano:"));
		
		//String nome, int idade, double peso, double velocidade, double tamanhoChifre
		Boi objBoi = new Boi(texto("Digite o nome do boi:"),
				inteiro("Diga a idade do boi:"),
				real("Informe o peso do boi:"),
				real("Diga a velocidade do boi:"),
				real("Diga o tamanho do chifre do boi:"));
		
		
		System.out.println("HUMANO");
		System.out.println("\nNome:" + objHumano.getNome() +
							"\nIdade:" + objHumano.getIdade() +
							"\nPeso:" + objHumano.getPeso() +
							"\nVelocidade:" + objHumano.getVelocidade() +
							"\nRG:" + objHumano.getRg());
		
		System.out.println("\nBOI");
		System.out.println("\nNome:" + objBoi.getNome() +
							"\nIdade:" + objBoi.getIdade() +
							"\nPeso:" + objBoi.getPeso() +
							"\nVelocidade:" + objBoi.getVelocidade() +
							"\nTamanho do chifre:" + objBoi.getTamanhoChifre());

	}

}
