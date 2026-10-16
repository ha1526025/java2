
public class Exp20_3 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Student st1 = new Student("ハルト",85);
		Student st2 = new Student("ミナト",92);
		
		st1.showInfo();
		st2.showInfo();
		
		st1.department = "超！環境情報";
		
		st1.showInfo();
		st2.showInfo();
	}

}
