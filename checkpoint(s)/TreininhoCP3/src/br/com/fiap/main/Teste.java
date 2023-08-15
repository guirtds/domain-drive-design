package br.com.fiap.main;

import javax.swing.JOptionPane;
import br.com.fiap.beans.Endereco;
import br.com.fiap.beans.PessoaFisica;
import br.com.fiap.beans.PessoaJuridica;

public class Teste {

	//método static
	
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
		
		
		//String name, String email, int idade, double renda, String razaoSocial, String cnpj
		PessoaJuridica objPessoaJuridica = new PessoaJuridica(texto("Digite o nome da empresa:"),
				texto("Digite o email da empresa:"),
				inteiro("Digite a idade da empresa:"),
				real("Digite a renda da empresa:"),
				texto("Diga a razão social da empresa:"),
				texto("Diga o CNPJ da empresa:"));
		
		//String name, String email, int idade, double renda, String rg, String cpf
		PessoaFisica objPessoaFisica = new PessoaFisica(texto("Digite o nome do cliente:"),
				texto("Digite o email do cliente:"),
				inteiro("Digite a idade do cliente:"),
				real("Digite a renda do cliente:"),
				texto("Digite o RG do cliente:"),
				texto("Digite o CPF do cliente:"));
		
		Endereco objEndereco = new Endereco();
		objPessoaJuridica.setEndereco(objEndereco);
		objPessoaFisica.setEndereco(objEndereco);
		
		
		
		System.out.println("INFORMAÇÕES DA EMPRESA");
		System.out.println("Nome da empresa:" + objPessoaJuridica.getName() +
				"\nCNPJ:" + objPessoaJuridica.getCnpj() +
				"\nLogradouro:" + objPessoaJuridica.getEndereco() +
				"\nIdentificador:" +objPessoaJuridica.identificador());
		
		System.out.println("INFORMAÇÕES PESSOA FÍSICA");
		System.out.println("Nome:" + objPessoaFisica.getName() +
				"\nRG:" + objPessoaFisica.getRg() +
				"\nIdentificador:" +objPessoaFisica.identificador());
		
		
	}

}	