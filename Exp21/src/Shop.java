
public class Shop {

	String shopName;
	static int shopCount = 0;
	
	Shop(String shopName){
		this.shopName = shopName;
		Shop.shopCount++;
	}
	
	static void showShopCount() {
		System.out.println("店舗数："+Shop.shopCount);
	}
	
	static void showShopName() {
		System.out.println("店舗数："+Shop.shopName);
	}
	
	void shopInfo() {
		System.out.println("店舗名："+ this.shopName);
		System.out.println("現在の店舗数："
				 + Shop.shopCount + "店");
	}
}
