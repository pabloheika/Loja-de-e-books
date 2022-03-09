package model;

public class Obra {
	
	//Atributos de obra
	private int id;
	private String titulo;
	private String editora;
	private int edicao;
	private String autor;
	private double valor;
	private String texto;
	
	//gets e sets:
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getEditora() {
		return editora;
	}
	public void setEditora(String editora) {
		this.editora = editora;
	}
	public int getEdicao() {
		return edicao;
	}
	public void setEdicao(int edicao) {
		this.edicao = edicao;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double d) {
		this.valor = d;
	}
	public String getTexto() {
		return texto;
	}
	public void setTexto(String texto) {
		this.texto = texto;
	}
	
	@Override
	//Metodo para ler o livro
	public String toString() {
		return "========== " + titulo + " ==========\n Editora " + editora + "\n " + edicao +"ª edição \n Autor " + autor
				+ "\n\n\n" + texto ;
	}	
	

}
