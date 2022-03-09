package model;

public class Funcionario extends Pessoa {
	
	//atributos
	private String cargo;

	//gets e sets:
	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	@Override
	//Metodo para ler o livro
	public String toString() {
		return "Cargo: " + cargo + "\nCPF: " + getCpf() + "\nNome: " + getNome() +"\nEmail: " + getEmail()
				+ "\nEmail";
	}
}
