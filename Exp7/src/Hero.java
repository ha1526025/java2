
public class Hero {

	String weapon = "ひのきのぼう";
	int money = 1000;
	int attackPower = 40;

	void changeWeapon(String newWeapon) {
		weapon = newWeapon;
		System.out.println(weapon + "を装備しました");
	}

	void selectAction(int command) {
		switch (command) {
		case 1:
			System.out.println("攻撃します");
			break;
		case 2:
			System.out.println("防御します");
			break;
		case 3:
			System.out.println("道具を使います");
			break;
		default:
			System.out.println("コマンドがありません");
		}
	}

	void checkPurchase(int price) {
		if (money >= price) {
			System.out.println("購入できます");
		} else {
			System.out.println("所持金が足りません");
		}
	}
	
	void attack(int enemyDefense) {
		int damage = attackPower - enemyDefense;
		System.out.println("敵に" + damage + "ダメージ");
	}

}
