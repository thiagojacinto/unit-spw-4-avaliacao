package br.unit.modulo4.root;

import java.util.Scanner;

import br.unit.modulo4.entidades.BubbleSort;
import br.unit.modulo4.entidades.Camisa;
import br.unit.modulo4.entidades.Pilha;

public class Application {
	public static void main(String[] args) {

		// Chamando o leitor do teclado
		Scanner sc = new Scanner(System.in);

		// Criando uma lista 
		//		String[] gavetaDeCamisas = {
		//				"Vermelha",
		//				"Amarela",
		//				"Azul",
		//				"Verde",
		//				"Lilás",
		//				"Roxa",		// Inseri algumas cores a mais fonte: https://pt.wikipedia.org/wiki/Lista_de_cores
		//				"Marrom",
		//				"Neve",
		//				"Laranja",
		//				"Cinza",
		//				"Branco",
		//				"Jambo"
		//		};

		// Verifica quantas camisas serão adicionadas na gaveta
		System.out.println("Quantas camisas deseja adicionar na gaveta?");

		int quantidadeDeCamisas = sc.nextInt();

		// Criar uma lista com camisas de cores aleatórias
		String[] gavetaDeCamisas = new String[quantidadeDeCamisas];
		for (int i = 0; i < gavetaDeCamisas.length; i++) {
 			gavetaDeCamisas[i] = Camisa.gerarCamisa();
 		}

		/*
		 * 		CONCEITOS DE PILHA
		 * 
		 * 		- Implementado na classe 'Fila', package 'entidades'
		 */

		// Instanciar uma Pilha com tamanho da lista 'gavetaDeCamisas'
		Pilha gavetaEmPilha = new Pilha(gavetaDeCamisas.length);
		// Inserir a lista na instancia de Pilha criada
		gavetaEmPilha.setVector(gavetaDeCamisas);
		// e também mover o topo para o final
		gavetaEmPilha.setTopo(gavetaDeCamisas.length - 1);

		// Interação com o Usuário - Saudações
		System.out.println("Bem vindo. Você tem na gaveta as seguintes camisas: \n"
				+ gavetaEmPilha.exibirVector()
				+ "\n"
				);
		// Variável para começar o loop com 'while'
		boolean continuarNoMenu = true;
		while (continuarNoMenu) {

			// Interação - Menu
			System.out.println("\nO que deseja fazer com essas camisas? "
					+ "\nDigite o número da opção: "
					+ "\n > [1] Adicionar uma camisa; "
					+ "\n > [2] Remover uma camisa;"
					+ "\n > [3] Verificar se a gaveta está cheia;"
					+ "\n > [4] ou se está vazia;"
					+ "\n > [5] Ordenar lista; "
					+ "\n > [6] Exibir lista;"
					+ "\n > [7] Finalizar.");
			int escolhaDoMenu = sc.nextInt();
			// Switch para cada opção escolhida pelo Usuário
			switch (escolhaDoMenu) {
			case 1:	// Adicionar uma camisa
				System.out.println("Digite o nome (com a primeira letra maiúscula) da cor da camisa a ser adicionada: ");
				// Pega input do teclado com uma string
				String novaCamisa = sc.next();
				try {
					gavetaEmPilha.push(novaCamisa);
				} catch (RuntimeException e) {
					// TODO: handle exception
					// Imprime no console a mensagem do erro e em outra linha o tipo de erro.
					System.out.println(e.getMessage() + "\n Error: " + e);
				}

				break;
			case 2: // Remover uma camisa
				System.out.println("Tentando remover a camisa da gaveta ...");
				try {
					System.out.println("Removendo a camisa de cor: " 
							+ gavetaEmPilha.getValorNoTopo()
							);
					gavetaEmPilha.pop();
				} catch (RuntimeException e) {
					// TODO: handle exception
					// Imprime no console a mensagem do erro e em outra linha o tipo de erro.
					System.out.println(e.getMessage() + "\n Error: " + e);
				}

				break;
			case 3:	// Verificar se a gaveta está cheia
				System.out.println("Verificando a situação da gaveta ...");

				// Verifica se a Pilha está cheia
				if (gavetaEmPilha.isFull()) {
					System.out.println("A gaveta já está cheia.");
				} else {
					System.out.println("A gaveta NÃO está cheia.");
				}


				break;
			case 4:	// ou se está vazia

				System.out.println("Verificando a situação da gaveta ...");

				// Verifica se a Pilha está vazia
				if (gavetaEmPilha.isEmpty()) {
					System.out.println("A gaveta está vazia.");
				} else {
					System.out.println("A gaveta NÃO está vazia.");
				}

				break;
			case 5:	// Ordenar lista

				/* 
				 * 		CONCETIS DE ORDENAÇÃO - Método Bubble
				 * 
				 * 		- Implementado na classe 'BubbleSort', package 'entidades'
				 */

				// Instanciar bubble sort, inserindo a lista
				BubbleSort bubble = new BubbleSort(gavetaEmPilha.getVector());

				// Mostrar a lista desordenada no console
				System.out.println ("Camisas na gaveta: \n"
						+ bubble.exibirVetorSTRING()
						);

				// Chamar o método ordenar
				bubble.ordenarString();

				// Atribuir o resultado ordenado a ao vetor presente na pilha. 
				// 		(i.e. o vetor presente na pilha 'gavetaEmPilha')
				gavetaEmPilha.setVector(bubble.getVectorOfStrings());

				// Mostrar a lista ordenada no console:
				System.out.println("\nCamisas ordenadas por nome: \n"
						+ bubble.exibirVetorSTRING()
						);

				break;
			case 6:	// Exibir lista
				System.out.println("\nExibindo as camisas na gaveta, dispostas na seguinte ordem: \n"
						+ gavetaEmPilha.exibirVector());


				break;

			case 7:	// Finalizar
				System.out.println("Obrigado por usar esta aplicação. "
						+ "\n\n Encerrando ...");
				// quebra o 'while' com a condição falsa
				continuarNoMenu = false;

				break;

			default:
				throw new IllegalArgumentException("Unexpected value: " + escolhaDoMenu);
			}
		}

		// Fechando a conexão com leitor de teclado
		sc.close();
	}
}