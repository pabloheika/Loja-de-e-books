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
	
	public boolean validaLogin(boolean tipo, long cpf, String senha) {
		if(tipo) {
			for (int i = 0; i < l.size(); i++) {
				if(l.get(i).getCpf() == cpf && senha.equals(l.get(i).getSenha())) {
					return true;
				}
			}
			
		}else {
			for (int i = 0; i < f.size(); i++) {
				if(f.get(i).getCpf() == cpf && senha.equals(f.get(i).getSenha())) {
					return true;
				}
			}
		}
		
		return false;
	}
	public Leitor buscaLeitor(long cpf){
		System.out.print("entrou" );
		for (int i = 0; i < l.size(); i++) {
			System.out.print("checando" );
			if(l.get(i).getCpf() == cpf) {
				System.out.print("Pegou" );
				return l.get(i);
			}
		}System.out.print("foise" );
		return l.get(0);
	}
	public Funcionario pegaFuncionario(long cpf){
		for (int i = 0; i < f.size(); i++) {
			if(f.get(i).getCpf() == cpf) {
				return f.get(i);
			}
		}
		return null;
	}

}
