package Conversões;

public class ConversãoNumeroString {
	
	public static void main(String[] args) {
		
		//Numero -> String: toString
		//a) Integer -> String
		Integer numero = 5;
		String literal = numero.toString();
		System.out.println(literal);
		
		//b) int -> String
		int numero2 = 5;
		String literal2 = Integer.toString(numero2);
		
		//c) gambiarra: concatenar com string vazia
		System.out.println("" + numero2);
		
		//String -> Numero
		double num = Double.parseDouble(literal);
		System.out.println("Teste double: " + num);
		//BigDecimal: aumenta precisão
	}
	
	
}
