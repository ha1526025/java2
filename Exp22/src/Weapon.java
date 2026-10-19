
public class Weapon {

	private String name;
	private int attackPower;
	
	Weapon(String name,int attackPower){
		this.name = name;
		this.attackPower = attackPower;
	}
	
	public String getName() {
		return this.name;
	}
	
	public int getAttackPower() {
		return this.attackPower;
	}
}
