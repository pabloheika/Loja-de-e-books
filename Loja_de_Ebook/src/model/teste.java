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
		o1.setAutor("Irmãos Grimm");
		o1.setEdicao(1);
		o1.setEditora("Rocco");
		o1.setId(0);
		o1.setTexto("Chapeuzinho vermelho era uma linda menina que morava em uma bela casa com a sua mãe.\n"
				+ " A menina sempre usava uma capa e um pequeno chapéu na cor vermelha.\r\n"
				+ "\r\n"
				+ "Um belo dia, sua mãe pediu para que Chapeuzinho Vermelho fosse levar uma cesta de doces\n "
				+ "para sua vovó:\r\n"
				+ "\r\n"
				+ "– Chapeuzinho, por favor, leve esta linda cesta de doces para sua avó, mas evite o caminho\n"
				+ " da floresta, pois ele é muito perigoso. Escolha o caminho do bosque e não fale com estranhos.\r\n"
				+ "\r\n"
				+ "Chapeuzinho amava sua avó e saiu muito rapidamente de casa, cantando de alegria. Ela queria\n"
				+ " fazer uma surpresa para sua avó e começou a colher as flores que encontrava no caminho.\r\n"
				+ "\r\n"
				+ "A menina estava distraída com as flores, quando deu de cara com o lobo mau. Chapeuzinho não\n"
				+ " sabia que aquele era o lobo malvado, por isso não se assustou e nem sentiu medo.\r\n"
				+ "\r\n"
				+ "– Bom dia, Chapeuzinho Vermelho.\r\n"
				+ "\r\n"
				+ "– Bom dia.\r\n"
				+ "\r\n"
				+ "– Onde você está indo assim tão cedinho?\r\n"
				+ "\r\n"
				+ "– Vou visitar minha vovozinha, que está muito doente.\r\n"
				+ "\r\n"
				+ "O lobo esperto disse a ela:\r\n"
				+ "\r\n"
				+ "– Por que você não vai pela floresta? A floresta é o caminho mais rápido para a casa da sua avó.\r\n"
				+ "\r\n"
				+ "Ela ficou em dúvida, porque não gostava de desobedecer sua mãe, mas resolveu seguir o conselho\n"
				+ " do lobo. Enquanto chapeuzinho seguia pelo caminho da floresta, o lobo rapidamente seguiu pelo \n"
				+ "caminho bosque, cantando e correndo. O lobo chegou na casa da vovozinha e bateu na porta:\r\n"
				+ "\r\n"
				+ "– Quem está aí? — Perguntou a velhinha.\r\n"
				+ "\r\n"
				+ "O lobo respondeu, disfarçando a voz:\r\n"
				+ "\r\n"
				+ "– Sou eu, Chapeuzinho Vermelho.\r\n"
				+ "\r\n"
				+ "– Entre minha querida, a porta está aberta.\r\n"
				+ "\r\n"
				+ "O lobo, que era muito rápido, foi entrando e de uma só vez engoliu a vovozinha. Depois vestiu as \n"
				+ " roupas dela e ficou a espera de Chapeuzinho Vermelho. Chegando na casa da vovó, a menina encontrou \n"
				+ "o lobo e perguntou:\r\n"
				+ "\r\n"
				+ "– Vovó! Porque suas orelhas estão tão grandes?\r\n"
				+ "\r\n"
				+ "– É para te ouvir melhor.\r\n"
				+ "\r\n"
				+ "– Vovó! Para que esses olhos tão grandes?\r\n"
				+ "\r\n"
				+ "– É para te ver melhor.\r\n"
				+ "\r\n"
				+ "– Credo, vovó, porque a senhora está com essa boca tão grande?\r\n"
				+ "\r\n"
				+ "– É para te comer! — respondeu o lobo.\r\n"
				+ "\r\n"
				+ "Dizendo isso, o lobo começou a correr atrás de Chapeuzinho. Depois de algum tempo, ele tropeçou \n"
				+ "e caiu no chão. Enquanto isso, a menina se escondeu dentro de um armário. O lobo resolveu dar uma \n"
				+ " cochilada e começou a roncar. Um caçador que passava escutou:\r\n"
				+ "\r\n"
				+ "– Que ronco esquisito é este?\r\n"
				+ "\r\n"
				+ "Ele entrou e encontrou o lobo mal:\r\n"
				+ "\r\n"
				+ "– Ah! É você que está aí seu malvado!\r\n"
				+ "\r\n"
				+ "Escutando isso, Chapeuzinho apareceu e contou toda a história para o caçador. Aproveitando que o \n"
				+ "lobo estava dormindo, cortaram a sua a barriga e tiraram a vovozinha de dentro. As duas se abraçaram \n"
				+ " muito felizes.\r\n"
				+ "\r\n"
				+ "– E agora o que faremos com esse malvado?\r\n"
				+ "\r\n"
				+ "Os três resolveram encher a barriga do lobo de pedras. Quando o lobo acordou, tentou fugir, mas ele \n"
				+ " caiu e nunca mais levantou.\r\n"
				+ "\r\n"
				+ "Todos ficaram aliviados e felizes. O caçador foi embora e as duas foram se sentar na varanda e \n"
				+ "saborear os doces. Chapeuzinho prometeu nunca mais desobedecer a sua mãezinha.\n");
		o1.setTitulo("Chapeuzinho vermelho");
		o1.setValor(2.5);
		
		o2.setAutor("Joseph Jacobs");
		o2.setEdicao(1);
		o2.setEditora("Expresso Zahar");
		o2.setId(1);
		o2.setTexto("Era uma vez uma feliz família de porquinhos que tinha três filhos. Os porquinhos foram \n"
				+ "crescendo e os pais notavam que estavam muito dependentes. Não ajudavam no trabalho de casa \n"
				+ "nem se esforçavam em nada. Então um dia, eles se reuniram e decidiram que os porquinhos, que \n"
				+ "já estavam bem crescidos, fossem morar sozinhos. Os pais deram um pouco de dinheiro a cada um,\n"
				+ " alguns bons conselhos. Os três porquinhos partiram para o bosque em busca de um bom lugar para \n"
				+ "construir, cada um, a sua casa.\r\n"
				+ "\r\n"
				+ "O primeiro porquinho, que era o mais preguiçoso de todos, foi logo optando por construir uma casa \n"
				+ "rápida e que não necessitasse muito esforço. E construiu uma casa de palha, embora os seus irmãos \n"
				+ " lhe tenham dito que não era segura.\r\n"
				+ "\r\n"
				+ "O segundo porquinho, que era menos preguiçoso que o primeiro mas que tampouco gostava de trabalhar, \n"
				+ "construiu uma casa de madeira, porque pensava que era mais prática e resistente.\r\n"
				+ "\r\n"
				+ "O terceiro porquinho, o mais sensato de todos e mais trabalhador, preferiu construir uma casa de \n"
				+ "tijolos. Demorou mais para construí-la mas depois de três dias de intenso trabalho a casa estava \n"
				+ "prontinha.\r\n"
				+ "\r\n"
				+ "Os três porquinhos ouviram falar que um perigoso lobo rondava pelo bosque. E não demorou muito para \n"
				+ " que aparecesse pelas suas casas, em busca de uma boa carne de porco para comer.\r\n"
				+ "\r\n"
				+ "O lobo então foi bater na porta da casa do primeiro porquinho. O porquinho, tentando intimidá-lo \n"
				+ " disse:\r\n"
				+ "\r\n"
				+ "– Vá embora seu lobo. Aqui você não vai entrar.\r\n"
				+ "\r\n"
				+ "O lobo insistiu e disse:\r\n"
				+ "\r\n"
				+ "– Abra logo esta porta ou soprarei e soprarei e a sua casa destruirei.\r\n"
				+ "\r\n"
				+ "Vendo que o porquinho não abria a porta da casa, o lobo começou a soprar e soprar tão forte que a \n"
				+ "casa de palha voou pelos ares. O porquinho, desesperado, acabou correndo em direção à casa de madeira\n"
				+ " do seu irmão. O lobo correu atrás dele, mas não conseguiu alcançá-lo.\r\n"
				+ "\r\n"
				+ "O lobo então foi bater na porta da casa do segundo porquinho. O porquinho, tentando intimidá-lo disse:\r\n"
				+ "\r\n"
				+ "– Vá embora seu lobo. Na minha casa de madeira você não vai conseguir entrar.\r\n"
				+ "\r\n"
				+ "O lobo insistiu e disse:\r\n"
				+ "\r\n"
				+ "– Abram logo esta porta ou soprarei e soprarei e esta casa destruirei.\r\n"
				+ "\r\n"
				+ "Vendo que os porquinhos não abriam a porta da casa, o lobo começou a soprar e soprar tão forte que\n"
				+ " a casa de madeira caiu e ficou em pedaços. Os porquinhos, desesperados, acabaram correndo em direção \n"
				+ " à casa de tijolo e cimento do outro irmão. O lobo correu atrás deles, mas não conseguiu alcançá-los.\r\n"
				+ "\r\n"
				+ "O lobo então foi bater na porta da casa do terceiro porquinho. Os porquinhos tentando intimidá-lo cantaram:\r\n"
				+ "\r\n"
				+ "Quem tem medo do lobo mau\r\n"
				+ "Lobo mau, lobo mau?!\r\n"
				+ "Quem tem medo do lobo mau?!\r\n"
				+ "Ele é um cara legal!\r\n"
				+ "\r\n"
				+ "O lobo ficava cada vez mais furioso e gritou:\r\n"
				+ "\r\n"
				+ "– Abram a porta, já!!!\r\n"
				+ "\r\n"
				+ "E os porquinhos responderam:\r\n"
				+ "\r\n"
				+ "– Vá embora seu lobo. Você não conseguirá derrubar esta casa porque está feita com tijolo e cimento.\r\n"
				+ "\r\n"
				+ "O lobo insistiu e disse:\r\n"
				+ "\r\n"
				+ "– Abram logo esta porta ou soprarei e soprarei e esta casa destruirei.\r\n"
				+ "\r\n"
				+ "Vendo que os porquinhos não abriam a porta da casa, o lobo começou a soprar, soprar, soprar, \n"
				+ " e a casa continuava inteira no seu lugar. O lobo ficou tão cansado que acabou sentando-se ao pé \n"
				+ " da porta para descansar. Enquanto isso, pensou e pensou em como entrar na casa e teve uma idéia.\n"
				+ " Foi buscar uma escada para subir ao telhado da casa e entrar na casa pela chaminé. Os porquinhos, \n"
				+ " vendo o que tramava o lobo, reagiram logo. Puseram a ferver um balde enorme de água, e o colocou no \n"
				+ " final da chaminé e esperaram.\r\n"
				+ "\r\n"
				+ "Quando o lobo entrou na chaminé, caiu bem dentro do balde cheio de água fervendo.\r\n"
				+ "\r\n"
				+ "– Uai, uai, Uaiiiiii!!!!!!!! Gritou o lobo, saindo correndo ao lago para aliviar as suas queimaduras \n"
				+ " e assustado, nunca mais voltou a molestar os porquinhos.\r\n"
				+ "\r\n"
				+ "E quanto aos porquinhos, aprenderam a lição de que tudo o que é feito com esforço tem melhor \n"
				+ "resultado. Os três porquinhos decidiram morar juntos e todos viveram felizes e harmonia.");
		o2.setTitulo("Os três porquinos");
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
