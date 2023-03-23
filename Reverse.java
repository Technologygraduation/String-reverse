package org.string.com;

public class Reverse {
	public static void main(String[] args) {
		
		String S = "Welcome";
		String rev = "emocleW";
		for(int i = S.length()-1;i>=0;i--) {
			char C= S.charAt(i);
			rev = rev+C;
		
			
		}
		
		System.out.println(rev);
	}

}
