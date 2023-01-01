package Conversões;

public class Conversoes {

	public static void main(String[] args) {
		/*
		 * 1.Conversão implícita: quando não há perca de informação seja por tamanho, ou
		 * por ponto flutuante, ou por tipo de numeral
		 * 
		 * 2.Conversão explícita: quando há perca de informação, ponto flutuante e tipo do numeral
		 * 
		 * */
		//Implicita
		double numero1 = 1;
		//float numero2 = numero1;  - Erro
		float numero2 = 1F;
		System.out.println(numero2);
		
		//Conversão explicita, ciente que posso perder valor (CAST) 
		float b = (float) 1.265625256;
		int c = 4;
		byte d = (byte) c; //Preciso explicitar, pois o java olha o tipo e não valor, byte armazena
		// menos quando comparado com o int
		
		
	}

}
