package dev.bhardwaj.dsa.algo.sorting;
/**
 * 
 * @author nikhilbhardwaj01
 * Implements quick sort.
 * Uses mid point as pivot.
 */
public class QuickSort {
	public void sort(int arr[], int start, int end) {
		
		if(end<=start) {
			return;
		}
		
		int mid = (start+end)/2;
		int pivot = arr[mid];
		int low = start; // right end pointer used for checking if elements at the left end are greater than pivot
		int high = end; // left end pointer used for checking if elements at the right end are smaller than pivot
		
		while(low<=high) {
			// check for pivot property violation
			while(arr[low]<pivot) {
				low++;
			}
			
			while(arr[high]>pivot) {
				high--;
			}
			
			// at this point we have some value of low and high.
				// we need to swap. but caution: there may be a case when increment-decrement has actually broken the low<=high check. so we need to check it again.
			if(low<=high) {
				// swap
				int temp = arr[low];
				arr[low]=arr[high];
				arr[high]=temp;
				low++;
				high--;
			}
		}
		
		// the pivot is now at it's correct position. now recursively sort left and right parts.
		sort(arr, start, high); // the above while loop says that now low has crossed high. so the left part is from start-high and right part is from low-end
		sort(arr, low, end);
	}
}
