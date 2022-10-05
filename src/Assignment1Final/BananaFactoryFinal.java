package Assignment1Final;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class BananaFactoryFinal implements GroceryProductFactoryFinal{

	@Override
	public void CreateProduct(int id) throws FileNotFoundException {
		// TODO Auto-generated method stub
		String toFind=String.valueOf(id);
		getPrice(toFind);
		System.out.println("ID	Name	Price");
		System.out.println(getPrice(toFind));
		
	}

	private String getPrice(String toFind) throws FileNotFoundException{
		// TODO Auto-generated method stub
		Scanner search = new Scanner(new File("src/Assignment1Final/BananaProducts.txt"));
		while (search.hasNext()) {
			String BananaLine = search.nextLine();
			if (BananaLine.contains(toFind)) {
				
				return BananaLine;
			}
			
		}
		System.out.println("There is no banana product with that ID");
		return null;
	}

}
