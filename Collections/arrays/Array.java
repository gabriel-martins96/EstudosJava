package arrays;

import java.util.Arrays;
import java.util.Iterator;

public class Array {
	public static void main(String[] args) {
		/*
		 * Conceitos: - Fixos - Homogêneo - Objeto: guardam referências
		 */
		// 1º Forma de atribuição
		String[] txts = new String[3];
		txts[0] = "oi";
		txts[1] = "tudo bem?";
		txts[2] = "Sim";

		// 2º Forma de atribuição
		double[] notas = { 10.0, 10.0, 10.0 };
		double total = 0;
		for (int i = 0; i < notas.length; i++) {
			total += notas[i];
		}
		double media = total / notas.length;
		System.out.println("A média é: " + media);
		

		System.out.println();
		// Como imprimir o array, sem ser a referência:
		// Importar o java.util.Arrays e chamar o método toString
		System.out.println(Arrays.toString(txts));

		// Métodos interessantes:
		int comprimento = txts.length;

		// Acessando métodos da classe String
		String up = txts[0].toUpperCase();
		System.out.println(up);
	}
}
