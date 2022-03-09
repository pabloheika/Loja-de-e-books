package model;

//funcionario herda de pessoa
public class Funcionario extends Pessoa {
	
	//atributos de funcionario
	private String cargo;

	//gets e sets:
	public String getCargo() {
		return cargo;
	}
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	
	@Override
	//Metodo para exibir os dados do funcionario(menos senha)
	public String toString() {
		return "Cargo: " + cargo + "\nCPF: " + getCpf() + "\nNome: " + getNome() +"\nEmail: " + getEmail()
				+ "\nEmail";
	}
}
