package dev.bhardwaj.dsa.algo.searching;
/**
 * 
 * @author nikhilbhardwaj01
 * Implements the linear search algorithm
 */
public class LinearSearch {
	/**
	 * 
	 * @param arr: the array
	 * @param key: the element that you want to search
	 * @return: the index of the element if found, else -1;
	 */
	public int search(int arr[], int key) {
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==key) return i;
		}
		
		return -1;
	}
	
	/**
	 * 
	 * @param token: the string
	 * @param key: the character that needs to be searched
	 * @return: the index of the character if found, else -1
	 */
	public int characterSeachInString(String token, char key) {
		for(int i=0;i<token.length();i++) {
			if(token.charAt(i)==key) return i;
		}
		
		return -1;
	}
}
