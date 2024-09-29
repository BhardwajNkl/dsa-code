package dev.bhardwaj.dsa.algo.sorting;

/**
 * 
 * @author nikhilbhardwaj01
 * Implements the bubble sort algorithm
 */
public class BubbleSort {
	public void sort(int arr[]) {
		// In each pass the largest element is moved towards end[it's correct position]. So, we need to run N passes for array of size N.
		for(int i=0;i<arr.length;i++) {
			// now, inside a pass, we check adjacent elements and swap if needed. However, the array may be sorted so there is no need to enter into the next pass[outer loop]. To check this we maintain a variable.
			boolean isSwapped = false;
			for(int j=1;j<arr.length-i;j++) {
				if(arr[j]<arr[j-1]) {
					int temp = arr[j];
					arr[j] = arr[j-1];
					arr[j-1] = temp;
					isSwapped=true;
				}
			}
			if(!isSwapped) break;
		}
	}
}
