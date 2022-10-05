package Assignment1Final;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class LemonFactoryFinal implements GroceryProductFactoryFinal{
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
		Scanner search = new Scanner(new File("/Volumes/University/NewEclipse/Architecture/src/Assignment1Final/LemonProducts.txt"));
		while (search.hasNext()) {
			String LemonLine = search.nextLine();
			if (LemonLine.contains(toFind)) {
				
				return LemonLine;
			}
			
		}
		System.out.println("There is no lemon product with that ID");
		return null;
	}
	
}
