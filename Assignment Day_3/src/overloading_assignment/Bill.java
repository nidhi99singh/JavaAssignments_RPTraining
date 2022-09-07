package overloading_assignment;

public class Bill {

	public int findPrice(int itemId) {
		if(itemId==1001) {
			return 25;
		}
		if(itemId==1002) {
			return 20;
		}
		if(itemId==1003) {
			return 23;
		}
		if(itemId==1004) {
			return 18;
		}
		return 0;
	}
	public int findPrice(String brandName, String itemType, int size) {
		if(brandName=="Puma"&& itemType=="tshirt"&& (size==34 || size==36)) {
			return 25;
		}

		if(brandName=="Puma"&& itemType=="skirt"&& (size==38 || size==40)) {
			return 20;
		}
		if(brandName=="Reebok"&& itemType=="tshirt"&& (size==34 || size==36)) {
			return 23;
		}
		if(brandName=="Reebok"&& itemType=="skirt"&& (size==38 || size==40)) {
			return 18;
		}
		return 0;
		
	}
}
