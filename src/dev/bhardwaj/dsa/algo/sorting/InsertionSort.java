package dev.bhardwaj.dsa.algo.sorting;

public class InsertionSort {
	public void sort(int arr[]) {
		
		
		
		// array is sorted in parts. the first entry from unsorted part is picked and fit in the sorted part.
		// start the process from index 1 considering the previous part[index 0] sorted.
		for(int i=1;i<arr.length;i++) {

			for(int j=i;j>0;j--) {
				// if item at j is smaller than it's previous item, swap and keep going. But if item at j is already greater no need to go back, just break.
				if(arr[j]<arr[j-1]) {
					// swap
					int temp = arr[j-1];
					arr[j-1] = arr[j];
					arr[j] = temp;
				} else {
					break;
				}
			}
		}
	}
}
