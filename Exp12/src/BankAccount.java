
public class BankAccount {

	int balance = 1000;
	
	void deposit(int balance) {
		this.balance += balance;
	}
	
	void showBalance() {
		System.out.println("口座残高：" + balance + "円");
	}
}
