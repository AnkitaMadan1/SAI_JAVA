package class_object;

class BankAccount {
	int accountNumber;
	int balance;

	// Constructor
	BankAccount(int accountNumber, int balance) {
		this.accountNumber = accountNumber;
		this.balance = balance;
	}

	// Deposit method (returns updated balance)
	int deposit(int amount) {
		balance += amount; // balance badha diya
		return balance; // new balance wapas diya
	}

	// Withdraw method (returns true/false)
	boolean withdraw(int amount) {
		if (amount <= balance) {
			balance -= amount; // paisa nikal diya
			return true; // success
		} else {
			return false; // fail
		}
	}

	// Balance check (returns balance value)
	int getBalance() {
		return balance;
	}
}

public class practtice8_E {
	public static void main(String[] args) {
		BankAccount acc = new BankAccount(101, 500); // account no. 101, initial balance = 500

		// Deposit
		int newBal = acc.deposit(200);
		System.out.println("After deposit, Balance = " + newBal);

		// Successful withdrawal
		if (acc.withdraw(300)) {
			System.out.println("Withdrawal successful! Balance = " + acc.getBalance());
		} else {
			System.out.println("Withdrawal failed! Not enough balance.");
		}

		// Failed withdrawal
		if (acc.withdraw(600)) {
			System.out.println("Withdrawal successful! Balance = " + acc.getBalance());
		} else {
			System.out.println("Withdrawal failed! Not enough balance.");
		}
	}
}
