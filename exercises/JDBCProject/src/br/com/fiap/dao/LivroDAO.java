package br.com.fiap.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import br.com.fiap.beans.Livro;
import br.com.fiap.conexoes.ConexaoFactory;

public class LivroDAO {
	
	public Connection minhaConexao;
	
	// metodo construtor
	
	public LivroDAO() throws ClassNotFoundException, SQLException {
		super();
		this.minhaConexao = new ConexaoFactory().conexao();
	}
	
	// insert
	
	public String inserir(Livro livro) throws SQLException {
		
		PreparedStatement stmt = minhaConexao.prepareStatement
				("insert into T_FIAP_LIVRO values (?, ?, ?, ?)");
		stmt.setInt(1, livro.getCodigo());
		stmt.setString(2, livro.getTitulo());
		stmt.setString(3, livro.getAutor());
		stmt.setDouble(4, livro.getValor());
		stmt.execute();
		stmt.close();
		
		return "Cadastrado com sucesso";
	}
	
	// delete
	
	public String deletar(Livro livro) throws SQLException {
		
		PreparedStatement stmt = minhaConexao.prepareStatement
				("delete from T_FIAP_LIVRO where codigo_livro = ?");
		stmt.setInt(1, livro.getCodigo());
		stmt.executeUpdate();
		stmt.close();
		
		return "Deletado com sucesso";
	}
	
}