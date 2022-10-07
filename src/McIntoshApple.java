import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class McIntoshApple implements Product {

	private String name;
	private float price;
	
	public McIntoshApple(String name) {
		this.name = "McIntosh Apple";
		setPrice(name);
	}

	@Override
	public void setPrice(String name) {
		// TODO Auto-generated method stub
		
		Scanner search = null;
		try {
			search = new Scanner(new File("src/Database.txt"));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		while (search.hasNext()) {
			String DatabaseLine = search.nextLine();
			if (DatabaseLine.contains(name)) {
				String[] line = DatabaseLine.split(",", 2);
				this.price = (Float.parseFloat(line[1]));  
			}
		}
	}

	@Override
	public float getPrice() {
		// TODO Auto-generated method stub
		return this.price;
	}
	
	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return this.name;
	}

}
