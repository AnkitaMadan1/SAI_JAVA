package class_object;

class BankAccount1 {
	private int AccountNumber; // declare variable
	private int balance;

	BankAccount1(int AccountNumber, int balance) { // Constructor
		this.AccountNumber = AccountNumber;
		this.balance = balance;

	}

	public int getAccountNumber() { // getaccountnumber
		return AccountNumber;
	}

	public int getbalance() { // getbalance
		return balance;
	}

	public void deposit(int amount) {
		if (amount > 0) {
			balance += amount;
			System.out.println(amount + " amount" + "new balance" + balance);
		} else {
			System.out.println("Invalid");
		}
	}

	public void withdraw(int amount) {
		if (amount < balance) {
			balance -= amount;
			System.out.println(amount + "  " + balance);
		} else {
			System.out.println("Withdrawn sis not possible");
		}

	}

}

public class practice9 {

	public static void main(String[] args) {

		BankAccount1 obj2 = new BankAccount1(100, 200);
		System.out.println(obj2.getAccountNumber());
		System.out.println(obj2.getbalance());

		obj2.deposit(100);
		obj2.getbalance();
		obj2.withdraw(500);

	}

}
