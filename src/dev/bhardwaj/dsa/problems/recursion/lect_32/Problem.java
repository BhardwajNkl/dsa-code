package dev.bhardwaj.dsa.problems.recursion.lect_32;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Problem {
	public static void main(String args[]) {
		// p1
//		System.out.println(removeCharFromString("nikhil",'i'));
//		System.out.println(removeCharResursionStyle2("ramesh", 'e'));
		
		// p2
//		System.out.println(subsetsOfString("abc"));
//		subsetPrint("tom");
		System.out.println(subsetListReturn("rat"));
		
	}
	
	// problem 1
	private static String removeCharFromString(String str, char ch) {
		// without recursion
//		String res="";
//		for(int i=0;i<str.length();i++) {
//			if(str.charAt(i)==ch) continue;
//			res = res+str.charAt(i);
//		}
//		return res;
		
		
		// recursive
		if(str.length()==0) {
			return str;
		}
		
		if(str.charAt(0)==ch) {
			return removeCharFromString(str.substring(1), ch);
		}else {
			return ""+str.charAt(0)+removeCharFromString(str.substring(1), ch);
		}
		
		
	}
	
	private static String removeCharResursionStyle2(String str, char ch) {
		return helper1(str, ch, ""); // initially ans=""
	}
	
	private static String helper1(String str, char ch, String ans) {
		if(str.length()==0) {
			return ans;
		}
		if(str.charAt(0)!=ch) {
			ans = ans+str.charAt(0);
		}
		return helper1(str.substring(1), ch, ans);
	}
	
	
	// p2: all subsets of a string: "abc"=["a","b","c","ab","ac",...]
	static Set<String> subsetsOfString(String str) {
		Set<String> ans = new HashSet<>();
		ans.add("");
		return helper2(str, ans);
	}
	
	static Set<String> helper2(String str, Set<String> ans) {
		if(str.length()==0) {
			return ans;
		}
		
		// two cases for char at 0
		// 1. append it on all existing entries, or 2. not append it.
		
		// not append is not required to code explicitly. just append case needs coded.
		Set<String> newEntries = new HashSet<>();
		for(String s: ans) {
			// append
			s = s+str.charAt(0);
			newEntries.add(s);
		}
		ans.addAll(newEntries);
		return helper2(str.substring(1), ans);
	}
	
	
	
	// subset printer: just prints
	static void subsetPrint(String str) {
		subsetPrintHelper(str, "");
	}
	
	static void subsetPrintHelper(String remainingPart, String ans) {
		// subset forms by including/or not including a character and going till last character of string.
				// so we print when string remainingpart is not there
		if(remainingPart.isEmpty()) {
			System.out.print(ans+", ");
			return;
		}
		
		// take the character and call
		subsetPrintHelper(remainingPart.substring(1), ans+remainingPart.charAt(0));
		
		// without taking call
		subsetPrintHelper(remainingPart.substring(1), ans);
	}
	
	// subset printer: just prints
		static ArrayList<String> subsetListReturn(String str) {
			return subsetListReturnHelper(str, "");
		}
		
		static ArrayList<String> subsetListReturnHelper(String remainingPart, String ans) {
			// subset forms by including/or not including a character and going till last character of string.
					// so we print when string remainingpart is not there
			if(remainingPart.isEmpty()) {
				// the answer is a subset, let's return it in a list
				ArrayList<String> ls = new ArrayList<>();
				ls.add(ans);
				return ls;
			}
			
			// take the character and call. It will return all subsets that are formed by including this character
			ArrayList<String> leftAnswer = subsetListReturnHelper(remainingPart.substring(1), ans+remainingPart.charAt(0));
			
			// without taking call
			ArrayList<String> rightAnswer =subsetListReturnHelper(remainingPart.substring(1), ans);
		
			// return both the answers merged. let's merge right in the left answers.
			leftAnswer.addAll(rightAnswer);
			return leftAnswer;
		}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
