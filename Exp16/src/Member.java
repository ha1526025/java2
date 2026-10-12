
public class Member {

	String name;
	int point;

	Member() {
		this("未登録");
	}

	Member(String name) {
		this(name,0);
	}

	Member(String name, int point) {
		this.name = name;
		this.point = point;
	}

	void showInfo() {
		System.out.println("会員名：" + this.name);
		System.out.println("ポイント数：" + this.point);
	}
}
