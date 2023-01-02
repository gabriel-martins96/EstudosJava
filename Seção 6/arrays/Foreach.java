package arrays;

public class Foreach {

	public static void main(String[] args) {
		// Uma forma de estrutura de controle muito usado para arrays e collections
		
		double[] array = {5, 6, 8, 9};
		
		//Método tradicional
		for (int i = 0; i < array.length; i++) {
			System.out.print("Tradicional -> " + array[i]);
			System.out.print(" ");
		}
		
		//Método for each, crio um parâmetro novo mesmo
		for (double arrays:array) {
			System.out.print(arrays);
			System.out.print(" ");
		}
		//A cada laço ele adicionando o valor à arrays e imprime, mais fácil de percorrer
	}

}
