package Assignment1Final;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class Driver {
	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		String reply;
		
		do {
		
		System.out.println("Do you wish to create an Apple, Banana or a Lemon Product?");
		String answer = input.nextLine().toLowerCase();
		System.out.println("Enter the product ID (XXX)");
		String idnumber=input.nextLine();	
		
		if (answer.equals("apple")) {
			int Applenumber=Integer.parseInt(idnumber);
			AppleFactoryFInal apple = new AppleFactoryFInal();
			apple.CreateProduct(Applenumber);
			
		}
		else if(answer.equals("banana")) {
			int Banananumber=Integer.parseInt(idnumber);
			BananaFactoryFinal banana = new BananaFactoryFinal();
			banana.CreateProduct(Banananumber);
		}
		else if (answer.equals("lemon")) {	
			int Lemonnumber=Integer.parseInt(idnumber);
			LemonFactoryFinal lemon = new LemonFactoryFinal();
			lemon.CreateProduct(Lemonnumber);
		}
		else {
			System.out.println("Invalid Product ID, do you wish to enter another id number? (Y/N)");
		}
		
		System.out.println("Do you wish to create another product? (Y/N)");
		reply = input.nextLine().toUpperCase();
		
		}while (reply.equals("Y"));
		
		input.close();

	}

}
