package model;

public class Venda {
	
	//atributos
	private int id;
	private String metodoPagamento;
	private Leitor leitor;
	private Obra obra;
	
	public Venda (int id, String metodoPagamento, Leitor leitor, Obra obra) {
		this.id = id;
		this.metodoPagamento = metodoPagamento;
		this.leitor = leitor;
		this.obra = obra;
	}
	
	//gets e sets:
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getMetodoPagamento() {
		return metodoPagamento;
	}
	public void setMetodoPagamento(String metodoPagamento) {
		this.metodoPagamento = metodoPagamento;
	}

	public Leitor getLeitor() {
		return leitor;
	}

	public void setLeitor(Leitor leitor) {
		this.leitor = leitor;
	}

	public Obra getObra() {
		return obra;
	}

	public void setObra(Obra obra) {
		this.obra = obra;
	}
	
}
