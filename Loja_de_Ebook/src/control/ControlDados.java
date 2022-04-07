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

	public boolean cadastraPessoa(String nome, long cpf, String email, String senha, String data, boolean op) {
		if (op) {
			d.cadastraLeitor(nome, cpf, email, senha, data);
			return true;
		} else {
			d.cadastraFuncionario(nome, cpf, email, senha, data);
			return true;
		}
	}

	public boolean checaCpf(long cpf, boolean op) {
		if (op) {
			for (int i = 0; i < d.getLeitores().size(); i++) {
				if (d.getLeitores().get(i).getCpf() == cpf) {
					return false;
				}
			}
			return true;
		} else {
			for (int i = 0; i < d.getFuncionarios().size(); i++) {
				if (d.getFuncionarios().get(i).getCpf() == cpf) {
					return false;
				}
			}
			return true;
		}
	}
}
