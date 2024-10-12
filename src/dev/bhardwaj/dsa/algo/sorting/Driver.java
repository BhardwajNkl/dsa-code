package dev.bhardwaj.dsa.algo.sorting;

public class Driver {
	public static void main(String args[]) {
		
		CyclicSort cs = new CyclicSort();

//		int arr[] = {3,6,1,2,10,8,5,9,7,4};
//		cs.sort(arr);
//		System.out.println(Arrays.toString(arr));
//		
		
		// 4,0,2,1
		int nums[] = {0,4,2,3,7,5,1};
		System.out.println(cs.missing1(nums));
		System.out.println(cs.missing1(nums));

	}
}
