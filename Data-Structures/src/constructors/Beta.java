package constructors;

import java.util.Collection;
import java.util.Iterator;

public class Beta extends Baap{

	public Beta() {
		System.out.println("This const.");
	}
	
	public void betaProperty1()
	{
		
	}
	
	public void betaProperty2()
	{
		
	}

	public static void main(String[] args) {
		Beta test = new Beta();
		Baap test2 = new Baap();
		Baap test3 = new Beta();
		//Beta test4 = new Baap(); because it is useless. beta already has access to all property.
	}
}
