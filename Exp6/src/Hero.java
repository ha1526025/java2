
public class Hero {
	String name;
	int hp;
	int mp;
	int attackPower;

	void encourage() {
		System.out.println("今日も元気に鳥の巣討伐！");
	}

	void introduce() {
		System.out.println("私は勇者" + name + "！");
	}

	void attack() {
		int damage = attackPower + 5;
		System.out.println(name + "の攻撃\n" + damage + "ダメージを与えた！");
	}

	void magicAttack() {
		mp -= 2;
		int damage = attackPower * 3;
		System.out.println(name + "の魔法攻撃\n" + damage + "ダメージ与えた！");
	}
	void heal() {
		hp += 10;
		System.out.println("HPが10回復した！");
	}
	void levelUp() {
		hp += 5;
		mp += 2;
		attackPower += 3;
		System.out.println("レベルアップ！");
		System.out.println("HPが5上がった！");
		System.out.println("MPが2上がった！");
		System.out.println("攻撃が3上がった！");
		System.out.println("現在のステータス");
		System.out.println("HP:" + hp);
		System.out.println("MP:" + mp);
		System.out.println("攻撃：" + attackPower);
	}

}
