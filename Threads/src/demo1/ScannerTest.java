package demo1;

import java.util.Scanner;


//To show that the program execution wont process from sc.nextLine() unless an input is entered.
public class ScannerTest {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Type stop to stop.....");
		while(!sc.nextLine().equalsIgnoreCase("stop"))
		{
			System.out.println("Continuing.......");
		}
	}
}
