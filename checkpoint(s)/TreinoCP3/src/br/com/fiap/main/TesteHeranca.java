package br.com.fiap.main;

import javax.swing.JOptionPane;

import br.com.fiap.beans.Endereco;
import br.com.fiap.beans.PessoaFisica;
import br.com.fiap.beans.PessoaJuridica;

public class TesteHeranca {
	
	static String texto(String j) {
		return JOptionPane.showInputDialog(j);
	}
	
	static int inteiro (String j) {
		return Integer.parseInt(JOptionPane.showInputDialog(j));
	}
	
	static double real(String j) {
		return Double.parseDouble(JOptionPane.showInputDialog(j));
	}
	

	public static void main(String[] args) {
		
		//String nome, String email, int idade, double venda, String razaoSocial, String cnpj
		PessoaJuridica objPj = new PessoaJuridica(texto("Digite o nome da empresa:"),
				texto("Digite o email da empresa:"),
				inteiro("Diga o tempo de mercado da empresa:"),
				real("Informe o lucro mensal da empresa:"),
				texto("Digite a razão social da empresa:"),
				texto("Diga o CNPJ da empresa:"));
		
		//String nome, String email, int idade, double venda, String rg, String cpf
		PessoaFisica objPf = new PessoaFisica(texto("Digite o seu nome:"),
				texto("Digite o seu email:"),
				inteiro("Diga sua idade:"),
				real("Informe sua renda mensal:"),
				texto("Informe seu RG:"),
				texto("Diga seu CPF:"));
		
		//String logradouro
		Endereco objEndereco = new Endereco();
		
		
		//Saídas
		
		
		System.out.println("INFORMAÇÕES PESSOA JURÍDICA");
		System.out.println("Nome:" + objPj.getNome() +
				"\nE-mail:" + objPj.getEmail() +
				"\nIdade:" + objPj.getIdade() +
				"\nReceita Mensal:" + objPj.getVenda() +
				"\nCNPJ:" + objPj.getCnpj() +
				"\nIdentificador:" + objPj.identificador());
		
		System.out.println("\nINFORMAÇÕES PESSOA FÍSICA");
		System.out.println("Nome:" + objPf.getNome() +
				"\nE-mail:" + objPf.getEmail() +
				"\nIdade:" + objPf.getIdade() +
				"\nRenda:" + objPf.getVenda() +
				"\nRG:" + objPf.getRg() +
				"\nCPF:" + objPf.getCpf() +
				"\nIdentificador:" + objPf.identificador());
		
		System.out.println("Logradouro:" + objEndereco.getLogradouro());
		

	}

}
