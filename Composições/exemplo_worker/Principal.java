package exemplo_worker;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		DateTimeFormatter mask = DateTimeFormatter.ofPattern("MM/yyyy");
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		System.out.print("Qual o departamento? ");
		String departmentName = scan.nextLine();
		System.out.print("Qual o nome? ");
		String name = scan.nextLine();
		System.out.print("Qual o level? ");
		String level = scan.nextLine();
		System.out.print("Qual a base salarial? ");
		double salario = scan.nextDouble();
		Worker func1 = new Worker(name, WorkerLevel.valueOf(level), salario, new Department(departmentName));
		
		//Aqui vou criar o laço para adicionar os contratos do funcionário
		System.out.println("Quantos contratos?");
		int n = scan.nextInt();
		for (int i = 1; i<= n; i++) {
			System.out.print("Digite a data do "+ i + "º contrato ");
			Date contractDate = sdf.parse(scan.next()); //Cuidado não é nextLine
			System.out.print("Qual o valor por hora? ");
			double valorHora = scan.nextDouble();
			System.out.print("Quantas horas trabalhadas? ");
			int duracao = scan.nextInt();
			HourContract contrato = new HourContract(contractDate, valorHora, duracao);
			func1.addContract(contrato);
		}
			System.out.println("Digite o mês e o ano para calculo do salário mm/aaaa: ");
			String data = scan.next();
			//LocalDate dataFormatada = LocalDate.parse(data);
			
			//Jeito do nelio: outra forma de fazer
			int month = Integer.parseInt(data.substring(0, 2));
			int year = Integer.parseInt(data.substring(3));
			
			//Print do income
			System.out.println("Name: " + func1.getName());
			System.out.println("Department: " + func1.getDeparment().getName());
			System.out.println("Income for " + data + ": " +  String.format("%.2f", func1.income(year, month)));		
		
		scan.close();
		
	}

}
