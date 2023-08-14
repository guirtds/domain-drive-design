package br.com.fiap.main;

import javax.swing.JOptionPane;

import br.com.fiap.beans.Colaborador;
import br.com.fiap.beans.Endereco;

public class TesteColaborador {
	
	//método static
	
	static String texto(String j) {
		return JOptionPane.showInputDialog(j);
	}
	
	static int inteiro(String j) {
		return Integer.parseInt(JOptionPane.showInputDialog(j));
	}
	
	static double decimal(String j) {
		return Double.parseDouble(JOptionPane.showInputDialog(j));
	}

	public static void main(String[] args) {
		
		//String nome, String cargo, double valorHora, double qtHoras, double percentual
		Colaborador objColaborador = new Colaborador(texto("Digite o nome do colaborador:"),
				texto("Diga o cargo do colaborador:"),
				decimal("Informe o valor recebido por hora:"),
				decimal("Diga a quantidade de horas trabalhadas:"),
				decimal("Digite o percentual de imposto de renda:"));
		
		//String rua, int numero, String cep
		Endereco objEndereco = new Endereco(texto("Digite o logradouro do colaborador:"),
				inteiro("Digite o número da residência:"),
				texto("Informe o CEP:"));
		
		objColaborador.setEndereco(objEndereco);
		
		//saída
		
		System.out.println("Nome do colaborador: " + objColaborador.getNome() +
				"\nCargo do colaborador: " + objColaborador.getCargo() +
				"\nValor por hora: " + objColaborador.getValorHora() +
				"\nQuantidade de horas trabalhadas: " + objColaborador.getQtHoras() +
				"\nPercentual de IR: " + objColaborador.getPercentual() +
				"\nRua do colaborador: " + objColaborador.getEndereco().getRua() +
				"\nNúmero residência: " + objColaborador.getEndereco().getNumero() +
				"\nCEP do colaborador: " + objColaborador.getEndereco().getCep());
	
		System.out.println("\nSalário bruto: " + objColaborador.calcularSalario());
	
		System.out.println("\nCáculo de imposto de renda: " + objColaborador.calcularIr());
		
		System.out.println("\nInformação: " + objColaborador.informacaoSalario());
		
		System.out.println("\nSalário líquido: " + objColaborador.salarioLiquido());
	}

}
