package ex_002;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		List<Product> lista = new ArrayList<>(); 
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		System.out.println("Quantos produtos?");
		int n = scan.nextInt();
		
		for (int i =1; i<=n; i++) {
			System.out.println("Comum, usado ou importado? (c/u/i)");
			char letra = scan.next().charAt(0);
			if (letra == 'c') {
				System.out.println("Qual o nome?");
				scan.nextLine();
				String name = scan.nextLine();
				System.out.println("Qual o valor?");
				double price = scan.nextDouble();
				lista.add(new Product(name, price));
			} else if (letra =='u') {
				System.out.println("Qual o nome?");
				scan.nextLine();
				String name = scan.nextLine();
				System.out.println("Qual o valor?");
				double price = scan.nextDouble();
				System.out.println("Qual a data de fabricação? dd/mm/aaaa");
				LocalDate date = LocalDate.parse(scan.next(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));
				lista.add(new UsedProduct(name, price, date));
			} else if (letra == 'i') {
				System.out.println("Qual o nome?");
				scan.nextLine();
				String name = scan.nextLine();
				System.out.println("Qual o valor?");
				double price = scan.nextDouble();
				System.out.println("Qual a taxa de importação?");
				double imp = scan.nextDouble();
				lista.add(new ImportedProduct(name, price, imp));
			}
		}
		
		for (Product list: lista) {
			System.out.println(list.priceTag());
		}
		scan.close();
	}
}
