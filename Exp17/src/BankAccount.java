
public class BankAccount {

	private int balance;
	
	 public void deposit(int amount) { 
	        this.balance += amount; 
	    } 
	 public void showBalance() { 
	        System.out.println("現在の預金残高：" + this.balance + "円"); 
	 }
}
