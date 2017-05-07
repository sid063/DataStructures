package arrays;

import java.util.LinkedHashMap;
import java.util.Map;

public class FirstRepeatingElt {
	public static void main(String[] args) {
		int a[] = { 10, 5, 3, 4, 6, 1, 6 };
		System.out.println("First repeating elt is: "
				+ ((getFirstRepElt(a) != null) ? getFirstRepElt(a) : "No repeating elt found"));
	}

	private static Integer getFirstRepElt(int[] a) {
		Map<Integer, Integer> map = new LinkedHashMap<Integer, Integer>();
		int value = 0;
		for (int i = 0; i < a.length; i++) {
			if (map.containsKey(a[i])) {
				map.put(a[i], map.get(a[i]) + 1);
			} else
				map.put(a[i], value);
		}
		Integer rep = null;
		for (Map.Entry<Integer, Integer> m : map.entrySet()) {
			System.out.println("Key: " + m.getKey() + " Value: " + m.getValue());
			if (m.getValue() > 0)
				rep = m.getKey();
		}

		return rep;
	}
}
