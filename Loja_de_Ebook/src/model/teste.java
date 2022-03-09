package model;

public class teste {
	//inicia objetos
	static Obra o1 = new Obra();
	static Obra o2 = new Obra();
	
	static Leitor leitor1 = new Leitor();
	static Leitor leitor2 = new Leitor();
	
	static Funcionario func1 = new Funcionario();
	static Funcionario func2 = new Funcionario();
	

	public static void main(String[] args) {
		//atribui os dados dos objetos
		o1.setAutor("Irm�os Grimm");
		o1.setEdicao(1);
		o1.setEditora("Rocco");
		o1.setId(0);
		o1.setTexto("Chapeuzinho vermelho era uma linda menina que morava em uma bela casa com a sua m�e.\n"
				+ " A menina sempre usava uma capa e um pequeno chap�u na cor vermelha.\r\n"
				+ "\r\n"
				+ "Um belo dia, sua m�e pediu para que Chapeuzinho Vermelho fosse levar uma cesta de doces\n "
				+ "para sua vov�:\r\n"
				+ "\r\n"
				+ "� Chapeuzinho, por favor, leve esta linda cesta de doces para sua av�, mas evite o caminho\n"
				+ " da floresta, pois ele � muito perigoso. Escolha o caminho do bosque e n�o fale com estranhos.\r\n"
				+ "\r\n"
				+ "Chapeuzinho amava sua av� e saiu muito rapidamente de casa, cantando de alegria. Ela queria\n"
				+ " fazer uma surpresa para sua av� e come�ou a colher as flores que encontrava no caminho.\r\n"
				+ "\r\n"
				+ "A menina estava distra�da com as flores, quando deu de cara com o lobo mau. Chapeuzinho n�o\n"
				+ " sabia que aquele era o lobo malvado, por isso n�o se assustou e nem sentiu medo.\r\n"
				+ "\r\n"
				+ "� Bom dia, Chapeuzinho Vermelho.\r\n"
				+ "\r\n"
				+ "� Bom dia.\r\n"
				+ "\r\n"
				+ "� Onde voc� est� indo assim t�o cedinho?\r\n"
				+ "\r\n"
				+ "� Vou visitar minha vovozinha, que est� muito doente.\r\n"
				+ "\r\n"
				+ "O lobo esperto disse a ela:\r\n"
				+ "\r\n"
				+ "� Por que voc� n�o vai pela floresta? A floresta � o caminho mais r�pido para a casa da sua av�.\r\n"
				+ "\r\n"
				+ "Ela ficou em d�vida, porque n�o gostava de desobedecer sua m�e, mas resolveu seguir o conselho\n"
				+ " do lobo. Enquanto chapeuzinho seguia pelo caminho da floresta, o lobo rapidamente seguiu pelo \n"
				+ "caminho bosque, cantando e correndo. O lobo chegou na casa da vovozinha e bateu na porta:\r\n"
				+ "\r\n"
				+ "� Quem est� a�? � Perguntou a velhinha.\r\n"
				+ "\r\n"
				+ "O lobo respondeu, disfar�ando a voz:\r\n"
				+ "\r\n"
				+ "� Sou eu, Chapeuzinho Vermelho.\r\n"
				+ "\r\n"
				+ "� Entre minha querida, a porta est� aberta.\r\n"
				+ "\r\n"
				+ "O lobo, que era muito r�pido, foi entrando e de uma s� vez engoliu a vovozinha. Depois vestiu as \n"
				+ " roupas dela e ficou a espera de Chapeuzinho Vermelho. Chegando na casa da vov�, a menina encontrou \n"
				+ "o lobo e perguntou:\r\n"
				+ "\r\n"
				+ "� Vov�! Porque suas orelhas est�o t�o grandes?\r\n"
				+ "\r\n"
				+ "� � para te ouvir melhor.\r\n"
				+ "\r\n"
				+ "� Vov�! Para que esses olhos t�o grandes?\r\n"
				+ "\r\n"
				+ "� � para te ver melhor.\r\n"
				+ "\r\n"
				+ "� Credo, vov�, porque a senhora est� com essa boca t�o grande?\r\n"
				+ "\r\n"
				+ "� � para te comer! � respondeu o lobo.\r\n"
				+ "\r\n"
				+ "Dizendo isso, o lobo come�ou a correr atr�s de Chapeuzinho. Depois de algum tempo, ele trope�ou \n"
				+ "e caiu no ch�o. Enquanto isso, a menina se escondeu dentro de um arm�rio. O lobo resolveu dar uma \n"
				+ " cochilada e come�ou a roncar. Um ca�ador que passava escutou:\r\n"
				+ "\r\n"
				+ "� Que ronco esquisito � este?\r\n"
				+ "\r\n"
				+ "Ele entrou e encontrou o lobo mal:\r\n"
				+ "\r\n"
				+ "� Ah! � voc� que est� a� seu malvado!\r\n"
				+ "\r\n"
				+ "Escutando isso, Chapeuzinho apareceu e contou toda a hist�ria para o ca�ador. Aproveitando que o \n"
				+ "lobo estava dormindo, cortaram a sua a barriga e tiraram a vovozinha de dentro. As duas se abra�aram \n"
				+ " muito felizes.\r\n"
				+ "\r\n"
				+ "� E agora o que faremos com esse malvado?\r\n"
				+ "\r\n"
				+ "Os tr�s resolveram encher a barriga do lobo de pedras. Quando o lobo acordou, tentou fugir, mas ele \n"
				+ " caiu e nunca mais levantou.\r\n"
				+ "\r\n"
				+ "Todos ficaram aliviados e felizes. O ca�ador foi embora e as duas foram se sentar na varanda e \n"
				+ "saborear os doces. Chapeuzinho prometeu nunca mais desobedecer a sua m�ezinha.\n");
		o1.setTitulo("Chapeuzinho vermelho");
		o1.setValor(2.5);
		
		o2.setAutor("Joseph Jacobs");
		o2.setEdicao(1);
		o2.setEditora("Expresso Zahar");
		o2.setId(1);
		o2.setTexto("Era uma vez uma feliz fam�lia de porquinhos que tinha tr�s filhos. Os porquinhos foram \n"
				+ "crescendo e os pais notavam que estavam muito dependentes. N�o ajudavam no trabalho de casa \n"
				+ "nem se esfor�avam em nada. Ent�o um dia, eles se reuniram e decidiram que os porquinhos, que \n"
				+ "j� estavam bem crescidos, fossem morar sozinhos. Os pais deram um pouco de dinheiro a cada um,\n"
				+ " alguns bons conselhos. Os tr�s porquinhos partiram para o bosque em busca de um bom lugar para \n"
				+ "construir, cada um, a sua casa.\r\n"
				+ "\r\n"
				+ "O primeiro porquinho, que era o mais pregui�oso de todos, foi logo optando por construir uma casa \n"
				+ "r�pida e que n�o necessitasse muito esfor�o. E construiu uma casa de palha, embora os seus irm�os \n"
				+ " lhe tenham dito que n�o era segura.\r\n"
				+ "\r\n"
				+ "O segundo porquinho, que era menos pregui�oso que o primeiro mas que tampouco gostava de trabalhar, \n"
				+ "construiu uma casa de madeira, porque pensava que era mais pr�tica e resistente.\r\n"
				+ "\r\n"
				+ "O terceiro porquinho, o mais sensato de todos e mais trabalhador, preferiu construir uma casa de \n"
				+ "tijolos. Demorou mais para constru�-la mas depois de tr�s dias de intenso trabalho a casa estava \n"
				+ "prontinha.\r\n"
				+ "\r\n"
				+ "Os tr�s porquinhos ouviram falar que um perigoso lobo rondava pelo bosque. E n�o demorou muito para \n"
				+ " que aparecesse pelas suas casas, em busca de uma boa carne de porco para comer.\r\n"
				+ "\r\n"
				+ "O lobo ent�o foi bater na porta da casa do primeiro porquinho. O porquinho, tentando intimid�-lo \n"
				+ " disse:\r\n"
				+ "\r\n"
				+ "� V� embora seu lobo. Aqui voc� n�o vai entrar.\r\n"
				+ "\r\n"
				+ "O lobo insistiu e disse:\r\n"
				+ "\r\n"
				+ "� Abra logo esta porta ou soprarei e soprarei e a sua casa destruirei.\r\n"
				+ "\r\n"
				+ "Vendo que o porquinho n�o abria a porta da casa, o lobo come�ou a soprar e soprar t�o forte que a \n"
				+ "casa de palha voou pelos ares. O porquinho, desesperado, acabou correndo em dire��o � casa de madeira\n"
				+ " do seu irm�o. O lobo correu atr�s dele, mas n�o conseguiu alcan��-lo.\r\n"
				+ "\r\n"
				+ "O lobo ent�o foi bater na porta da casa do segundo porquinho. O porquinho, tentando intimid�-lo disse:\r\n"
				+ "\r\n"
				+ "� V� embora seu lobo. Na minha casa de madeira voc� n�o vai conseguir entrar.\r\n"
				+ "\r\n"
				+ "O lobo insistiu e disse:\r\n"
				+ "\r\n"
				+ "� Abram logo esta porta ou soprarei e soprarei e esta casa destruirei.\r\n"
				+ "\r\n"
				+ "Vendo que os porquinhos n�o abriam a porta da casa, o lobo come�ou a soprar e soprar t�o forte que\n"
				+ " a casa de madeira caiu e ficou em peda�os. Os porquinhos, desesperados, acabaram correndo em dire��o \n"
				+ " � casa de tijolo e cimento do outro irm�o. O lobo correu atr�s deles, mas n�o conseguiu alcan��-los.\r\n"
				+ "\r\n"
				+ "O lobo ent�o foi bater na porta da casa do terceiro porquinho. Os porquinhos tentando intimid�-lo cantaram:\r\n"
				+ "\r\n"
				+ "Quem tem medo do lobo mau\r\n"
				+ "Lobo mau, lobo mau?!\r\n"
				+ "Quem tem medo do lobo mau?!\r\n"
				+ "Ele � um cara legal!\r\n"
				+ "\r\n"
				+ "O lobo ficava cada vez mais furioso e gritou:\r\n"
				+ "\r\n"
				+ "� Abram a porta, j�!!!\r\n"
				+ "\r\n"
				+ "E os porquinhos responderam:\r\n"
				+ "\r\n"
				+ "� V� embora seu lobo. Voc� n�o conseguir� derrubar esta casa porque est� feita com tijolo e cimento.\r\n"
				+ "\r\n"
				+ "O lobo insistiu e disse:\r\n"
				+ "\r\n"
				+ "� Abram logo esta porta ou soprarei e soprarei e esta casa destruirei.\r\n"
				+ "\r\n"
				+ "Vendo que os porquinhos n�o abriam a porta da casa, o lobo come�ou a soprar, soprar, soprar, \n"
				+ " e a casa continuava inteira no seu lugar. O lobo ficou t�o cansado que acabou sentando-se ao p� \n"
				+ " da porta para descansar. Enquanto isso, pensou e pensou em como entrar na casa e teve uma id�ia.\n"
				+ " Foi buscar uma escada para subir ao telhado da casa e entrar na casa pela chamin�. Os porquinhos, \n"
				+ " vendo o que tramava o lobo, reagiram logo. Puseram a ferver um balde enorme de �gua, e o colocou no \n"
				+ " final da chamin� e esperaram.\r\n"
				+ "\r\n"
				+ "Quando o lobo entrou na chamin�, caiu bem dentro do balde cheio de �gua fervendo.\r\n"
				+ "\r\n"
				+ "� Uai, uai, Uaiiiiii!!!!!!!! Gritou o lobo, saindo correndo ao lago para aliviar as suas queimaduras \n"
				+ " e assustado, nunca mais voltou a molestar os porquinhos.\r\n"
				+ "\r\n"
				+ "E quanto aos porquinhos, aprenderam a li��o de que tudo o que � feito com esfor�o tem melhor \n"
				+ "resultado. Os tr�s porquinhos decidiram morar juntos e todos viveram felizes e harmonia.");
		o2.setTitulo("Os tr�s porquinos");
		o2.setValor(5.5);
		
		leitor1.setCpf(Long.parseLong("74509109008"));
		leitor1.setDataNascimento("12/01/1964");
		leitor1.setEmail("Lucasmotta@gmail.com");
		leitor1.setNome("Lucas Motta Pereira");
		leitor1.setSenha("patinhofeio123");
		
		leitor2.setCpf(Long.parseLong("21400960029"));
		leitor2.setDataNascimento("20/08/1977");
		leitor2.setEmail("joaovictor@hotmail.com");
		leitor2.setNome("Paulo Sousa Ribeiro");
		leitor2.setSenha("19572007");
		
		func1.setCargo("Adiministrador");
		func1.setCpf(Long.parseLong("37965331080"));
		func1.setEmail("felipao@aol.com");
		func1.setNome("Felipe Cardoso Silva");
		func1.setSenha("flamengo2010");
		
		func2.setCargo("Dev");
		func2.setCpf(Long.parseLong("44068637020"));
		func2.setEmail("luisrocha@outlook.com");
		func2.setNome("Luis Rocha Castro");
		func2.setSenha("Luisrochasenha1234");
		
		Venda ven1 = new Venda(0,"credito",leitor2, o1);
		Venda ven2 = new Venda(1,"credito",leitor1, o2);
		
		System.out.println(o1.toString());
		System.out.println(o2.toString());
		System.out.println(func2.toString());
		System.out.println(leitor1.toString());
		System.out.println(leitor2.toString());
		
	}

}
