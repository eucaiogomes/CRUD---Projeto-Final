package DTO;

public class Professor {
	
	Integer idProfessor;
	String nome;
	String email;
	String senha;
	
	
	
	public void cadastrar(String nomeP, String emailP, String senhaP) {
		this.nome = nomeP;
		this.email = emailP;
		this.senha = senhaP;
		
	}
	
	
	
	
	public Professor(String nome, String email, String senha) {
		
		this.nome = nome;
		this.email = email;
		this.senha = senha;
	}
	public Professor() {
		
	}
	public Professor(Integer idProfessor, String nome, String email, String senha) {
		super();
		this.idProfessor = idProfessor;
		this.nome = nome;
		this.email = email;
		this.senha = senha;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public Integer getIdProfessor() {
		return idProfessor;
	}
	public void setIdProfessor(Integer idProfessor) {
		this.idProfessor = idProfessor;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}

	
	
	
}
