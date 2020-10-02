package application;

import exercicios.Exercicio1;
import exercicios.Exercicio2;
import exercicios.Exercicio3;
import exercicios.Exercicio4;

public class Main {
	public static void main(String[] args) {
		
		Exercicio1 ex1 = new Exercicio1();
		ex1.imprimeVotos();
		
		System.out.println();
		
		Exercicio2 ex2 = new Exercicio2();
		ex2.imprimeVetor();
		
		System.out.println();
		System.out.println();
		
		Exercicio3 ex3 = new Exercicio3();
		ex3.imprimeFatorial();
		
		System.out.println();
		
		Exercicio4 ex4 = new Exercicio4();
		ex4.imprimeSoma();		
		}
	}
