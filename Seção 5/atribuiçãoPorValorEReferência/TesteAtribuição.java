package atribuiçãoPorValorEReferência;

public class TesteAtribuição {

	public static void main(String[] args) {
		
		//1º Null
		String txt1 = null;
		System.out.println("Nenhum lugar apontado -> " + txt1);
		System.out.println();
		System.out.println("---------------------------------------------");
		System.out.println();
		
		//2º Incializada recebendo null
		String txt2 = "teste";
		txt1 = txt2;
		System.out.println("txt1 -> " + txt1 + " / txt2 -> " + txt2);
		System.out.println();
		System.out.println("---------------------------------------------");
		System.out.println();
		
		//3ºNull recebendo inicializado
		String txt3 = "teste";
		String txt4;
		txt4 = txt3;
		System.out.println("txt3 -> " + txt3 + " / txt1 -> " + txt4);

		//Tentando acessar atributo de instância através de um null
		//Dá erro: Runtime, só ocorre quando executa
		ClasseDeTeste teste1 = null;
		teste1.textoDeTeste = "Oi";
		System.out.println("teste" +teste1.textoDeTeste);
	}

}
