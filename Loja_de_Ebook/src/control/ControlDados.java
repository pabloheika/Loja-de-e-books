package control;

import java.util.ArrayList;

import model.*;

public class ControlDados {
	private Dados d = new Dados();

	public ControlDados() {
		d.geraDados();
	}

	public Dados getD() {
		return d;
	}

	public void setD(Dados d) {
		this.d = d;
	}
	public ArrayList<Obra> getObras() {
		return d.getObras();
	}
	public ArrayList<Venda> getVendas() {
		return d.getVendas();
	}
	public ArrayList<Funcionario> getFuncionarios() {
		return d.getFuncionarios();
	}
	public ArrayList<Leitor> getLeitores() {
		return d.getLeitores();
	}
}
