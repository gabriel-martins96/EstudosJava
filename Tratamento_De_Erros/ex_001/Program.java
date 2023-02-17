package ex_001;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		try {
			System.out.println("Enter account data");
			System.out.print("Number: ");
			Integer number = scan.nextInt();
			System.out.print("Holder: ");
			scan.nextLine();
			String holder = scan.nextLine();
			System.out.print("Initial balance: ");
			Double balance = scan.nextDouble();
			System.out.print("Withdraw limit: ");
			Double withdrawLimit = scan.nextDouble();
			
			Account account = new Account(number, holder, balance, withdrawLimit);
			
			System.out.print("Enter amount for withdraw: ");
			Double amount = scan.nextDouble();
			account.withdraw(amount);
		} catch (RuntimeException e) {
			System.out.print(e.getMessage());
		}
		catch (Exception e) {
			System.out.println("Unexpected error");
		}
				
		scan.close();
	}

}
