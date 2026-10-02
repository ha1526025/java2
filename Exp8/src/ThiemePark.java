
public class ThiemePark {

	int admissionFee = 3000;
	int attractionPrice = 800;

	int calculateAdmissionFee() {
		return admissionFee;
	}

	int calculateAttractionFee(int count) {
		return attractionPrice * count;
	}

	int calculateFoodFee(String menu) {
		switch(menu) {
		case "カレー":
			return 900;
		case "ハンバーガー":
			return 700;
		case "フライドポテト":
			return 500;
		default:
			return 0;
		}
	}
}
