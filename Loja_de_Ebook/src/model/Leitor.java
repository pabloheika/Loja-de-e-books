package model;

public class Leitor extends Pessoa{
	
	//atributos privados
	private String dataNascimento;
	private String userName;

	
	//gets e sets:
	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	public String getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	
}
