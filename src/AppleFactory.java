
public class AppleFactory extends GroceryProductFactory {

	@Override
	Product getProduct(String type) {
		if(type.equalsIgnoreCase("Fuji")) {
			return new FujiApple("Fuji");
		}
		else if(type.equalsIgnoreCase("McIntosh")) {
			return new McIntoshApple("McIntosh");
		}
		else {
			return null;
		}
	}
	
}
