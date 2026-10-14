
public class Exp18_1 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		BankAccount account = new BankAccount();

		//	        account.balance = 100000; 
		//	        System.out.println("現在の預金残高：" + account.balance + "円"); 
		//	        account.balance = 500000; 
		//	        System.out.println("変更後の預金残高：" + account.balance + "円"); 

		account.deposit(100000);
		account.showBalance();

		account.deposit(50000);
		account.showBalance();
	}

}
