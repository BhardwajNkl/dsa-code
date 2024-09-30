package dev.bhardwaj.dsa.problems.binary_search;

public class Problem {
	
	
	public static void main(String args[]) {
		Problem p = new Problem();
		
		// 1. ceiling and 2. floor number
		int arr[] = {2,3,5,9,14,16,18};
		int target= 14;
		
//		System.out.println("ceiling: "+p.ceilingNumber(arr, target));
//		System.out.println("floor: "+p.floor(arr, target));
		
		// 3. search in infinite sorted array
		System.out.println(p.searchInInfiniteSortedArray(arr, target));

		
	}
	
	
	/**
	 * @param arr: sorted array
	 * @param target:the value whose ceiling you want to find
	 * @return the ceiling number[smallest number greater than or equal to the given number] of target.
	 */
	private int ceilingNumber(int arr[], int target) {
		// simple linear search
//		int ans = 0;
//		for(int a: arr) {
//			if(a>=target) {
//				ans = a;
//				break;
//			}
//		}
//		
//		return ans;
		
		// binary search: ya to target mil jaayega. ya low>high ho jaayega. and ham low ko return kar denge. because that is exactly the first greater than the target.
		int low = 0;
		int high = arr.length-1;
		while(low<=high) {
			int mid = low + (high-low)/2;
			if(target<arr[mid]) {
				high=mid-1;
			} else if(target>arr[mid]) {
				low=mid+1;
			} else {
				return target;
			}
		}
		
		// edge case: when target is greater than the greatest element. to check this we can use array index, if it is outside means the case has happened.
		if(low>=arr.length) return Integer.MAX_VALUE;
		return arr[low];
	}
	
	/**
	 * @param arr: sorted array
	 * @param target:the value whose floor you want to find
	 * @return the floor number[greatest number less than or equal to the given number] of target.
	 */
	private int floor(int arr[], int target) {
		int low = 0;
		int high = arr.length-1;
		while(low<=high) {
			int mid = low + (high-low)/2;
			if(target<arr[mid]) {
				high=mid-1;
			} else if(target>arr[mid]) {
				low=mid+1;
			} else {
				return target;
			}
		}
		
		// edge case: when target is smaller than the smallest element. to check this we can use array index, if it is outside means the case has happened.
		if(high<0) return Integer.MIN_VALUE;
		return arr[high];
	}
	
	/**
	 * 
	 * @param arr: sorted array of infinite length[infinite:just assume. how? by not knowing the size.]
	 * @param target: the integer value to be searched.
	 * @return: the index of the element if found, else -1.
	 */
	private int searchInInfiniteSortedArray(int arr[], int target) {
		
		// we can apply binary search when we have low and high. but currently we do not have the 'high'
		// so the job is to find the range in which our element lies.
			// to do this we begin with 1 element range[index 0-0], if not in this range double the range size[index 1-2] and so on.
		
		// once we have the range, we can apply search
		
		int s = 0;
		int e=0;
		
		while(arr[e]<target) {
			int temp = s;
			s=e+1;
			e=e+(e-temp+1)*2;
		}
		
		// now we have a range, apply the search
				
		return rangeBSearch(arr, s, e, target);
	}
	
	// used by searchInInfiniteSortedArray
	private int rangeBSearch(int arr[], int low, int high, int target) {
		while(low<=high) {
			int mid = (low+high)/2;
			if(target<arr[mid]) {
				high=mid-1;
			} else if(target>arr[mid]) {
				low = mid+1;
			} else {
				return mid;
			}
		}
		
		return -1;
	}
}
