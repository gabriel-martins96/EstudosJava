package desafiomodulo;

public class Jantar {

	public static void main(String[] args) {
		Pessoa pessoa1 = new Pessoa("Gabriel", 89.35);
		Comida comida1 = new Comida("Yakisoba", 300);
		Comida comida2 = new Comida("Coca", 250);
		
		System.out.printf("O peso era " + pessoa1.peso + " e passou a ser = %.2f", pessoa1.comer(comida1, comida2));

	}

}
