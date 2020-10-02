package exercicios;

public class Exercicio4 {
	
	private int a = 3;
	private int b = 5;
	private int soma;
	
	public int somaMultiplos() {
		for(int i = 0; i < 10; i++){
		    if(i % a == 0 || i % b == 0){
		        soma += i;
		    }
		}
		return soma;
	}

	public void imprimeSoma() {
		System.out.println("A soma dos multiplos de 3 e 5 abaixo de 10, é: " + somaMultiplos());
	}
	
}
