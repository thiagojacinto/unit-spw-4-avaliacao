package br.unit.modulo4.application;

import java.util.Scanner;

import br.unit.modulo4.entidades.BubbleSort;
import br.unit.modulo4.entidades.Camisa;

public class Application {
	public static void main(String[] args) {
		
		// Chamando o leitor do teclado
		Scanner sc = new Scanner(System.in);
		
		// Verifica quantas camisas serão adicionadas na gaveta
		System.out.println("Quantas camisas deseja adicionar na gaveta?");
		
		int quantidadeDeCamisas = sc.nextInt();
		
		// Criar uma lista com camisas de cores aleatórias
		String[] gavetaDeCamisas = new String[quantidadeDeCamisas];
		
		for (int i = 0; i < gavetaDeCamisas.length; i++) {
			gavetaDeCamisas[i] = Camisa.gerarCamisa();
		}
		
		// Instanciar bubble sort, inserindo a lista
		BubbleSort bubble = new BubbleSort(gavetaDeCamisas);
		
		// Mostrar a lista desordenada no console
		System.out.println ("\nCamisas na gaveta: \n"
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
