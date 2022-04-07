package model;

/**
 * classe abstrata que contem dados de Pessoa
 * 
 * @author João Vítor
 * @author Pablo S. Costa
 * 
 */
public abstract class Pessoa {

	private long cpf;
	private String nome;
	private String email;
	private String senha;

	public long getCpf() {
		return cpf;
	}

	public void setCpf(long cpf) {
		this.cpf = cpf;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
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
}
