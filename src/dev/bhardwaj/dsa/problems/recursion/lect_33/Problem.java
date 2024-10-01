package dev.bhardwaj.dsa.problems.recursion.lect_33;

public class Problem {
	public static void main(String args[]) {
		printPermutations("abc");
	}
	
	static void printPermutations(String str) {
		printPermutationHelper(str, "");
	}
	
	static void printPermutationHelper(String remaining, String perm) {
		if(remaining.isEmpty()) {
			System.out.println(perm);
			return;
		}
		
		char ch = remaining.charAt(0);
		for(int i=0;i<=perm.length();i++) {
			String left = perm.substring(0,i);
			String right = perm.substring(i, perm.length());
			printPermutationHelper(remaining.substring(1), left+ch+right);
		}
		
	}
	
}

