package practice;

public class Practice1 {
	public static void main(String[] args) {
		String s = "abc";
		perm(s, 0, s.length() - 1);
	}

	private static void perm(String s, int start, int end) {
		if(start==end)
			System.out.println(s);
		else
		{
			for(int i=start;i<=end;i++)
			{
				s = swap(s,i,start);
				perm(s, start+1, end);
				s = swap(s,i,start);
			}
		}
	}

	private static String swap(String s, int i, int j) {
		char[] c = s.toCharArray();
		char temp = c[i];
		c[i]=c[j];
		c[j]=temp;
		return String.valueOf(c);
	}
	

}
