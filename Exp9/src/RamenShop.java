
public class RamenShop {

	String customerName;
	int totalPrice = 0;
	
	void reserveSeats(String name,int people) {
		customerName = name;
		System.out.println(name + "様　" + people + "名の座席を確保しました");
	}
	
	void showMenu() {
		System.out.println("１：しょうゆラーメン　７５０円");
		System.out.println("２：みそラーメン　８５０円");
		System.out.println("３：塩ラーメン　８００円");
	}
	
	void orderRamen(int menuNumber,int quantity) {
		int price = 0;
		switch(menuNumber) {
		case 1:
			price = 750;
			break;
		case 2:
			price = 850;
			break;
		case 3:
			price = 800;
			break;
		}
		
		int subtotal = price * quantity;
		totalPrice += subtotal;
		System.out.println("小計：" + subtotal + "円");
	}
}
