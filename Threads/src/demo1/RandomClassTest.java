package demo1;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RandomClassTest {
	private Random random = new Random();
	
	public void printRandom()
	{
		System.out.println(random.nextInt(100));
	}
	
	public static void main(String[] args) {
		
		RandomClassTest rct = new RandomClassTest();
		for(int i=0;i<30;i++)
		{
			rct.printRandom();
		}
	}
}
