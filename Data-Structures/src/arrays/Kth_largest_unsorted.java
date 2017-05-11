package arrays;

/*
 * 	Input: arr[] = {7, 10, 4, 3, 20, 15}
    k = 3
	Output: 10
 */
/*
 * Using max heap to find the kth largest method.
 * Complexity:  O(kLogn)
 */
		
public class Kth_largest_unsorted {
	static int klargest = 0;
	static int k = 0;

	public static void main(String[] args) {
		int arr[] = { 7, 10, 15, 3, 20, 4 };
		// int arr[] = { 7, 10, 15 };
		k = 3;
		if (k > arr.length) {
			System.out.println("Array not large enough.");
			return;
		}

		findKthLargest(arr, k);
		System.out.println("Final kth largest: " + klargest);
	}

	// using max heap.
	private static void findKthLargest(int[] arr, int k) {
		int n = arr.length;
		k--;

		if (k >= 0) {
			for (int i = (n / 2 - 1); i >= 0; i--)
				heapify(arr, n, i);
			
			for (int i = n - 1; i >= 0; i--) {
				
				//This is the main logic for kth largest element.
				klargest = arr[0];
				System.out.println(klargest);
				k--;
				if (k < 0)
				{
					System.out.println("Breaking...");
					break;
				}
				//
				
				int temp = arr[i];
				arr[i] = arr[0];
				arr[0] = temp;
				heapify(arr, i, 0);
			}
		}
	}

	private static void heapify(int[] a, int n, int i) {
		int largest = i;
		int l = 2 * i + 1;
		int r = 2 * i + 2;

		if (l < n && a[l] > a[largest])
			largest = l;

		if (r < n && a[r] > a[largest])
			largest = r;

		if (largest != i) {
			int temp = a[i];
			a[i] = a[largest];
			a[largest] = temp;

			heapify(a, n, largest);
		}

	}
}
