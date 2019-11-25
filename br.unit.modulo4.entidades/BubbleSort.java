package br.unit.modulo4.entidades;



public class BubbleSort {
	// ATTRIBUTES
	private int[] vector;
	private String[] vectorOfStrings;
	private int mudancas = 0;

	// CONSTRUCTORES

	// Constructor para INT
	public BubbleSort(int[] vector) {
		// TODO Auto-generated constructor stub
		this.vector = vector;
	}

	// COnstructor para STRING
	public BubbleSort(String[] vectorOfStrings) {
		// TODO Auto-generated constructor stub
		this.vectorOfStrings = vectorOfStrings;
	}

	/*
	 * Algoritimo de ordenação para inteiros
	 */
	public void ordenarINT() {
		for (int i = 0; i < vector.length; i++) {
			for (int j = 1; j < vector.length; j++) {

				int v1 = vector[j-1];
				int v2 = vector[j];
				int aux;
				// Verificação: o anterior é maior que o atual?
				if (v1 > v2) {
					// Mudança de valores
					aux = v1;
					v1 = v2;
					v2 = aux;
					// then put them inside 'vector'
					vector[j-1] = v1;
					vector[j] = v2;
					// add one change
					mudancas++;
				}
			}
		}
	}

	/*
	 * Algoritimo de ordenação para Strings - Pela primeira letra
	 */
	public void ordenarString() {
		for (int i = 0; i < vectorOfStrings.length; i++) {
			for (int j = 1; j < vectorOfStrings.length; j++) {

				String v1 = vectorOfStrings[j-1];
				String v2 = vectorOfStrings[j];
				String aux;
				// Verificação: A PRIMEIRA LETRA da String anterior é maior que o atual?
				try {	// O try-catch foi utilizado caso não seja possível pegar o primeiro char de cada String
					if (v1.charAt(0) > v2.charAt(0)) {
						// Mudança de valores
						aux = v1;
						v1 = v2;
						v2 = aux;
						// then put them inside 'vector'
						vectorOfStrings[j-1] = v1;
						vectorOfStrings[j] = v2;
						// add one change
						mudancas++;
					}
				} catch (Exception e) {
					// TODO: handle exception
					System.out.println("Erro encontrado durante a ordenação: " + e);
				}

			}
		}
	}

	public String exibirVetorINT() {
		String vectorString = "[";
		for (int i = 0; i < vector.length; i++) {
			//			System.out.println(vector[i]);
			vectorString += " " + vector[i];
		}
		vectorString += " ]";
		return vectorString;
	}

	public StringBuffer exibirVetorSTRING() {

		StringBuffer s = new StringBuffer();

		s.append("[");

		for (int i = 0; i < vectorOfStrings.length; i++) {
			s.append(vectorOfStrings[i]+", ");
		}

		s.delete(s.length()-2, s.length());
		s.append("]");

		return s;
	}

	// Getters and Setters

	public int[] getVector() {
		return vector;
	}

	public String[] getVectorOfStrings() {
		return vectorOfStrings;
	}

	public int getMudancas() {
		return mudancas;
	}
}
