package br.com.fiap.main;

import javax.swing.JOptionPane;

import br.com.fiap.beans.Carro;
import br.com.fiap.beans.Colaborador;
import br.com.fiap.beans.Endereco;
import br.com.fiap.beans.Oficina;
import br.com.fiap.beans.ParteCarro;

public class ExecOficina {

	public static void main(String[] args) {
		
		Oficina objOficina = new Oficina(JOptionPane.showInputDialog("Digite o nome da oficina:"),
				JOptionPane.showInputDialog("Digite o CNPJ:"));
		
		
		Endereco objEndereco = new Endereco(JOptionPane.showInputDialog("Digite a rua:"),
				Integer.parseInt(JOptionPane.showInputDialog("Digite o número:")),
				JOptionPane.showInputDialog("Digite o CEP:"),
				JOptionPane.showInputDialog("Digite o bairro:"),
				JOptionPane.showInputDialog("Digite o município:"),
				JOptionPane.showInputDialog("Digite o estado:"));
		
		Carro objCarro = new Carro();
		ParteCarro objParteCarro = new ParteCarro();
		Colaborador objColaborador = new Colaborador();
		
		objOficina.setCarro(objCarro);
		objOficina.setEndereco(objEndereco);
		objOficina.setColaborador(objColaborador);
	
		//saídas
		
		System.out.println("Nome da oficina:" + objOficina.getNome() +
				"\nBairro:" + objOficina.getEndereco().getBairro());
	}

}
