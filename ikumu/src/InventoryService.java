
public class InventoryService {

	private final String productName;
	private int stock;

	public InventoryService(String productName, int stock) {
		if (productName == null || productName.isBlank()) {
			throw new IllegalArgumentException("商品名を入力してください");
		}

		if (stock < 0)

		{
			throw new IllegalArgumentException("在庫数をマイナスにはできません");
		}

		this.productName = productName;
		this.stock = stock;
	}

	public void sell(int quantity) {
		if (quantity <= 0) {
			throw new IllegalArgumentException("販売数は1以上にしてください");
		}

		if (quantity > stock) {
			throw new IllegalStateException("在庫が不足しています。現在の在庫：" + stock);
		}
		stock -= quantity;
		System.out.println(productName + "を" + quantity + "個販売しました");
	}

	public void showStock() {
		System.out.println(productName + "の現在の在庫；" + stock);
	}
}
