package br.org.sesisp.dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import br.org.sesisp.controller.Conexao;
import br.org.sesisp.model.Passeio;

public class CrudDAO {
	//CREATE 
	public void create(Passeio passeio) {
		String sql = "INSERT INTO passeios(nome, regiao, estado, preco) VALUES (?,?,?,?)";
		//linka com o banco
		Connection conn = null; 
		PreparedStatement p = null;
		try {
			conn = Conexao.criandoConexao(); //conecta
			p = (PreparedStatement) conn.prepareStatement(sql); //cast
			p.setString(1, passeio.getNome());
			p.setString(2, passeio.getRegiao());
			p.setString(3, passeio.getEstado());
			p.setFloat(4, passeio.getPreco());
			p.execute(); // nao vai pro banco se nao coloca isso
		}catch(Exception e) {
			System.out.println("Erro ao inserir os dados! \nERRO: " + e);
		}finally{
			try {
				if(p != null) {
					p.close();
				}
			}catch(Exception e) {
				e.printStackTrace();
			}
		}//fim finally
	}//FIM CREATE
	
	//UPDATE
	public void update(Passeio passeio) {
		String sql = "UPDATE passeios SET nome = ?, regiao = ?, estado = ?, preco = ? WHERE id = ?";
		//linka com o banco
		Connection conn = null;
		PreparedStatement p = null;
		try {
			conn = Conexao.criandoConexao(); //conecta
			p = (PreparedStatement) conn.prepareStatement(sql); //cast
			p.setString(1, passeio.getNome());
			p.setString(2, passeio.getRegiao());
			p.setString(3, passeio.getEstado());
			p.setFloat(4, passeio.getPreco());
			p.setInt(5, passeio.getId());
			p.execute(); //"executa inst para gravar" dados no banco
			System.out.println("Dados atualizados com sucesso!");
		}catch(Exception e) {
			JOptionPane.showMessageDialog(null, "Erro ao editar os dados! \nERRO: " + e);
		}finally {
			try {
				if(p != null) {
					p.close();
				}
			}catch(Exception e) {
				e.printStackTrace();
			}
		}//fim finally
	}//FIM UPDATE
	
	//READ
	public List<Passeio> read(){
		String sql = "SELECT * FROM passeios";
		List<Passeio> passeios = new ArrayList<Passeio>();
		//linka com o banco
		Connection conn = null;
		PreparedStatement p = null;
		ResultSet resultado = null;
		try {
			conn = Conexao.criandoConexao(); //conecta
			p = (PreparedStatement) conn.prepareStatement(sql);//cast
			resultado = p.executeQuery();//mostra os dados da consulta sql
			while(resultado.next()) {
				Passeio ver_passeio = new Passeio();
				//reculperar atributos
				ver_passeio.setId(resultado.getInt("id"));
				ver_passeio.setNome(resultado.getString ("nome"));
				ver_passeio.setRegiao(resultado.getString("regiao"));
				ver_passeio.setEstado(resultado.getString("estado"));
				ver_passeio.setPreco(resultado.getFloat("preco"));
				//adicionar na lista
				passeios.add(ver_passeio);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(p != null) {
					p.close();
				}
			}catch(Exception e) {
				e.printStackTrace();
			}
		}//fim finally
		return passeios;
	}//FIM READ
	
	//DELETE
	public boolean delete(int id) {
		String sql = "DELETE FROM passeios WHERE id = ?";
		//linka com o banco
		Connection conn = null;
		PreparedStatement p = null;
		try {
			conn = Conexao.criandoConexao(); //conecta
			p = (PreparedStatement) conn.prepareStatement(sql);//cast
			p.setInt(1, id);
			p.execute();
			JOptionPane.showMessageDialog(null, "Dados excluidos com sucesso!");
			System.out.println("Dados excluidos com sucesso!");
		}catch(Exception e) {
			JOptionPane.showMessageDialog(null, "Erro ao excluir os dados! \nERRO: " + e);
		}finally {
			try {
				if(p != null) {
					p.close();
				}
			}catch(Exception e) {
				e.printStackTrace();
			}
		}//fim finally
		return false;
	}//fim DELETE
	
	
}
