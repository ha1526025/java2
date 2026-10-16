
public class Student {

	String name;
	int score;
	static String department = "環境情報";
	
	Student(String name,int score){
		this.name = name;
		this.score = score;
	}
	
	void showInfo() {
		System.out.println(Student.department + "学科の"
				+ this.name + "さん：" + this.score + "点");
	}
}
