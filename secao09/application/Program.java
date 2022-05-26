package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Account;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Account account;

		System.out.print("Enter account number: ");
		int accountNumber = sc.nextInt();
		System.out.print("Enter account holder: ");
		String accountHolder = sc.next();
		sc.next();
		System.out.print("Is there an initial deposit (y/n) ? ");
		char isThereInitialDeposit = sc.next().charAt(0);

		if (isThereInitialDeposit == 'y') {
			System.out.print("Enter initial deposit value: ");
			double initialDepositValue = sc.nextDouble();
			account = new Account(accountNumber, accountHolder, initialDepositValue);
		} else {
			account = new Account(accountNumber, accountHolder);
		}

		System.out.println();

		System.out.println("Account data:");
		System.out.println(account.toString());
		
		System.out.println();
		System.out.print("Enter a deposit value: ");
		account.deposit( sc.nextDouble() );
		System.out.println();
		System.out.println("Updated account data:");
		System.out.println(account.toString());
	
		System.out.println();
		System.out.print("Enter a withdraw value: ");
		account.withdraw( sc.nextDouble() );
		System.out.println();
		System.out.println("Updated account data:");
		System.out.println(account.toString());

		sc.close();

	}
}
