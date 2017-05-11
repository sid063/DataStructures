package hashmap.implementation;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class asdas {
	public static void main(String[] args) {
		Map<Integer,String> hmap = new HashMap<Integer,String>();
	      hmap.put(10,"Sid10");
	      hmap.put(10,"Sid11");
	      hmap.put(10,"Sid14");
	      hmap.put(12,"Sid12");
	      hmap.put(13,"Sid13");
	      
	      Set set = hmap.entrySet();
	      
	      Iterator it = set.iterator();
	      
	      while(it.hasNext())
	      {
	    	  Map.Entry mentry = (Entry) it.next();
	    	  System.out.println("Key: "+mentry.getKey()+" Value: "+mentry.getValue());
	      }
	}
}
