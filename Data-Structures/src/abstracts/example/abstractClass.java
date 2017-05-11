package abstracts.example;

public class abstractClass implements if1{
	//int i=30;
	
	public static void main(String[] args) {
		System.out.println("Main");
		abstractClass ab = new abstractClass();
		System.out.println("Value of i: "+ab.i);
	}
}

abstract class impl {
	int implValue;
	int i=20;
	
	public impl(int value) {
		implValue = value;
	}

	public void display() {
		System.out.println("Value: " + implValue);
	}
}

interface if1
{
	int i=10;
}

