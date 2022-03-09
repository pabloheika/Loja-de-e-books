package model;

//leitor herda de pessoa
public class Leitor extends Pessoa{
	
	//atributos de leitor
	private String dataNascimento;

	
	//gets e sets:
	public String getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	
	@Override
	//Metodo para exibir os dados do leitor(menos a senha)
	public String toString() {
		return "\nCPF: " + getCpf() + "\nNome: " + getNome() + "\nData de Nascimento: " + dataNascimento + "\nEmail: " + getEmail()
				+ "\nEmail";
	}
	
}
