package br.unit.modulo4.entidades;

public class Pilha {

	// ATRIBUTOS

	private static final int TAMANHO_DA_PILHA = 30;
	private String[] vector;
	private int topo = -1;

	// CONSTRUCTOR
	public Pilha(int sizeOfStack) {
		// TODO Auto-generated constructor stub
		this.vector = new String[sizeOfStack];
	}

	public Pilha() {		// Construtor vazio, usa a constante de tamanho = 30.
		// TODO Auto-generated constructor stub
		this.vector = new String[TAMANHO_DA_PILHA];
	}

	// METODOS

	/*
	 * 		PUSH - Adicionar elementos a Pilha
	 */

	public void push(String adicionarNovoElemento) {

		// Verifica a posição do top, se está menor que o tamanho do vetor
		if (topo < vector.length - 1) {
			// Move o topo para a próxima posição
			topo++;
			// Coloca o novo elemento nesta posição do vetor
			vector[topo] = adicionarNovoElemento;
		} else {
			throw new RuntimeException("Não foi possível adicionar: a gaveta está cheia.");
		}
	}

	/*
	 * 		POP - Remover elemtnos da Pilha
	 */

	public void pop() {

		// Verifica se existe ao menos um elemento na pilha (i.e. topo > -1) 
		if (topo > -1) {
			// Elimina o valor (colando "vazio") associado aquela posição.
			//		obs: "vazio" foi escolhido pois 'v' está abaixo das letras maiusculas na tabela ASCII
			vector[topo] = "vazio";
			// Reduz o topo a posição anterior
			topo--;
		} else {
			throw new RuntimeException("Não possíovel retirar: a gaveta já está vazia.");
		}
	}
	
	/*
	 * 		isEmpty - Verifica se a pilha está VAZIA.
	 */
	
	public boolean isEmpty() {
		// Verifica se o topo está vazio (i.e. topo = -1)
		if (this.topo == -1) {
			return true;	// caso verdadeiro, retorna 'true' = está vazio
		}
		return false;		// ou, retorna 'falso' = NÃO está vazio
	}
	
	
	/*
	 * 		isFull - Verifica se a pilha está CHEIA.
	 */
	
	public boolean isFull() {
		// Verifica se o topo está cheio (i.e. topo = tamanho do array - 1)
		if (this.topo == vector.length - 1) {
			return true;	// caso verdadeiro, retorna 'true' = está cheio
		}
		return false;		// ou, retorna 'falso' = NÃO está cheio
	}
	
	/*
	 * 		Método para retornar o valor presente no topo da pilha.
	 */

	public String getValorNoTopo() {
		// Se a pilha NÃO (char '!') estiver vazia
		if (!this.isEmpty()) {
			return vector[topo];
		}
		throw new RuntimeException("Não há valor no topo: a gaveta está vazia.");
	
	}
	
	/*
	 *  	Exibir o vetor
	 */
	
	public String exibirVector() {
		String vectorString = "[";
		for (int i = 0; i < vector.length; i++) {
			//			System.out.println(vector[i]);
			vectorString += " " + vector[i];
		}
		vectorString += " ]";
		return vectorString;
	}

	// GETTERS e SETTERS

	public int getTopo() {
		return topo;
	}
	
	public void setTopo(int topo) {
		this.topo = topo;
	}

	public String[] getVector() {
		return vector;
	}
	
	public void setVector(String[] vector) {
		this.vector = vector;
	}
}
