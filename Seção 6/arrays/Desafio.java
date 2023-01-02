package arrays;

import java.util.Scanner;

public class Desafio {
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		System.out.println("Programa de cálculo de média");
		System.out.println("Quantas notas deseja registrar?");
		int notas = leitor.nextInt();
		int indice = 1;
		double[] arrayNotas = new double[notas];
		for (int i = 0; i < arrayNotas.length; i++) {
			
			System.out.print("Digite a " + indice + "º nota:");
			indice++;
			arrayNotas[i] = leitor.nextDouble();
		}
		
		double total = 0;
		for(double notasAlunos:arrayNotas) {
			total+= notasAlunos;
		}
		double media = total/arrayNotas.length;
		System.out.println();
		System.out.println("A média do aluno é: " + media);
	}
}
