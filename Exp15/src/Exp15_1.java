
public class Exp15_1 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Product p1 = new Product();
		Product p2 = new Product("紅茶",450);
		Product p3 = new Product("コーヒー豆",1200,30);
		Product p4 = new Product("ジュース",180,50,"飲料");
		
		p1.showInfo();
		System.out.println();
		p2.showInfo();
		System.out.println();
		p3.showInfo();
		System.out.println();
		p4.showInfo();
	}

}
