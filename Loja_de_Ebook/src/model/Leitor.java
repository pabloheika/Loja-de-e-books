package model;
/** 
 * classe que contem dados de Leitor
 * Classe filha de Pessoa
 * 
 * @author João Vítor
 * @author Pablo S. Costa
 * 
 */
public class Leitor extends Pessoa{
	
	private String dataNascimento;

	public String getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	
	@Override
	/**
	 * metodo para exibir os dados do leitor
	 */
	public String toString() {
		return "\nCPF: " + getCpf() + "\nNome: " + getNome() + "\nData de Nascimento: " + dataNascimento + "\nEmail: " + getEmail()
				 +"\n";
	}
	
}
