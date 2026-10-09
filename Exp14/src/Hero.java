
public class Hero {

	String name;
	String job;
	int level;
	int hp;
	int mp;
	
	Hero(String name, String job, int level, int hp, int mp){
		this.name = name;
		this.job = job;
		this.level = level;
		this.hp = hp;
		this.mp = mp;
	}
	void showStatus() {
		System.out.println("名前：" + this.name);
		System.out.println("職業：" + this.job);
		System.out.println("レベル：" + this.level);
		System.out.println("HP:" + this.hp);
		System.out.println("MP:" + this.hp);
	}
}