package br.com.fiap.main;

import javax.swing.JOptionPane;

import br.com.fiap.beans.PessoaFisica;
import br.com.fiap.beans.PessoaJuridica;

public class Teste {
	
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
		
		//String name, String email, int age, double renda, String cpf
		PessoaFisica objPf = new PessoaFisica(texto("Informe o nome da pessoa física:"),
				texto("Digite o email da pessoa:"),
				inteiro("Diga a idade:"),
				real("Informe a renda:"),
				texto("Diga o CPF:"));
		
		//String name, String email, int age, double renda, String cnpj
		PessoaJuridica objPj = new PessoaJuridica(texto("Informe o nome da empresa:"),
				texto("Digite o email da empresa:"),
				inteiro("Diga a idade:"),
				real("Informe a renda:"),
				texto("Diga o CNPJ:"));
		
		System.out.println(objPf.identificador());
		
		System.out.println("Nome da pessoa fisica: " + objPf.getName() +
				"\nCPF: " + objPf.getCpf() +
				"\nTaxa, Pessoa Fisica: " + objPf.pagarTaxa());
		
		System.out.println(objPj.identificador());
		
		System.out.println("Nome da empresa: " + objPj.getName() +
				"\nCNPJ: " + objPj.getCnpj() +
				"\nTaxa, Pessoa Jurídica: " + objPj.pagarTaxa());

	}

}
