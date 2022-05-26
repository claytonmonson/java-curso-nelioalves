package entities;

public class Account {

	private int accountNumber;
	private String accountHolder;
	private double balance;
	
	public Account(int accountNumber, String accountHolder) {
		this.accountNumber = accountNumber;
		this.accountHolder = accountHolder;
	}

	public Account(int accountNumber, String accountHolder, double initialDeposit) {
		this.accountNumber = accountNumber;
		this.accountHolder = accountHolder;
		this.balance = initialDeposit;
	}
	
	public void deposit( double value ) {
		this.balance += value;
	}
	
	public void withdraw( double value ) {
		this.balance -= ( value + 5.00 );
	}

	
	@Override
	public String toString() {
		return "Account "
			 + this.accountNumber + ", "
			 + "Holder: " + this.accountHolder + ", "
			 + "Balance: $ "
			 + String.format( "%.2f", this.balance);
	}
	

}
