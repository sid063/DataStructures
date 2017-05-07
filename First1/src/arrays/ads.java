package arrays;

import java.util.Scanner;
import java.util.Random;

public class ads {

	//The input to your solution will be passed in as String[] args
	       public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			String matchTiming = sc.next();
			
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
			
	}
}
