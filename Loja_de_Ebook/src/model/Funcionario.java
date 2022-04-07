package model;
/** 
 * classe que contem dados do Funcionario.
 * Classe filha de Pessoa
 * 
 * @author João Vítor
 * @author Pablo S. Costa
 * 
 */
public class Funcionario extends Pessoa {
	
	private String cargo;

	public String getCargo() {
		return cargo;
	}
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	
	@Override
	/**
	 * Metodo para exibir os dados do Funcionario
	 * 
	 */
	public String toString() {
		return "Cargo: " + cargo + "\nCPF: " + getCpf() + "\nNome: " + getNome() +"\nEmail: " + getEmail()
		+"\n";
	}
}
