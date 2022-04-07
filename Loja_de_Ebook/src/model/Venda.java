package model;

/**
 * classe que contem dados de Venda
 * 
 * @author João Vítor
 * @author Pablo S. Costa
 * 
 */
public class Venda {

	private int id;
	private String metodoPagamento;
	private Leitor leitor;
	private Obra obra;

	/**
	 * metodo construtor de Venda, cria uma nova venda
	 * 
	 * @param id              um numero que identifica a venda
	 * @param metodoPagamento o metodo de pagamento do cliente
	 * @param leitor          o cliente em si
	 * @param obra            a obra que esta sendo vendida
	 */

	public Venda(int id, String metodoPagamento, Leitor leitor, Obra obra) {
		this.id = id;
		this.metodoPagamento = metodoPagamento;
		this.leitor = leitor;
		this.obra = obra;
	}

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

	@Override
	/**
	 * metodo para exibir a venda
	 */
	public String toString() {
		return "id da venda: " + id + "\nMetodo de Pagamento: " + metodoPagamento + "\nCPF: " + leitor.getCpf()
				+ "\nNome: " + leitor.getNome() + "\nID da Obra: " + obra.getId() + "\nObra: " + obra.getTitulo()
				+ "\n";
	}
}
