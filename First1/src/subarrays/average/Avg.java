package subarrays.average;


public class Avg {
	public static void main(String[] args) {
		int[] arr1 = {1, 5, 7, 2, 0};
		int avg=0;
		int sum = 0;
		for(int i=0;i<arr1.length;i++)
		{
			sum = sum+arr1[i];
		}
		
		avg = sum/arr1.length;
		System.out.println("Sum :"+sum+"; Avg: "+avg);
		findSubarrays(arr1, avg);
	}

	private static void findSubarrays(int[] arr1, int avg) {
		
	}
}
