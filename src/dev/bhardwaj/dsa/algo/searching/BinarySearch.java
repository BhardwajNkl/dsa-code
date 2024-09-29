package dev.bhardwaj.dsa.algo.searching;

/**
 * 
 * @author nikhilbhardwaj01
 * Implements the binary search algorithm
 */
public class BinarySearch {
	/**
	 * 
	 * @param arr: the sorted(ascending) array.
	 * @param key: the element that you want to search
	 * @return: the index of the element if found, else -1;
	 */
	public int search(int arr[], int key) {
		int low = 0;
		int high = arr.length-1;
		while(low<=high) {
			// int mid = (low+high)/2; // this is not safe for large values of 'low' and 'high' as there may be overflow.
			int mid = low + (high-low)/2; // this is actually the same as above[if you solve the sum, you will get the same]. just a different way of calculation to avoid the overflow.
			if(key<arr[mid]) {
				high = mid-1;
			} else if(key>arr[mid]) {
				low = mid+1;
			} else {
				return mid;
			}
		}
		
		return -1;
	}
	
	/**
	 * 
	 * @param arr: the sorted(can be in any order) array. 
	 * @param key: the element that you want to search
	 * @return: the index of the element if found, else -1;
	 */
	public int orderAgnosticSearch(int arr[], int key) {
		// we need to check th array order first.
		boolean isAscending = false;
		if(arr[arr.length-1]>=arr[0]) {
			isAscending = true;
		}
		
		int low = 0;
		int high = arr.length-1;
		
		while(low<=high) {
			// int mid = (low+high)/2; // this is not safe for large values of 'low' and 'high' as there may be overflow.
			int mid = low + (high-low)/2; // this is actually the same as above[if you solve the sum, you will get the same]. just a different way of calculation to avoid the overflow.
			if(key<arr[mid]) {
				if(isAscending) {
					high = mid-1;
				} else {
					low = mid+1;
				}
			} else if(key>arr[mid]) {
				if(isAscending) {
					low = mid+1;
				} else {
					high = mid-1;
				}
			} else {
				return mid;
			}
		}
		
		return -1;
	}
}

