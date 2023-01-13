package List;

import java.util.ArrayList;

public class Lista {

	public static void main(String[] args) {
		ArrayList<Usuario> lista = new ArrayList<>();
		//Precisa implementar Hashcode e Equals, pois são importantes para as verificações.
		//Formas de add:
		Usuario u1 = new Usuario("Gabriel");
		lista.add(u1);
		
		lista.add(new Usuario("Carlos"));
		lista.add(new Usuario("Ana"));
		lista.add(new Usuario("Maria"));
		lista.add(new Usuario("Jão"));
		lista.add(new Usuario("Luis"));
		lista.add(new Usuario("Fabricio"));
		
		for (Usuario us: lista) {
			System.out.println(us.name); //Mantem a ordem de inserção
		}
		//Posso imprimir por índice:
		System.out.println("Index: " + lista.get(3).name);
		System.out.println();
		
		//remove
		System.out.println("Remocao:");
		lista.remove(1);
		System.out.println(lista.remove(new Usuario("Maria"))); //tem que ser exatamente igual
		System.out.println();
		//contains
		System.out.println("Contais: " + lista.contains(new Usuario("Luis")));
	}

}
