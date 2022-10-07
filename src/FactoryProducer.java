
public class FactoryProducer {
	public static GroceryProductFactory getFactory(String factory) {
		if(factory.equalsIgnoreCase("Apple")) {
			return new AppleFactory();
		}
		else if(factory.equalsIgnoreCase("Orange")) {
			return new OrangeFactory();
		}
		else {
			return null;
		}		
	}
}
