package bankAccountWithTransfer;

public class Driver {

	public static void main(String[] args) {
		BankAccount tom = new BankAccount("Tom");
		BankAccount david = new BankAccount("David");

		tom.deposit(500.0);
		david.deposit(200.0);

		tom.transfer(100, david);

		david.withdraw(100.0);
		david.withdraw(300.0);

	}

}
