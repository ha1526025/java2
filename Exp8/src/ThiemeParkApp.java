
public class ThiemeParkApp {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		ThiemePark tk = new ThiemePark();
		int chargeAmount = 10000;

		System.out.println("チャージ金額：" + chargeAmount + "円");

		int admissionCost = tk.calculateAdmissionFee();
		System.out.println("入園料：" + admissionCost + "円");

		int attractionCost = tk.calculateAttractionFee(2);
		System.out.println("アトラクション料金：" + attractionCost + "円");

		int foodCost = tk.calculateFoodFee("カレー");
		System.out.println("フード料金：" + foodCost + "円");

		int totalCost = admissionCost + attractionCost + foodCost;
		chargeAmount -= totalCost;

		System.out.println("利用料金の合計：" + totalCost + "円");
		System.out.println("支払い後のチャージ残高：" + chargeAmount + "円");
	}

}
