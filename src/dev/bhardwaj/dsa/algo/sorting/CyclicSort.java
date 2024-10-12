package dev.bhardwaj.dsa.algo.sorting;

public class CyclicSort {
	public void sort(int arr[]) {
		int i=0;
		while(i<arr.length) {
			// fix i. how? as long as it is not holding the value i+1, it needs swap.
			while(arr[i]!=i+1) {
				int val=arr[i];
				
				// val should go on index val-1, so swap i and val-1
				arr[i] = arr[val-1];
				arr[val-1] = val;
			}
			i++;
		}
	}
	
	
	public int missing1(int arr[]) {
		int n = arr.length;
		
		// array should have 0 to n numbers, but 1 number is missing.
		
		int i=0;
		while(i<n) {
			if(arr[i]!=i) {
				// swap with correct position of the value at i
				int temp = arr[i];
				
				// correct index of temp should be equal to 'temp'
				int tempIndex = temp;
				
				// but this index may be beyond the limit, so in that case put it to last index.
				if(tempIndex==arr.length) {
					tempIndex--;
					if(tempIndex==i) return i; // why? because, we are saying i is not fixed, but when going to fix it we get the same index for swap[because of limit exceed], this means we are at the last index and the value for this index is missing.
				}
				
				arr[i]=arr[tempIndex];
				arr[tempIndex] = temp;
			} else {
				i++;
			}
		}
		
		return n;
	}
	
	// easy than above
	public int missing2(int arr[]) {
		int n = arr.length;
		
		// array should have 0 to n numbers, but 1 number is missing.
		
		int i=0;
		while(i<n) {
			if(arr[i]!=i) {
				// swap with correct position of the value at i
				int val = arr[i];
				// correct index of va should be equal to 'val'. ignore if the index to swap is outside the range.			
				if(val<n) {
					arr[i]=arr[val];
					arr[val] = val;	
				}
			} else {
				i++;
			}
		}
		
		// by now, we have sorted the elements. just need to search the missing one, so go linearly.
		i=0;
		while(arr[i]==i) {
			i++;
		}
		
		if(i==n) {
			// the above while loop run for each index and thus every value existed. thus, the missing one is n.
			return n;
		}
		
		// otherwise, for some i, the check failed, that means that this 'i' was missing.
		return i;
	}
}
