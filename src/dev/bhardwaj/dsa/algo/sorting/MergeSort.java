package dev.bhardwaj.dsa.algo.sorting;

import java.util.Arrays;

public class MergeSort {
	public int[] sort(int arr[]) {
		if(arr.length<=1) return arr;
		
		int start = 0;
		int end = arr.length-1;
		int mid = end/2;
		// two subarrays. left[from start-mid inclusive] and right[mid+1 to end inclusive]
		int[] left = Arrays.copyOfRange(arr, start, mid+1); // passing mid+1 because this method's end parameter is excluded.
		int[] right = Arrays.copyOfRange(arr, mid+1, end+1); // passing end+1 for the reason same as above.
		
//		System.out.println(Arrays.toString(arr));
//		System.out.println(Arrays.toString(left));
//		System.out.println(Arrays.toString(right));
//		System.out.println("====");
		
		// recursive calls on the parts
		left = sort(left);
		right = sort(right);
		
		
		
		// merge these two sorted parts and return
		return merge(left, right);
	}
	
	private int[] merge(int first[], int second[]) {
		int result[] = new int[first.length+second.length];
		int i=0; // first array pointer
		int j=0; //second array pointer
		int k=0; //result array pointer
		
		while(i<first.length && j<second.length) {
			if(first[i]<=second[j]) {
				result[k] = first[i];
				i++;
			} else {
				result[k] = second[j];
				j++;
			}
			k++;
		}
		
		// one array may still have some elements remaining. we dont know which. let's code for both cases.
		while(i<first.length) {
			result[k]=first[i];
			i++;
			k++;
		}
		
		while(j<second.length) {
			result[k] = second[j];
			k++;
			j++;
		}
		
		return result;
	}
	
	public void sortInPlace(int arr[], int start, int end) {
		if(end<=start) return;
		
		int mid = (start+end)/2;
		
		// sort the parts recursively
		sortInPlace(arr, start, mid);
		sortInPlace(arr, mid+1, end);
		
		// merge the parts
		mergeInPlace(arr, start, mid, end);
		
	}
	
	private void mergeInPlace(int[] arr, int start, int mid, int end) {
		// we will actually create a new array for holding the merged result.
		
		// and then in the end just copy the result back to original array, that's how we are making it in-place.
		
		int result[] = new int[end-start+1];
		int i= start; // pointer on left array
		int j= mid+1; // pointer on right array
		int k=0; // pointer on result;
		
		while(i<=mid && j<=end) {
			if(arr[i]<=arr[j]) {
				result[k++] = arr[i++];
			} else {
				result[k++] = arr[j++];
			}
		}
		
		while(i<=mid) {
			result[k++] = arr[i++];
		}
		
		while(j<=end) {
			result[k++] = arr[j++];	
		}
		
		// copy back from result to original array. caution: only the part under consideration. from start-end
		for(int p=0;p<result.length;p++) {
			arr[start+p] = result[p];
		}
	}
}
