import java.util.Scanner;
public class Main {
	public static void main(String[] args) {

		try {
			run();
		} catch (NumberFormatException e) {
			System.out.println("エラー：販売数には整数を入力してください");
		} catch (IllegalArgumentException e) {
			System.out.println("入力エラー：" + e.getMessage());
		} catch (IllegalStateException e) {
			System.out.println("在庫エラー：" + e.getMessage());
		} finally {
			System.out.println("処理を終了します");
		}
	}

	private static void run() {
		Scanner sc = new Scanner(System.in);

		InventoryService sv = new InventoryService("ノートパソコン", 5);

		sv.showStock();

		System.out.println("販売する個数を入力してください：");
		String input = sc.nextLine();

		int quantity = Integer.parseInt(input);

		sv.sell(quantity);
		sv.showStock();
	}
}
