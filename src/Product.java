import java.io.FileNotFoundException;

public interface Product {
	void setPrice(String name) throws FileNotFoundException;
	float getPrice();
	String getName();
}
