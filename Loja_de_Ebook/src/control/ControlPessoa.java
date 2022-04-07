package control;

import java.util.ArrayList;

import model.*;

public class ControlPessoa {
	private ArrayList<Leitor> l;
	private ArrayList<Funcionario> f;

	public ControlPessoa(ControlDados d) {
		this.f = d.getFuncionarios();
		this.l = d.getLeitores();
	}

	public String[] getNomeLeitor() {
		String[] s = new String[l.size()];
		for (int i = 0; i < l.size(); i++) {
			s[i] = l.get(i).getNome();
		}

		return s;
	}

	public String[] getNomeFuncionario() {
		String[] s = new String[f.size()];
		for (int i = 0; i < f.size(); i++) {
			s[i] = f.get(i).getNome();
		}

		return s;
	}

}
