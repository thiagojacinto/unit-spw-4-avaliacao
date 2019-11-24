package br.unit.modulo4.root;

import java.util.Scanner;

import br.unit.modulo4.entidades.BubbleSort;

public class Application {
	public static void main(String[] args) {
		
		// Chamando o leitor do teclado
		Scanner sc = new Scanner(System.in);
		
		// Criando uma lista 
		String[] gavetaDeCamisas = {
				"Vermelha",
				"Amarela",
				"Azul",
				"Verde",
				"Lilás",
				"Roxa"
				};
		
		// Mostrar a lista no console
//		System.out.println("Camisas na gaveta: \n");
//		for (int i = 0; i < gavetaDeCamisas.length; i++) {
//			System.out.print(gavetaDeCamisas[i]);
//		}
		
		/*
		 * 		APLICAR CONCEITOS DE PILHA
		 */
		
		/* 
		 * 		APLICAR ORDENAÇÃO - Método Bubble
		 */
		
		// Instanciar bubble sort, inserindo a lista
		BubbleSort bubble = new BubbleSort(gavetaDeCamisas);
		
		// Mostrar a lista desordenada no console
		System.out.println ("Camisas na gaveta: \n"
				+ bubble.exibirVetorSTRING()
				);
		
		// Chamar o método ordenar
		bubble.ordenarString();
		
		// Atribuir o resultado ordenado a uma variavel de saída
		String[] listaOrdenada = bubble.getVectorOfStrings();
		
		// Mostrar a lista ordenada no console:
		System.out.println("\nCamisas ordenadas por nome: \n"
				+ bubble.exibirVetorSTRING()
				);
		
		// Fechando a conexão com leitor de teclado
		sc.close();
	}
}
