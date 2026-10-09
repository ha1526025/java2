
public class Student {

	String name;
	String studentNumber;
	int score;
	
	Student(String name,String studentNumber,int score){
		this.name = name;
		this.studentNumber = studentNumber;
		this.score = score;
	}
	
	void showProfile() {
		System.out.println("名前：" + this.name);
		System.out.println("学籍番号：" + this.studentNumber);
		System.out.println("成績：" + this.score + "点");
	}
}
