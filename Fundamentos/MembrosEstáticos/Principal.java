package MembrosEstáticos;

import java.util.Scanner;

public class Principal {
	
	
	public static void main(String[] args) {
		double valorDolares;
		 double dolarCotation;
		Scanner scan = new Scanner(System.in);
		System.out.print("What is the dollar price?");
		dolarCotation = scan.nextDouble();
		System.out.println("How many dollars will be bought?");
		valorDolares = scan.nextDouble();
		double amount = Conversao.converter(valorDolares, dolarCotation);	
		System.out.println(amount);
		scan.close();
	}
			
}
