package Assign1;
import java.util.*;
import java.io.*;

public class TestDriver {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.println("Do you wish to create an Apple, Banana or a Lemon Product?");
		String answer = input.nextLine().toLowerCase();
		
		if (answer.equals("apple")) {
			System.out.println("Enter the product ID (XXX)");
			String idnumber=input.nextLine();
			int Applenumber=Integer.parseInt(idnumber);
			AppleFactory apple = new AppleFactory();
			apple.CreateProduct(Applenumber);
		}
		else if(answer.equals("banana")) {
			System.out.println("Enter the product ID (XXX)");
			String idnumber=input.nextLine();
			int Banananumber=Integer.parseInt(idnumber);
			BananaFactory banana = new BananaFactory();
			banana.CreateProduct(Banananumber);
		}
		else if (answer.equals("lemon")) {
			System.out.println("Enter the product ID (XXX)");
			String idnumber=input.nextLine();
			int Lemonnumber=Integer.parseInt(idnumber);
			LemonFactory lemon = new LemonFactory();
			lemon.CreateProduct(Lemonnumber);
		}
		else {
			System.out.println("Invalid Product ID, do you wish to enter another id number? (Y/N)");
		}

	}

}
