package arrays;

public class segregate0sAnd1s {
	public static void main(String[] args) {
		//int[] a = {0,1,1,0,0,0,0,1,1,1,0,0,1,0,1};
		int[] a = {1,1,1,1,1,1,1,0,0,0,0,0,0,0};
		
		printArray(a);
		segregate(a);
		printArray(a);
	}

	public static void printArray(int[] a) {
		for(int i=0;i<a.length;i++)
			System.out.print(a[i]+" ");
		System.out.println();
	}

	private static void segregate(int[] a) {
		int low = 0;
		int high = a.length-1;
		
		while(low<high)
		{
			while(a[low]==0)
				low++;
			
			while(a[high]==1)
				high--;
			
			if(low<high)
			{
				int temp = a[low];
				a[low] = a[high];
				a[high]=temp;
				low++;
				high--;
			}
		}
	}
}
