package Set;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoBagunçado {
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		HashSet conjunto = new HashSet();
		
		//Adicionando elementos heterogêneos
		conjunto.add(1); // double -> Double (automático)
		conjunto.add(true); // boolean -> Boolean
		conjunto.add("teste");
		
		//.size
		System.out.println("Testando .size:");
		System.out.println("Tamanho: " + conjunto.size());
		conjunto.add("5");
		System.out.println("Tamanho: " + conjunto.size());
		System.out.println();
		
		System.out.println("Repetição: ");
		//repetição
		conjunto.add("5");
		System.out.println("Tamanho: " + conjunto.size());
		
		//remove: retorna true se conseguir, false se não.
		System.out.println("Objeto que não existe: " + conjunto.remove("Teste"));
		System.out.println("Objeto que existe: " + conjunto.remove("teste"));
		System.out.println();
		
		//Contains: retorna boolean pesquisando se existe ou não
		System.out.println("Contains: ");
		System.out.println(conjunto.contains("5"));
		
		//Outra forma de trabalhar criando uma instância da classe Set
		System.out.println();
		System.out.println("Instância do tipo Set: ");
		Set nums = new HashSet();
		nums.add(1);
		nums.add(2);
		nums.add(3);
		System.out.println(nums);
		
		//União e Interseção de sets:
		//a) União - .add
		System.out.println();
		System.out.println("União de sets: ");
		conjunto.add(nums);
		System.out.println(conjunto); //Não preserva a ordem
		
		//b) Interseção - .retainAll (elementos em comum)
		System.out.println("Interseção de sets: ");
		conjunto.retainAll(nums);
		System.out.println(conjunto);
		
		//.clear - limpa o set
	}
}
