package primeira_solucao;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		
		System.out.println("Entre com os dados do aluguel");
		System.out.print("Modelo do carro: ");
		String carModel = scan.nextLine();
		 System.out.print("Retirada (dd/MM/yyyy hh:mm): ");
		 LocalDateTime start = LocalDateTime.parse(scan.nextLine(), fmt);
		 System.out.print("Retorno (dd/MM/yyyy hh:mm): ");
		 LocalDateTime finish = LocalDateTime.parse(scan.nextLine(), fmt);
		
		 CarRental cr = new CarRental(start, finish, new Vehicle(carModel));
		 
		 System.out.print("Entre com o preço por hora: ");
		 Double pricePerHour = scan.nextDouble();
		 System.out.print("Entre com o preço por dia: ");
		 Double pricePerDay = scan.nextDouble();
		 
		 RentalService rentalService = new RentalService(pricePerHour, pricePerDay, new BrazilTexService());
		 
		 rentalService.processInvoice(cr);
		 
		 System.out.println("Fatura:");
		 System.out.println("Pagamento básico: " + cr.getInvoice().getBasicPayment());
		 System.out.println("Imposto: " + cr.getInvoice().getTax());
		 System.out.println("Pagamento total: " + cr.getInvoice().getTotalPaymente());
		scan.close();
	}

}
