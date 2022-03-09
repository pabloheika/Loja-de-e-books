package model;

public class teste {
	//inicia objetos
	static Obra o1 = new Obra();
	
	static Leitor leitor1 = new Leitor();
	static Leitor leitor2 = new Leitor();
	
	static Funcionario func1 = new Funcionario();
	static Funcionario func2 = new Funcionario();
	
	public static void main(String[] args) {
		//atribui os dados dos objetos
		o1.setAutor("");
		o1.setEdicao(1);
		o1.setEditora("Rocco");
		o1.setId(0);
		o1.setTexto("");
		o1.setTitulo("");
		o1.setValor(2.5);
		
		leitor1.setCpf(74509109008);
		leitor1.setDataNascimento("12 de janeiro de 1964");
		leitor1.setEmail("Lucasmotta@gmail.com");
		leitor1.setNome("Lucas Motta Pereira");
		leitor1.setSenha("patinhofeio123");
		
		leitor2.setCpf(21400960029);
		leitor2.setDataNascimento("20 de agosto de 1977");
		leitor2.setEmail("joaovictor@hotmail.com");
		leitor2.setNome("Paulo Sousa Ribeiro");
		leitor2.setSenha("19572007");
		
		func1.setCargo("Adiministrador");
		func1.setCpf(37965331080);
		func1.setEmail("felipao@aol.com");
		func1.setNome("Felipe Cardoso Silva");
		func1.setSenha("flamengo2010");
		
		func1.setCargo("Dev");
		func1.setCpf(44068637024);
		func1.setEmail("luisrocha@outlook.com");
		func1.setNome("Luis Rocha Castro");
		func1.setSenha("Luisrochasenha1234");
		
	}

}
