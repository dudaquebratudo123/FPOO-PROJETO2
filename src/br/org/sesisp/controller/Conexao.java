package br.org.sesisp.controller;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conexao {
	//Conectando o banco de dados
	private static final String USERNAME = "root";
	private static final String PASSWORD = "";
	private static final String DATABASE_URL = "jdbc:mysql://localhost:3306/viagem";
	
	//metodo criando conexão
	public static Connection criandoConexao() throws Exception{
		Class.forName("com.mysql.jdbc.Driver");
		Connection conexao = (Connection) DriverManager.getConnection(DATABASE_URL, USERNAME, PASSWORD);
		return conexao;
	}
	
	//verificar se está conectado
	public static void main(String[]args) throws Exception{
		Connection con = criandoConexao();
		if(con !=  null) {
			System.out.println("Conectado!");
		}
		con.close();
	}

}
