import java.util.Scanner;

public class Exp7_2 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Hero hr = new Hero();
		Scanner sc = new Scanner(System.in);
		int command = sc.nextInt();
		hr.selectAction(command);
		sc.close();
	}

}
