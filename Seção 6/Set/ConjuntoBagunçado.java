package Set;

import java.util.HashSet;

public class ConjuntoBagunçado {
	public static void main(String[] args) {
		HashSet conjunto = new HashSet();
		
		//Adicionando elementos heterogêneos
		conjunto.add(1.2); // double -> Double (automático)
		conjunto.add(true); // boolean -> Boolean
		conjunto.add("teste");
		
		//.size
		System.out.println("Testando .size:");
		System.out.println("Tamanho: " + conjunto.size());
		conjunto.add("5");
		System.out.println("Tamanho: " + conjunto.size());
		System.out.println();
		System.out.println();
		
		System.out.println("Repetição: ");
		//repetição
		conjunto.add("5");
		System.out.println("Tamanho: " + conjunto.size());
		
		//remove: retorna true se conseguir, false se não.
		System.out.println("Objeto que não existe: " + conjunto.remove("Teste"));
		
	}
}
