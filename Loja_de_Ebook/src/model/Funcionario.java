package model;

public class Funcionario extends Pessoa {
	
	//atributos
	private String cargo;
	private long salario;

	
	//gets e sets:
	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	
	public long getSalario() {
		return salario;
	}

	public void setSalario(long salario) {
		this.salario = salario;
	}

	
}
