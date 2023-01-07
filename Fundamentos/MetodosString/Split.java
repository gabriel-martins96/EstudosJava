package MetodosString;


public class Split {
	public static void main(String[] args) {

		// Recorta o String a partir de um separador definido pelo variável.split("")

		String nome = "Gabriel Martins";

		String[] vetorNome = nome.split(" ");
		
		//Não preciso fazer isso:
		String word1 = vetorNome[0];
		System.out.println("word 1: " + word1);
		String word2 = vetorNome[1];
		System.out.println("word 2: " + word2);
				
		
		//Já é o suficiente
		System.out.println("vetor 0: " + vetorNome[0]);
		System.out.println("vetor 0: " + vetorNome[1]);
		System.out.println(vetorNome.length);
		System.out.println(vetorNome[0].concat(vetorNome[1]));
		
	
		
	}
	
}
