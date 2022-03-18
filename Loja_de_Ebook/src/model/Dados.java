package model;

import java.util.ArrayList;

public class Dados {
	
	ArrayList<Obra> obras = new ArrayList<Obra>();
	
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
	

}
