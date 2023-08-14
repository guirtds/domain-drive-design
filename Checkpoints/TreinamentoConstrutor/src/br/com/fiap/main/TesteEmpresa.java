package br.com.fiap.main;

import javax.swing.JOptionPane;

import br.com.fiap.beans.Empresa;
import br.com.fiap.beans.Endereco;
import br.com.fiap.beans.Produto;

public class TesteEmpresa {

	public static void main(String[] args) {
		
		//String nome, String tipo, String cnpj
		Empresa objEmpresa = new Empresa(JOptionPane.showInputDialog("Digite o nome da empresa:"),
				JOptionPane.showInputDialog("Digite o tipo da empresa:"),
				JOptionPane.showInputDialog("Digite o CNPJ da empresa:"));
		
		//String logradouro, int numero, String cep, String bairro, String municipio, String estado
		Endereco objEndereco = new Endereco(JOptionPane.showInputDialog("Digite o logradouro:"),
				Integer.parseInt(JOptionPane.showInputDialog("Diga o número:")),
				JOptionPane.showInputDialog("Digite o CEP:"),
				JOptionPane.showInputDialog("Diga o bairro:"),
				JOptionPane.showInputDialog("Digite o município:"),
				JOptionPane.showInputDialog("Digite o estado:"));
		
		//String tipo, String marca, int quantidade, double valor
		Produto objProduto = new Produto(JOptionPane.showInputDialog("Digite o tipo de produto"),
				JOptionPane.showInputDialog("Digite a marca do produto:"),
				Integer.parseInt(JOptionPane.showInputDialog("Diga a quantidade:")),
				Double.parseDouble(JOptionPane.showInputDialog("Diga o valor do produto:")));
		
		objEmpresa.setEndereco(objEndereco);
		
		
		//saídas
		
		System.out.println("Nome da Empresa:" + objEmpresa.getNome() + 
						"\nTipo de Empresa:" + objEmpresa.getTipo() +
						"\nCNPJ da Empresa:" + objEmpresa.getCnpj() +
						"\nLogradouro:" + objEmpresa.getEndereco().getLogradouro() +
						"\nNúmero:" + objEmpresa.getEndereco().getNumero() +
						"\nCEP:" + objEmpresa.getEndereco().getCep() +
						"\nBairro:" + objEmpresa.getEndereco().getBairro() +
						"\nMunicípio:" + objEmpresa.getEndereco().getMunicipio() +
						"\nEstado:" + objEmpresa.getEndereco().getEstado() +
						"\nTipo de Produto:" + objProduto.getTipo() +
						"\nMarca do Produto:" + objProduto.getMarca() +
						"\nQuantidade:" + objProduto.getQuantidade() +
						"\nValor do Produto:" + objProduto.getValor());

	}

}
