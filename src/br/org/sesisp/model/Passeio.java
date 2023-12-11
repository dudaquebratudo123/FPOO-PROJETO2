package br.org.sesisp.model;

public class Passeio {
	//atributos
	private int id;
	private String nome;
	private String regiao;
	private String estado;
	private float preco;
	
	//construtores
	public Passeio() {
		
	}
	public Passeio(int id, String nome, String regiao, String estado, float preco) {
		this.setId(id);
		this.setNome(nome);
		this.setRegiao(regiao);
		this.setEstado(estado);
		this.setPreco(preco);
	}
		
	//getters e setters
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getRegiao() {
		return regiao;
	}
	public void setRegiao(String regiao) {
		this.regiao = regiao;
	}
	
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	
	public float getPreco() {
		return preco;
	}
	public void setPreco(float preco) {
		this.preco = preco;
	}

	
}
