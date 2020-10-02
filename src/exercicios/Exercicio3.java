package exercicios;

public class Exercicio3 {

	private Double numero = 6.0;
	private Double num;

	public Double calcularFatorial() {
		if (numero == 0.0) {
			num = 1.0;
		} else {
			num = numero;
			Double i = num - 1;
			while (i > 0) {
				num = num * i;
				i--;
			}
		}
		return num;
	}

	public void imprimeFatorial() {
		System.out.println("O fatorial de " + numero + " é: " + calcularFatorial());
	}

}
