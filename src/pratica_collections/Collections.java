package pratica_collections;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Collections {
	public static void main(String[] args) {
		List <String> nomes = new ArrayList();
		
		//add
		nomes.add("Paula");
		nomes.add("Ana");
		nomes.add("Leonardo");
		
		/*nomes.sort((p1, p2) -> p1.compareTo(p2));
		for (String nome: nomes) {
			System.out.println(nome);*/
		
		
		/*nomes.sort(new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				return o2.getAge() - o1.getAge();
			}*/
		}
		
	}
