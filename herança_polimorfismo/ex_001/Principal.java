package ex_001;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		List<Employee> lista = new ArrayList<>();
		System.out.println("Enter the number of employees: ");
		int n = sc.nextInt();
		for (int i = 1; i<= n; i++) {
			System.out.println("Employee #"+i+": ");
			System.out.println("Outsourced (y/n)?");
			char ch = sc.next().charAt(0);  
			System.out.println("What's employee's name? ");
			sc.nextLine(); //consumir quebra de linha pendente de cima
			String name = sc.nextLine();
			System.out.println("Hours: ");
			int hours = sc.nextInt();
			System.out.println("Value per hour:");
			double valuePerHour = sc.nextDouble();
			if (ch == 'y') {
				System.out.print("Additional charge: ");
				double additional = sc.nextDouble();
				Employee employee = new OutsourcedEmployee(name, hours, valuePerHour,additional);
				lista.add(employee);
			}
			else {
				Employee employee = new Employee(name, hours, valuePerHour);
				lista.add(employee);
			}
			
		}
		
		System.out.println();
		System.out.println("Payments:");
		for(Employee list: lista) {
			System.out.println("Nome: " + list.getName());
			System.out.println("Valor: "+ list.payment());
		}
		
		
		sc.close();	
	}
}
