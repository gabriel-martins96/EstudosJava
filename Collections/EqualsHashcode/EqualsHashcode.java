package EqualsHashcode;

public class EqualsHashcode {

	public static void main(String[] args) {
		Pessoa p1 = new Pessoa("Gabriel", 89);
		Pessoa p2 = new Pessoa("Gabriel", 89.5);
		
		//False, pois as referências são diferentes
		System.out.println(p1==p2);
		System.out.println(p1);
		System.out.println(p2);
		//Aqui o equals vai se comportar da mesma maneira -> p1.equals(p2)
		System.out.println("Comparando por atributo através de equals -> "+ p1.nome.equals(p2.nome));
		System.out.println("Equals implementado = " + p1.equals(p2));
		//Atribuição por valor, true
		int a = 2;
		int b =2;
		System.out.println(a==b);
		
		
		
	}

}
