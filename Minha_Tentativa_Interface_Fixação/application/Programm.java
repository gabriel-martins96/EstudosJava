package application;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import entities.Contrato;
import entities.Parcelas;
import services.ContractService;
import services.PaypalService;

public class Programm {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		System.out.println("Entre com os dados do contrato:");
		System.out.print("Numero: ");
		Integer numero = scan.nextInt();
		System.out.print("Data (dd/MM/yyyy): ");
		LocalDate data = LocalDate.parse(scan.next(), fmt);
		System.out.print("Valor do contrato: ");
		Double valor = scan.nextDouble();
		System.out.print("Quantidade de parcelas: ");
		Integer parcelas = scan.nextInt();
		
		Contrato contrato = new Contrato(numero, data, valor);
		
		ContractService processamento = new ContractService(new PaypalService());
		processamento.ProcessamentoContrato(contrato, parcelas);
		
		System.out.println("Parcelas:");
		for (Parcelas parcela : contrato.getParcelas()) {
			System.out.println(parcela);
		}
		scan.close();
	}

}
