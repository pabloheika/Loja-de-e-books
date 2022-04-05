package model;

import java.util.ArrayList;

public class Dados {
	
	ArrayList<Obra> obras = new ArrayList<Obra>();
	ArrayList<Venda> vendas = new ArrayList<Venda>();
	ArrayList<Leitor> leitores = new ArrayList<Leitor>();
	ArrayList<Funcionario> funcionarios = new ArrayList<Funcionario>();
	
	public ArrayList<Obra> getObras() {
		return obras;
	}
	public void setObras(ArrayList<Obra> obras) {
		this.obras = obras;
	}
	public ArrayList<Venda> getVendas() {
		return vendas;
	}
	public void setVendas(ArrayList<Venda> vendas) {
		this.vendas = vendas;
	}
	public ArrayList<Leitor> getLeitores() {
		return leitores;
	}
	public void setLeitores(ArrayList<Leitor> leitores) {
		this.leitores = leitores;
	}
	public ArrayList<Funcionario> getFuncionarios() {
		return funcionarios;
	}
	public void setFuncionarios(ArrayList<Funcionario> funcionarios) {
		this.funcionarios = funcionarios;
	}
	public Obra editaObra(Obra o, String autor, int edicao, String editora, int id, String texto, String titulo, double valor) {
		o.setAutor(autor);
		o.setEdicao(edicao);
		o.setEditora(editora);
		o.setId(id);
		o.setTexto(texto);
		o.setTitulo(titulo);
		o.setValor(valor);		
		return o;		
	}
	public void addObra(Obra o) {
		obras.add(o);		
	}
	public void addVenda(Venda v ) {
		vendas.add(v);		
	}
	public void addFuncionario(Funcionario f ) {
		funcionarios.add(f);		
	}
	public void addLeitor(Leitor l) {
		leitores.add(l);		
	}
	public void removeObra(Obra o) {
		obras.remove(o);		
	}
	public void removeLeitor(Leitor l) {
		leitores.remove(l);		
	}
	public void removeFuncionario(Funcionario f) {
		funcionarios.remove(f);		
	}
	public void removeVenda(Venda v) {
		vendas.remove(v);		
	}

}
