package br.ufrn.imd.aulaservlet.dominio;

public class Usuario {
	private String login;
	private String senha;
	private String nome;
	
	public Usuario() {
		
	}
	public Usuario(String login) {
		super();
		this.login = login;
	}
	
	public Usuario(String login, String senha) {
		super();
		this.login = login;
		this.senha = senha;
	}
	
	public Usuario(String login, String senha, String nome) {
		super();
		this.login = login;
		this.senha = senha;
		this.nome = nome;
	}
	
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	
}
