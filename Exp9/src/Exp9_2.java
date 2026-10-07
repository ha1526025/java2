import java.util.Scanner;
public class Exp9_2 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner sc = new Scanner(System.in);
		RamenShop rs = new RamenShop();
		rs.showWelcome();
		String name = sc.nextLine();
		int people = sc.nextInt();
		rs.reserveSeats(name,people );
		rs.showMenu();
		int menuNumber = sc.nextInt();
		int quantity = sc.nextInt();
		rs.orderRamen(menuNumber, quantity);
		int payment = sc.nextInt();
		System.out.println("おつり" + rs.checkout(payment) + "円です");
		
	}

}
