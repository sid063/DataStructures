package string;

import java.util.LinkedHashMap;
import java.util.Map;

public class firstNonRep {
	public static void main(String[] args) {

		String s = "hhhhhhhl";
		System.out.println("First non-rep char: " + getFirstNonRepChar(s));
	}

	private static Character getFirstNonRepChar(String s) {
		Character repChar = null;
		Map<Character, Integer> map = new LinkedHashMap<Character, Integer>();

		char[] ch = s.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			if (map.containsKey(ch[i])) {
				Integer val = map.get(ch[i]);
				map.put(ch[i], val + 1);
			} else {
				map.put(ch[i], 1);
			}
		}

		for (Map.Entry<Character, Integer> entry : map.entrySet()) {
			System.out.println("Key: " + entry.getKey() + " value: " + entry.getValue());
		}

		for (Map.Entry<Character, Integer> entry : map.entrySet()) {
			if (entry.getValue() == 1) {
				repChar = entry.getKey();
				break;
			}
		}
		return repChar;
	}

}
