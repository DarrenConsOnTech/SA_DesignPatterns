package Assign1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class AppleFactory implements GroceryProductFactory{

	@Override
	public void CreateProduct(int id) throws FileNotFoundException {
		// TODO Auto-generated method stub
		String toFind=String.valueOf(id);
		getPrice(toFind);
		
	}

	private String getPrice(String toFind) throws FileNotFoundException{
		// TODO Auto-generated method stub
		Scanner search = new Scanner(new File("/Volumes/University/NewEclipse/DesignandArchitecture/src/Assign1/AppleProducts.txt"));
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



/* 

public String GetID(String StringtoFind) throws FileNotFoundException{
		Scanner search = new Scanner(new File("/Users/Ram/Desktop/ProductInfo.txt"));
		while (search.hasNext()) {
			String line = search.nextLine().toLowerCase().toString();
			if(line.contains(StringtoFind)) {
				return line;
			}
		}
		
		return null;
	}

*/