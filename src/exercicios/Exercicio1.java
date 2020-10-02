package exercicios;

public class Exercicio1 {

	private Double totalEleitores = 1000.00;
	private Double votosValidos = 800.00;
	private Double votosBrancos = 150.00;
	private Double votosNulos = 50.00;
	
	public Double percentualVotosValidos() {
	 	return (votosValidos / totalEleitores)*100;
	}
	
	public Double percentualVotosBrancos() {
		return (votosBrancos / totalEleitores)*100;
	}
	
	public Double percentualVotosNulos() {
		return (votosNulos / totalEleitores)*100;
	}
	
	public void imprimeVotos() {
		System.out.println("Percentual de votos validos: " + percentualVotosValidos() + "%");
		System.out.println("Percentual de votos brancos: " + percentualVotosBrancos() + "%");
		System.out.println("Percentual de votos nulos: " + percentualVotosNulos() + "%");
	}
	
}
