package dev.bhardwaj.dsa.algo.sorting;

/**
 * 
 * @author nikhilbhardwaj01
 * Implements the bubble sort algorithm
 */
public class SelectionSort {
	public void sort(int arr[]) {
		// we find the smallest item in the whole array and swap with the first. start index is incremented and the process is repeated.
		for(int i=0;i<arr.length;i++) {
			// find smallest item index in range i to end and swap with item at i.
			int minIndex = indexOfSmallest(arr, i, arr.length-1);
			int temp = arr[i];
			arr[i] = arr[minIndex];
			arr[minIndex] = temp;
			
		}
	}
	
	private int indexOfSmallest(int arr[], int start, int end) {
		int minIndex = start;		
		for(int i=start+1;i<=end;i++) {
			if(arr[i]<arr[minIndex]) {
				minIndex = i;
			}
		}
		return minIndex;
	}
}
