package model;

public class Leitor extends Pessoa{
	
	//atributos privados
	private String dataNascimento;

	
	//gets e sets:
	public String getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	
	@Override
	//Metodo para ler o livro
	public String toString() {
		return "\nCPF: " + cpf + "\nNome: " + nome + "\nData de Nascimento: " + dataNascimento + "\nEmail: " + email
				+ "\nEmail";
	}
	
}
