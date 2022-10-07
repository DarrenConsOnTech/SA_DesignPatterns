import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Driver {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		FactoryProducer factoryProducer = new FactoryProducer();
		String loop;
		int counter = 0;
		
		
		
		System.out.print("How many products will you be creating today?: ");
		String numProd = input.nextLine();
		Product[] p = new Product [Integer.parseInt(numProd)];
		
		for(int i = 0; i < Integer.parseInt(numProd); i++) {
			System.out.print("Do you wish to create an [Apple] or [Orange] product?: ");
			String typeOfFactory = input.nextLine();
			
			GroceryProductFactory factory = factoryProducer.getFactory(typeOfFactory);
			
			if(typeOfFactory.equalsIgnoreCase("Apple")) {
				System.out.print("Do you wish to create a [Fuji] or [McIntosh] Apple product?: ");
			}
			else {
				System.out.print("Do you wish to create a [Navel] or [Blood] Orange product?: ");
			}
			
			String specificProduct = input.nextLine();
			
			p[counter] = (factory).getProduct(specificProduct);
			
			System.out.println("\nProduct Created: " + p[counter].getName() + " $" + p[counter].getPrice());
			
			System.out.println();
			counter++;
		}
		
		System.out.println("Below is a list of all the products you have created:");
		
		for(int i = 0; i < counter; i++) {
			System.out.println("-->" + p[i].getName() + " $" + p[i].getPrice());
		}
		
		System.out.println("\nHave a nice day!");
			
		input.close();
		

	}

}
