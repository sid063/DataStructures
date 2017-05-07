package arrays;

import java.util.Random;
import java.util.Scanner;

import sorting.quickSort;

public class pythagoric_triplet {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String status = sc.next();
		
		String[] statusArray = status.split(",");
		
		String weather = statusArray[0];
		String time = statusArray[1];

		System.out.println("Weather: "+weather+" and Time: "+time);
		Random rad = new Random();
		
		//which team wins the toss.
		// 0 = Lengaburu
		// 1 = Enchai
		int team = rad.nextInt(2);
		
		//what the winning team decides to do.
		// 0 = Bat
		// 1 = Bowl
	    int toss = rad.nextInt(2);
		
		if(team==0)
		    System.out.print("Lengaburu wins the toss ");
		else
		    System.out.print("Enchai wins the toss ");
		
		if(toss==0)
		    System.out.println("and decides to Bat");
		else
		    System.out.println("and decides to Bowl.");		
		
		

		int a[] = { 3, 1, 4, 6, 5 };
		int x, y, z;
		boolean isTriplet = false;
		quickSort.printArray(a);
		quickSort.sort(a, 0, a.length - 1);
		quickSort.printArray(a);

		for (int j = (a.length - 1); j > 2; j--) {
			x = a[j];
			y = a[j - 1];
			z = a[j - 2];
			if (x * x == (y * y + z * z)) {
				System.out.println("true");
				System.out.println("Triplet is: " + x + " " + y + " " + z);
				isTriplet = true;
			}
		}

		if (!isTriplet)
			System.out.println("There is no triplet.");

	}
}
