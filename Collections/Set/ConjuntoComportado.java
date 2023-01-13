package Set;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class ConjuntoComportado {

	public static void main(String[] args) {
		//Conceito -> Generics
		//Não garante ordem de inserção
		Set<String> lista = new HashSet();
		lista.add("Ana");
		
		//TreeSet preserva ordem de inserção
		//SortedSet - aceita ordenação, tem como eu configurar a ordenação
		Set<String> lista2 = new TreeSet<>();
	}

}
