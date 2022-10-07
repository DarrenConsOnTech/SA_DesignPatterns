
public class OrangeFactory extends GroceryProductFactory {

	@Override
	Product getProduct(String type) {
		if(type.equalsIgnoreCase("Blood")) {
			return new BloodOrange("Blood");
		}
		else if(type.equalsIgnoreCase("Navel")) {
			return new NavelOrange("Navel");
		}
		else {
			return null;
		}
	}

}
