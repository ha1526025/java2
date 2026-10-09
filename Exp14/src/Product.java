
public class Product {

	String name;
	
	Product(String name){
		this.name = name;
	}
	
	void showInfo() {
		System.out.println("商品名：" + this.name);
	}
}
