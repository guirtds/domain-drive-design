package br.com.fiap.main;

import javax.swing.JOptionPane;

import br.com.fiap.beans.Endereco;
import br.com.fiap.beans.PessoaFisica;
import br.com.fiap.beans.PessoaJuridica;

public class TesteHeranca {
	
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
		
		//String nome, String email, int idade, String rg, String cpf
		PessoaFisica objPf = new PessoaFisica(texto("Diga o nome da pessoa:"),
				texto("Informe o email da pessoa:"),
				inteiro("Digite a idade da pessoa:"),
				texto("Informe o RG da pessoa:"),
				texto("Infrome o CPF da pessoa:"));
		
		//String nome, String email, int idade, String razaoSocial, String cnpj
		PessoaJuridica objPj = new PessoaJuridica(texto("Diga o nome da empresa:"),
				texto("Informe o email da empresa:"),
				inteiro("Digite o tempo de empresa:"),
				texto("Razão social:"),
				texto("CNPJ:"));
		
		//String logradouro, int numero
		Endereco objEndereco = new Endereco(texto("Logradouro:"),
				inteiro("Número:"));
		
		
		//Saídas
		
		System.out.println("INFORMAÇÕES PJ");
		System.out.println("\nNome:" + objPj.getNome() +
				"\nEmail:" + objPj.getEmail() +
				"\nIdade:" + objPj.getIdade() +
				"\nRazão Social:" + objPj.getRazaoSocial() +
				"\nCNPJ:" + objPj.getCnpj() +
				"\nIdentificador:" + objPj.identificador() +
				"\nTaxa:" + objPj.taxa());
		
		System.out.println("\nINFORMAÇÕES PF");
		System.out.println("\nNome:" + objPf.getNome() +
				"\nEmail:" + objPf.getEmail() +
				"\nIdade:" + objPf.getIdade() +
				"\nRG:" + objPf.getRg() +
				"\nCPF:" + objPf.getCpf() +
				"\nIdentificador:" + objPf.identificador() +
				"\nTaxa:" + objPf.taxa());
		
		System.out.println("\nLogradouro:" + objEndereco.getLogradouro() +
				"\nNúmero:" + objEndereco.getNumero());
		
	}

}
