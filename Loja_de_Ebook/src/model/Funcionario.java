package model;

public class Funcionario extends Pessoa {
	
	//atributos
	private String cargo;
	private double salario;

	
	//gets e sets:
	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	
	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	
}
