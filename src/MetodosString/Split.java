package MetodosString;


public class Split {
	public static void main(String[] args) {

		// Recorta o String a partir de um separador definido pelo variável.split("")

		String nome = "Gabriel Martins";

		String[] vetorNome = nome.split(" ");
		
		//Não preciso fazer isso:
		String word1 = vetorNome[0];
		System.out.println(word1);
		
		//Já é o suficiente
		System.out.println(vetorNome[1]);
	}
	
}
