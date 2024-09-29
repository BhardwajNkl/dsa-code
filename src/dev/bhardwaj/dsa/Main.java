package dev.bhardwaj.dsa;

import java.util.Arrays;

import dev.bhardwaj.dsa.algo.searching.BinarySearch;
import dev.bhardwaj.dsa.algo.sorting.BubbleSort;
import dev.bhardwaj.dsa.algo.sorting.InsertionSort;
import dev.bhardwaj.dsa.algo.sorting.MergeSort;
import dev.bhardwaj.dsa.algo.sorting.QuickSort;
import dev.bhardwaj.dsa.algo.sorting.SelectionSort;

public class Main {
	
	public static void main(String args[]) {
		// 1. linear search demo
//		int arr[]= {4,2,9,10,6,11,20,17,24};
//		String token = "nikhil bhardwaj";
//		LinearSearch ls = new LinearSearch();
//		System.out.println(ls.search(arr, 100));
//		System.out.println(ls.characterSeachInString(token, 'y'));
		
		// 2. binary search demo
//		int arr2[]= {2,7,12,13,18,20,40,44,70,100};
//		int arr3[]= {40,34,30,18,12,10,7,4,1};
//		BinarySearch bs = new BinarySearch();
//		System.out.println(bs.search(arr2, 18));
//		System.out.println(bs.orderAgnosticSearch(arr3, 1));
		
		// 3. bubble sort demo
//		int arr4[]= {2,9,10,6,11,20,17,24};
//		BubbleSort bs1 = new BubbleSort();
//		bs1.sort(arr4);
//		System.out.println(Arrays.toString(arr4));
		
		// 3. bubble sort demo
//		int arr5[]= {2,9,10,6,11,20,17,24};
//		SelectionSort ss = new SelectionSort();
//		ss.sort(arr5);
//		System.out.println(Arrays.toString(arr5));
		
//		// 3. insertion sort demo
//		int arr6[]= {2,9,10,6,11,20,17,24,1};
//		InsertionSort is = new InsertionSort();
//		is.sort(arr6);
//		System.out.println(Arrays.toString(arr6));
		
//		// 4. quick sort demo
//		int arr7[]= {2,99,10,6,11,10,17,24,1};
//		QuickSort qs = new QuickSort();
//		qs.sort(arr7, 0, arr7.length-1);
//		System.out.println(Arrays.toString(arr7));
		
		// 4. quick sort demo
//		int arr8[]= {2,3,10,6,11,10,17,24,1};
//		MergeSort ms = new MergeSort();
//		int sorted[] = ms.sort(arr8);
//		System.out.println(Arrays.toString(sorted));
		int arr9[]= {2,22,10,6,11,17,24,1};
		System.out.println(Arrays.toString(arr9));
		MergeSort ms = new MergeSort();
		ms.sortInPlace(arr9, 0, arr9.length-1);
		System.out.println(Arrays.toString(arr9));

	}
}
