package exercicios;

public class Exercicio2 {

	private int[] vetor = { 5, 3, 2, 4, 7, 1, 0, 6 };

	public int[] ordenar() {
		for (int i = 0; i < vetor.length - 1; i++) {
			
			for (int j = 0; j < vetor.length - 1 - i; j++) {
				
				if (vetor[j] > vetor[j + 1]) {
					
					int ord = vetor[j];
					vetor[j] = vetor[j + 1];
					vetor[j + 1] = ord;
				}
			}
		}
		return vetor;
	}
	
	public void imprimeVetor() {
		System.out.println("Vetor ordenado com bubble sort:");
		for(int count : ordenar()) {
			System.out.print(count + " ");
			}
	}
	
}