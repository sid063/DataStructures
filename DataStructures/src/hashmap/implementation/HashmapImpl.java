package hashmap.implementation;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashmapImpl extends Thread{
	
	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(10, "Sid10");
		map.put(11, "Sid11");
		map.put(12, "Sid12");
		map.put(13, "Sid13");
		
		Set<?> set = map.entrySet();
		Iterator<?> it = set.iterator();
		
		while(it.hasNext())
		{
			Map.Entry<Integer, String> mentry = (Entry<Integer, String>) it.next();
			System.out.println("Key: "+mentry.getValue()+" Value: "+mentry.getValue());
		}
		
}
}

class testing
{
	public static void main(String[] args) {
		HashmapImpl hmi = new HashmapImpl();
	}
}
