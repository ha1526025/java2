
public class Exp22_1 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Weapon weapon = new Weapon("はがねのつるぎ",18);
		Hero hero =new Hero("いくむ",12,weapon);
		
		hero.showWeapon();
		hero.attack();
	}

}
