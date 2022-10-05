package Assignment1Final;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class AppleFactoryFInal implements GroceryProductFactoryFinal{
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
		Scanner search = new Scanner(new File("/Volumes/University/NewEclipse/Architecture/src/Assignment1Final/AppleProducts.txt"));
		while (search.hasNext()) {
			String AppleLine = search.nextLine();
			if (AppleLine.contains(toFind)) {
				return AppleLine;
			}
			
		}
		System.out.println("There is no apple product with that ID");
		return null;
	}
	
}
